package org.idrice24.paywise.contollers;

import org.idrice24.paywise.entities.Mensuel;
import org.idrice24.paywise.services.MensuelService;

public class Calculate {
    

    public double jnName(MensuelService mensuelService){
        double salary;
        Iterable<Mensuel> mns = mensuelService.getAllMensule();

        for (Mensuel mensuel : mns) {
            if(mensuel.getMonth().equalsIgnoreCase("1")){
                salary = mensuel.getSalaire();
                System.out.println("this is to test out salary "+ salary);
                return salary;
            }else{
                return 0;
            }
            
        }
        return 0;
    }

                public double fName(MensuelService mensuelService){
                    double salary;
                    Iterable<Mensuel> mns = mensuelService.getAllMensule();

                    for (Mensuel mensuel : mns) {
                        if(mensuel.getMonth().equalsIgnoreCase("2")){
                            salary = mensuel.getSalaire();
                            System.out.println("this is to test out salary "+ salary);
                            return salary;
                        }
                        
                    }
                                        return 0;
                }


}
