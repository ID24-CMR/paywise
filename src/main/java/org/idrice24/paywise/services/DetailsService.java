package org.idrice24.paywise.services;

import java.util.Optional;

import org.idrice24.paywise.entities.Details;

public interface DetailsService {
    Iterable<Details> getAllDetails();
    void saveAllDetails(Details details);
    void deleteAllDetails(Details details);
    Optional<Details> findDetailsById(Long id);
}
