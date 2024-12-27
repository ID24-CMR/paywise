package org.idrice24.paywise.services;


import java.util.List;

import org.idrice24.paywise.entities.Depense;
import org.idrice24.paywise.repositories.DepenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DepenseServiceImpl implements DepenseService {
    public DepenseRepository depenseRepository;
    
    @Autowired
    public void setDepenseRepo(DepenseRepository depenseRepository){
        this.depenseRepository = depenseRepository;
    }

    @Override
    public List<Depense> getAllDepense(){
        return depenseRepository.findAll();
    }

    @Override
    public void saveDepense(Depense depense){
        depenseRepository.save(depense);
    }

    @Override
    public void deleteDepense(Double num){
        depenseRepository.deleteById(num);
    }
}
