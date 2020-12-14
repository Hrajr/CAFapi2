package caf.backend.controller;

import caf.backend.logic.model.entities.Whitecard;
import caf.backend.logic.whitecardLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/whitecards")
public class whiteController {
    private final whitecardLogic whitecardlogic;

    @Autowired
    public whiteController(whitecardLogic whitecardlogic) {
        this.whitecardlogic = whitecardlogic;
    }

    @PostMapping
    public void addWhitecard(@NonNull @RequestBody Whitecard whitecard){
        whitecardlogic.addWhitecard(whitecard);
    }

    @GetMapping
    public Iterable<Whitecard> getAll(){
        return whitecardlogic.getAllWhiteCards();
    }

    @GetMapping(path = "{id}")
    public Whitecard getWhitecard(@PathVariable("id") Long id) throws Exception {
        return whitecardlogic.getWhitecard(id);
    }

    @GetMapping(path = "set/{text}")
    public Iterable<Whitecard> getSetWhitecards(@PathVariable("text") String set) throws Exception{
        return whitecardlogic.getSetWhitecards(set);
    }

    @GetMapping(path = "childlike")
    public Iterable<Whitecard> getSetWhitecards() throws Exception{
        return whitecardlogic.getChildlikeWhitecards();
    }

    @DeleteMapping(path = "{id}")
    public void deleteWhitecard(@PathVariable("id") Long id){
        whitecardlogic.deleteWhitecard(id);
    }

    @PutMapping(path = "{id}")
    public void updateWhitecard(@PathVariable("id") Long id, @NonNull @RequestBody Whitecard whitecard){
        whitecardlogic.updateWhitecard(whitecard);
    }
}
