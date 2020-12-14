package caf.backend.dal.interfaces;

import caf.backend.logic.model.entities.Set;
import caf.backend.logic.model.entities.Whitecard;
import org.springframework.data.repository.CrudRepository;

public interface iWhitecards extends CrudRepository<Whitecard, Long> {
    Iterable<Whitecard> findByChildLikeIsTrue();
    Iterable<Whitecard> findBySetText(String text);
    Iterable<Whitecard> findBySet(Set set);
}
