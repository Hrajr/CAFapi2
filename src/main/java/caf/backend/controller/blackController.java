package caf.backend.controller;

import caf.backend.logic.blackcardLogic;
import caf.backend.logic.model.entities.Blackcard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/blackcards")
public class blackController {
    private final blackcardLogic blackcardlogic;

    @Autowired
    public blackController(blackcardLogic blackcardlogic) {
        this.blackcardlogic = blackcardlogic;
    }

    @PostMapping
    public void addBlackcard(@NonNull @RequestBody Blackcard blackcard){
        blackcardlogic.addBlackcard(blackcard);
    }

    @GetMapping
    public Iterable<Blackcard> getAll(){
        return blackcardlogic.getAll();
    }

    @GetMapping(path = "{id}")
    public Blackcard getBlackcard(@PathVariable("id") Long id) throws Exception {
        return blackcardlogic.getBlackcard(id);
    }

    @GetMapping(path = "set/{text}")
    public Iterable<Blackcard> getSetWhitecards(@PathVariable("text") String set) throws Exception{
        return blackcardlogic.getSetBlackcards(set);
    }

    @GetMapping(path = "childlike")
    public Iterable<Blackcard> getSetWhitecards() throws Exception{
        return blackcardlogic.getChildlikeBlackcards();
    }

    @DeleteMapping(path = "{id}")
    public void deleteBlackcard(@PathVariable("id") Long id){
        blackcardlogic.deleteBlackcard(id);
    }

    @PutMapping(path = "{id}")
    public void updateBlackcard(@PathVariable("id") Long id, @NonNull @RequestBody Blackcard blackcard){
        blackcardlogic.updateBlackcard(blackcard);
    }
}
