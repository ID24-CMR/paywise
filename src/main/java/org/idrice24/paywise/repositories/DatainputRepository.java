package org.idrice24.paywise.repositories;

import java.util.List;

import org.idrice24.paywise.entities.Datainput;
import org.springframework.data.repository.CrudRepository;

public interface DatainputRepository extends CrudRepository<Datainput, Long> {
    List<Datainput> findByUsername(String username);
    Datainput findById(long id);
}
