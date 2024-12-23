package org.idrice24.paywise.repositories;

import org.idrice24.paywise.entities.Mensuel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MensuelRepository extends CrudRepository<Mensuel, Long> {

}
