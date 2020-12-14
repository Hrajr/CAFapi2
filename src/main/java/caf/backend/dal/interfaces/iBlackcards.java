package caf.backend.dal.interfaces;

import caf.backend.logic.model.entities.Blackcard;
import caf.backend.logic.model.entities.Set;
import org.springframework.data.repository.CrudRepository;

public interface iBlackcards extends CrudRepository<Blackcard, Long> {
    Iterable<Blackcard> findByChildLikeIsTrue();
    Iterable<Blackcard> findBySetText(String text);
    Iterable<Blackcard> findBySet(Set set);
}
