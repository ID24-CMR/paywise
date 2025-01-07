package org.idrice24.paywise.repositories;

import org.idrice24.paywise.entities.Details;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailsRepository extends CrudRepository<Details, Long>  {
    
}
