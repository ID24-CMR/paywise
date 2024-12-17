package org.idrice24.paywise.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeContoller {
    public HomeContoller(){}
    @GetMapping(value="index")
    public String indexPage(){
        return "index";
    }
}
