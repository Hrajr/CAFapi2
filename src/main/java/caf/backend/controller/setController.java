package caf.backend.controller;

import caf.backend.logic.model.entities.Set;
import caf.backend.logic.setLogic;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/sets")
public class setController {
    private final setLogic setlogic;

    @Autowired
    public setController(setLogic setlogic) {
        this.setlogic = setlogic;
    }

    @PostMapping
    public void addSet(@NonNull @RequestBody Set set) {
        setlogic.addSet(set);
    }

    @GetMapping
    public Iterable<Set> getAllSets() {
        return setlogic.getAllSets();
    }

    @GetMapping(path = "{id}")
    public Set getSet(@PathVariable("id") Long id) throws Exception {
        return setlogic.getSet(id);
    }

    @DeleteMapping(path = "{id}")
    public void deleteSet(@PathVariable("id") Long id) {
        setlogic.deleteSet(id);
    }

    @PutMapping(path = "{id}")
    public void updateSet(@PathVariable("id") Long id, @NonNull @RequestBody Set set) {
        setlogic.updateSet(set);
    }
}
