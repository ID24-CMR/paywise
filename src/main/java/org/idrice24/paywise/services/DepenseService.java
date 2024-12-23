package org.idrice24.paywise.services;


import org.idrice24.paywise.entities.Depense;

public interface DepenseService {

        Iterable<Depense> getAllDepense();
        void saveDepense(Depense depense);
        void deleteDepense(Double num);
}
