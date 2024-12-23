package org.idrice24.paywise.services;

import java.util.Optional;

import org.idrice24.paywise.entities.Mensuel;

public interface MensuelService {

    Iterable<Mensuel> getAllMensule();
    void saveMensuel(Mensuel mensuel);
    void deleteMensuel(Mensuel mensuel);
    Optional<Mensuel> findById(long id);
}
