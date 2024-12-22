package org.idrice24.paywise.contollers;

import org.idrice24.paywise.entities.Datainput;
import org.idrice24.paywise.services.DatainputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DatainputController {
    private DatainputService datainputService;
    
        @Autowired
        public void DatainputControllers(DatainputService datainputService){
            this.datainputService = datainputService;
    }

    @GetMapping(value="datainput")
    public String datainput(Model model){
        Datainput datainput = new Datainput();
        model.addAttribute("datainput", datainput);
        return "datainputpage";
    }

    @PostMapping(value="datainput/add")
    public String addDatainput(Datainput datainput, BindingResult result, Model model){
        if(result.hasErrors()){
            return "datainputpage";
        }

        datainputService.saveDatainput(datainput);
        
        model.addAttribute("datainput", datainput);
        return "datainputpage";
    }
}
