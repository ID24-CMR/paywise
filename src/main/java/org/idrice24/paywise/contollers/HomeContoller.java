package org.idrice24.paywise.contollers;

import org.idrice24.paywise.entities.Mensuel;
import org.idrice24.paywise.services.MensuelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeContoller {
    private MensuelService mensuelService;
    @Autowired
    public void setMensuelService(MensuelService mensuelService){
        this.mensuelService = mensuelService;
    }
    public HomeContoller(){}

    @GetMapping(value="index")
    public String indexPage(){
        return "index";
    }

    @GetMapping(value="mensuel")
    public String mensuelPage(Model model){
        Mensuel mensuel = new Mensuel();
        model.addAttribute("mensuel", mensuel);
        return "mensuel";
    }

    @PostMapping(value="mensuel/add")
    public String mensuelAdd(Mensuel mensuel, BindingResult result, Model model){
        if(result.hasErrors()){
            return "mensule";
        }
        mensuelService.saveMensuel(mensuel);
        model.addAttribute("mensule", model);
        return "saving";
    }
}
