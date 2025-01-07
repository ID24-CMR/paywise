package org.idrice24.paywise.services;

import java.util.Optional;

import org.idrice24.paywise.entities.Details;
import org.idrice24.paywise.repositories.DetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailsServiceImpl implements DetailsService {
    private DetailsRepository detailsRepository;

    @Autowired
    public void setDetailsService(DetailsRepository detailsRepository){
        this.detailsRepository = detailsRepository;
    }

    @Override
    public Iterable<Details> getAllDetails() {
       return detailsRepository.findAll();
    }

    @Override
    public void saveAllDetails(Details details) {
        detailsRepository.save(details);
    }

    @Override
    public void deleteAllDetails(Details details) {
       detailsRepository.deleteAll();
    }

    @Override
    public Optional<Details> findDetailsById(Long id) {
     return    detailsRepository.findById(id);
    }

}
