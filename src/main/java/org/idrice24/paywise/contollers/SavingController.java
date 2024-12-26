package org.idrice24.paywise.contollers;



import org.idrice24.paywise.entities.Depense;
import org.idrice24.paywise.services.DatainputService;
import org.idrice24.paywise.services.DepenseService;
import org.idrice24.paywise.services.MensuelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SavingController {

        public DepenseService depenseService;
        public DatainputService datainputService;
        public MensuelService mensuelService;
            
                @Autowired
                public void setSavingController(DepenseService depenseService, DatainputService datainputService, MensuelService mensuelService){
                    this.depenseService = depenseService;
                    this.datainputService = datainputService;
                    this.mensuelService = mensuelService;
                }

                Calculate cals = new Calculate();
    @GetMapping(value="saving")
    public String showSaving(Model model){
        
        Iterable<Depense> savings =  depenseService.getAllDepense();
        
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
        model.addAttribute("savings", savings);
        return "saving";
    }

}
