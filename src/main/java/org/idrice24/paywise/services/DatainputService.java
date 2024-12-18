package org.idrice24.paywise.services;


import org.idrice24.paywise.entities.Datainput;

public interface DatainputService {
    Iterable<Datainput> getAllDatainput();
    void deleteDatainput(Datainput datainput);
    void saveDatainput(Datainput datainput);
    Datainput getDatainputById(long id);
}
