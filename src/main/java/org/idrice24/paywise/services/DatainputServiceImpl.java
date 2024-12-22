package org.idrice24.paywise.services;


import org.idrice24.paywise.entities.Datainput;
import org.idrice24.paywise.repositories.DatainputRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatainputServiceImpl implements DatainputService {

        private DatainputRepository datainputRepository;
        @Autowired
        public void setRespository(DatainputRepository datainputRepository){
            this.datainputRepository = datainputRepository;
        }
    @Override
    public Iterable<Datainput> getAllDatainput() {
        return datainputRepository.findAll();
    }

    @Override
    public void deleteDatainput(Datainput datainput) {
        datainputRepository.delete(datainput);
    }

    @Override
    public void saveDatainput(Datainput datainput) {
        datainputRepository.save(datainput);
    }

    @Override
    public Datainput getDatainputById(long id) {
        
      return datainputRepository.findById(id);
    }

}
