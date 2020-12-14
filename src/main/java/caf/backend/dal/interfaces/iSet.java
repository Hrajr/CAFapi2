package caf.backend.dal.interfaces;

import caf.backend.logic.model.entities.Set;
import org.springframework.data.repository.CrudRepository;

public interface iSet extends CrudRepository<Set, Long> {
}
