package org.idrice24.paywise.contollers;

import java.util.List;

import org.idrice24.paywise.entities.Depense;
import org.idrice24.paywise.services.DatainputService;
import org.idrice24.paywise.services.DepenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SavingController {

    public DepenseService depenseService;
        public DatainputService datainputService;
            
                @Autowired
                public void setSavingController(DepenseService depenseService, DatainputService datainputService){
                    this.depenseService = depenseService;
                    this.datainputService = datainputService;
                }

    @GetMapping(value="saving")
    public String showSaving(Model model){
        List<Depense> savings = (List<Depense>) depenseService.getAllDepense();
        model.addAttribute("savings", savings);
        return "saving";
    }

}
