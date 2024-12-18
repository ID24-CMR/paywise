package org.idrice24.paywise.contollers;

import org.idrice24.paywise.entities.Datainput;
import org.idrice24.paywise.services.DatainputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DatainputController {
    private DatainputService datainputService;
    
        @Autowired
        public void DatainputControllers(DatainputService datainputService){
            this.datainputService = datainputService;
    }

    @PostMapping(value="datainput/add")
    public String addDatainput(Datainput datainput, BindingResult result, Model model){
        if(result.hasErrors()){
            return "datainput";
        }

        datainputService.saveDatainput(datainput);
        String msg = "Data saved!!";
        model.addAttribute("datainput", msg);
        return "datainput";
    }
}
