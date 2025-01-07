package org.idrice24.paywise.contollers;

import org.idrice24.paywise.entities.Depense;
import org.idrice24.paywise.entities.Mensuel;
import org.idrice24.paywise.services.DepenseService;
import org.idrice24.paywise.services.MensuelService;

public class Calculate {


    public Iterable<Depense> checkDepense(DepenseService depenseService, MensuelService mensuelService){
        Iterable<Depense> dpns = depenseService.getAllDepense();
        
        
            for (Depense depense : dpns) {
                if(depense.getMonth() == 0){
                    depense.setMonth(1);
                }
            }
            
        
                return dpns;
    }

    
    

    public double jnName(MensuelService mensuelService){
        double salary;
        Iterable<Mensuel> mns = mensuelService.getAllMensule();
        
        for (Mensuel mensuel : mns) {
            if(mensuel.getMonth() == 1){
                salary = mensuel.getSalaire();
                System.out.println("this is to test out salary "+ salary);
                return salary;
            }else{
                return 1;
            }
            
        }
        
        return 0;
    }

                public double fName(MensuelService mensuelService){
                    double salary;
                    Iterable<Mensuel> mns = mensuelService.getAllMensule();

                    for (Mensuel mensuel : mns) {
                        if(mensuel.getMonth() == 2){
                            salary = mensuel.getSalaire();
                            System.out.println("this is to test out salary "+ salary);
                            return salary;
                        }
                        
                    }
                                        return 0;
                }
                public double mName(MensuelService mensuelService){
                    double salary;
                    Iterable<Mensuel> mns = mensuelService.getAllMensule();

                    for (Mensuel mensuel : mns) {
                        if(mensuel.getMonth() == 3){
                            salary = mensuel.getSalaire();
                            System.out.println("this is to test out salary "+ salary);
                            return salary;
                        }
                        
                    }
                                        return 0;
                }
                public double aName(MensuelService mensuelService){
                    double salary;
                    Iterable<Mensuel> mns = mensuelService.getAllMensule();

                    for (Mensuel mensuel : mns) {
                        if(mensuel.getMonth() == 4){
                            salary = mensuel.getSalaire();
                            System.out.println("this is to test out salary avril"+ salary);
                            return salary;
                        }
                        
                    }
                                        return 0;
                }
                public double maName(MensuelService mensuelService){
                    double salary;
                    Iterable<Mensuel> mns = mensuelService.getAllMensule();

                    for (Mensuel mensuel : mns) {
                        if(mensuel.getMonth() == 5){
                            salary = mensuel.getSalaire();
                            System.out.println("this is to test out salary mai "+ salary);
                            return salary;
                        }
                        
                    }
                                        return 0;
                }

                public double jName(MensuelService mensuelService){
                    double salary;
                    Iterable<Mensuel> mns = mensuelService.getAllMensule();

                    for (Mensuel mensuel : mns) {
                        if(mensuel.getMonth() == 6){
                            salary = mensuel.getSalaire();
                            System.out.println("this is to test out salary "+ salary);
                            return salary;
                        }
                        
                    }
                                        return 0;
                }

                public double jtName(MensuelService mensuelService){
                    double salary;
                    Iterable<Mensuel> mns = mensuelService.getAllMensule();

                    for (Mensuel mensuel : mns) {
                        if(mensuel.getMonth()  == 7){
                            salary = mensuel.getSalaire();
                            System.out.println("this is to test out salary "+ salary);
                            return salary;
                        }
                        
                    }
                                        return 0;
                }
                public double auName(MensuelService mensuelService){
                    double salary;
                    Iterable<Mensuel> mns = mensuelService.getAllMensule();

                    for (Mensuel mensuel : mns) {
                        if(mensuel.getMonth() == 8){
                            salary = mensuel.getSalaire();
                            System.out.println("this is to test out salary "+ salary);
                            return salary;
                        }
                        
                    }
                                        return 0;
                }
                public double sName(MensuelService mensuelService){
                    double salary;
                    Iterable<Mensuel> mns = mensuelService.getAllMensule();

                    for (Mensuel mensuel : mns) {
                        if(mensuel.getMonth() == 9){
                            salary = mensuel.getSalaire();
                            System.out.println("this is to test out salary "+ salary);
                            return salary;
                        }
                        
                    }
                                        return 0;
                }
                public double oName(MensuelService mensuelService){
                    double salary;
                    Iterable<Mensuel> mns = mensuelService.getAllMensule();

                    for (Mensuel mensuel : mns) {
                        if(mensuel.getMonth() == 10){
                            salary = mensuel.getSalaire();
                            System.out.println("this is to test out salary "+ salary);
                            return salary;
                        }
                        
                    }
                                        return 0;
                }
                public double nName(MensuelService mensuelService){
                    double salary;
                    Iterable<Mensuel> mns = mensuelService.getAllMensule();

                    for (Mensuel mensuel : mns) {
                        if(mensuel.getMonth() ==11){
                            salary = mensuel.getSalaire();
                            System.out.println("this is to test out salary "+ salary);
                            return salary;
                        }
                        
                    }
                                        return 0;
                }
                public double dName(MensuelService mensuelService){
                    double salary;
                    Iterable<Mensuel> mns = mensuelService.getAllMensule();

                    for (Mensuel mensuel : mns) {
                        if(mensuel.getMonth() == 12){
                            salary = mensuel.getSalaire();
                            System.out.println("this is to test out salary "+ salary);
                            return salary;
                        }
                        
                    }
                                        return 0;
                }
/* collecting data from the depense table */

public int depMonth(DepenseService depenseService){
    int dept = 0;
    Iterable<Depense> dps = depenseService.getAllDepense();
    for(Depense depense : dps){
        if(depense.getMonth() == 1 && depense.getYears() == 24){
            dept = depense.getMonth();
            return dept;
        }
    }
    return dept;
}



}
