package org.idrice24.paywise.services;

import java.util.Optional;

import org.idrice24.paywise.entities.Mensuel;
import org.idrice24.paywise.repositories.MensuelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MensuelServiceImpl implements MensuelService{

    private MensuelRepository mensuelRepository;

    @Autowired
    public void setMensuelRepo(MensuelRepository mensuelRepository){
        this.mensuelRepository = mensuelRepository;
    }

    @Override
    public Iterable<Mensuel> getAllMensule() {
        return mensuelRepository.findAll();
    }

    @Override
    public void saveMensuel(Mensuel mensuel) {
        mensuelRepository.save(mensuel);
    }

    @Override
    public void deleteMensuel(Mensuel mensuel) {
        mensuelRepository.delete(mensuel);
    }

    @Override
    public Optional<Mensuel> findById(long id) {
        
                return mensuelRepository.findById(id);
    }

}
