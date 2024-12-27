package org.idrice24.paywise.contollers;


import org.idrice24.paywise.entities.Depense;
import org.idrice24.paywise.services.DepenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DepenseController {

    private DepenseService depenseService;
    @Autowired
    public void setDepenseService(DepenseService depenseService){
        this.depenseService = depenseService;
    }

    @GetMapping(value ="depense")
    public String showPage(Model model){
        Depense depense = new Depense();
        model.addAttribute("depense", depense);
        return "depense";
    }

    @PostMapping(value="depense/add")
    public String addDepense(Depense depense, BindingResult result, Model model){
        System.out.println(depense);
        depenseService.saveDepense(depense);
        return "saving";
    }

    public DepenseController() {
    }


    Calculate cals = new Calculate();

    // @GetMapping(value="saving")
    // public String showsSaving(Model model){
    //     int num = cals.depMonth(depenseService);
    //     List<Depense> pns = depenseService.getAllDepense();
    //     for (Depense depense : pns) {
    //         if(depense.getMonth() == num){
    //             model.addAttribute("loc", depense.getLocation());
    //         }
    //     }
    //     System.out.println(num);

    //     return "saving";
    // }

    

}
