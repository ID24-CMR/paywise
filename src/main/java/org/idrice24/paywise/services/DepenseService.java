package org.idrice24.paywise.services;


import java.util.List;

import org.idrice24.paywise.entities.Depense;

public interface DepenseService {

        List<Depense> getAllDepense();
        void saveDepense(Depense depense);
        void deleteDepense(Double num);
}
