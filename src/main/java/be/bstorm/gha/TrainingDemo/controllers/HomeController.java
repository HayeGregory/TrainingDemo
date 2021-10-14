package be.bstorm.gha.TrainingDemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // todo ajouter les repositories

    // HOME Controller - page index
    @GetMapping(path={"","/", "home"})
    public String indexAction() {
        return "home/index.html";
    }


}
