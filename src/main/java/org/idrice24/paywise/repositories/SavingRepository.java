package org.idrice24.paywise.repositories;

import org.idrice24.paywise.entities.Saving;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SavingRepository extends CrudRepository<Saving, Long> {

}
