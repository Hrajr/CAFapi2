package caf.backend.logic;

import caf.backend.dal.interfaces.iBlackcards;
import caf.backend.logic.model.entities.Blackcard;
import caf.backend.logic.model.entities.Whitecard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class blackcardLogic {
    private final iBlackcards blackcards;

    @Autowired
    public blackcardLogic(iBlackcards blackcards) {
        this.blackcards = blackcards;
    }

    public Iterable<Blackcard> getAll() {return blackcards.findAll(); }

    public Blackcard getBlackcard(Long id) throws Exception {return blackcards.findById(id).orElseThrow(()-> new Exception("Blackcard not found"));
    }

    public void addBlackcard(Blackcard blackcard) {
        blackcards.save(blackcard);
    }

    public void deleteBlackcard(Long id) {
        blackcards.deleteById(id);
    }

    public void updateBlackcard(Blackcard blackcard) {
        blackcards.save(blackcard);
    }

    public Iterable<Blackcard> getSetBlackcards (String text) {
        return blackcards.findBySetText(text);
    }

    public Iterable<Blackcard> getChildlikeBlackcards () { return blackcards.findByChildLikeIsTrue(); }
}
