package org.idrice24.paywise.contollers;



import java.util.List;

import org.idrice24.paywise.entities.Depense;
import org.idrice24.paywise.entities.Mensuel;
import org.idrice24.paywise.entities.Saving;
import org.idrice24.paywise.repositories.SavingRepository;
import org.idrice24.paywise.services.DepenseService;
import org.idrice24.paywise.services.MensuelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SavingController {

        private DepenseService depenseService;
        private MensuelService mensuelService;
        private SavingRepository savingRepository;

            
                @Autowired
                public void setSavingController(DepenseService depenseService, MensuelService mensuelService, SavingRepository savingRepository){
                    this.depenseService = depenseService;
                    this.mensuelService = mensuelService;
                    this.savingRepository = savingRepository;
                }

                Calculate cals = new Calculate();
    @GetMapping(value="saving")
    public String showSaving(Model model){
         List<Saving> savingList = (List<Saving>) savingRepository.findAll();
         Iterable<Depense> depenseLists = depenseService.getAllDepense();
         Iterable<Mensuel> mensuelLists = mensuelService.getAllMensule();
         cals.checkDepense(depenseService, mensuelService); 

        model.addAttribute("depenseLists", depenseLists);
         model.addAttribute("mensuelLists", mensuelLists);
        model.addAttribute("savings", savingList);
        
        
        model.addAttribute("jnname", cals.jnName(mensuelService));
        model.addAttribute("fname", cals.fName(mensuelService));
        model.addAttribute("mname", cals.mName(mensuelService));
        model.addAttribute("aname", cals.aName(mensuelService));
        model.addAttribute("maname", cals.maName(mensuelService));
        model.addAttribute("jname", cals.jName(mensuelService));
        model.addAttribute("jtname", cals.jtName(mensuelService));
        model.addAttribute("auname", cals.auName(mensuelService));
        model.addAttribute("sname", cals.sName(mensuelService));
        model.addAttribute("oname", cals.oName(mensuelService));
        model.addAttribute("nname", cals.nName(mensuelService));
        model.addAttribute("dname", cals.dName(mensuelService));


        int num = cals.depMonth(depenseService);
        List<Depense> pns = depenseService.getAllDepense();
        for (Depense depense : pns) {
            if(depense.getMonth() == num){
                model.addAttribute("loc", depense.getLocation());
            }
        }




        return "saving";
    }

}
