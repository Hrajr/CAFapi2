package caf.backend.logic;

import caf.backend.dal.interfaces.iSet;
import caf.backend.logic.model.entities.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class setLogic {
    private final iSet set;

    @Autowired
    public setLogic(iSet set) {
        this.set = set;
    }

    public void addSet(Set set) {
        this.set.save(set);
    }

    public Iterable<Set> getAllSets() {
        return this.set.findAll();
    }

    public Set getSet(Long id) throws Exception {
        return this.set.findById(id).orElseThrow(()-> new Exception("Set not found"));
    }

    public void deleteSet(Long id) {
        this.set.deleteById(id);
    }

    public void updateSet(Set set){
        this.set.save(set);
    }
}
