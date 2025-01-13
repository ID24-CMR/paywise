package org.idrice24.paywise.repositories;


import java.util.List;

import org.idrice24.paywise.entities.Depense;
import org.springframework.data.repository.CrudRepository;

public interface DepenseRepository extends CrudRepository<Depense, Long>{

    List<Depense> findAll();
    void deleteById(Double num);
    List<Depense> getDepenseByMonth(int month);

}
