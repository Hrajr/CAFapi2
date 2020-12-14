package caf.backend.logic;

import caf.backend.dal.interfaces.iWhitecards;
import caf.backend.logic.model.entities.Whitecard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class whitecardLogic {
    private final iWhitecards whitecards;

    @Autowired
    public whitecardLogic(iWhitecards whitecards) {
        this.whitecards = whitecards;
    }

    public Whitecard getWhitecard(Long id) throws Exception {return whitecards.findById(id).orElseThrow(()-> new Exception("Whitecard not found"));
    }

    public Iterable<Whitecard> getAllWhiteCards() {return whitecards.findAll(); }

    public void addWhitecard(Whitecard whitecard) {
        whitecards.save(whitecard);
    }

    public void deleteWhitecard(Long id) {
        whitecards.deleteById(id);
    }

    public void updateWhitecard(Whitecard whitecard) {
        whitecards.save(whitecard);
    }

    public Iterable<Whitecard> getSetWhitecards (String text) {
        return whitecards.findBySetText(text);
    }

    public Iterable<Whitecard> getChildlikeWhitecards () { return whitecards.findByChildLikeIsTrue(); }
}
