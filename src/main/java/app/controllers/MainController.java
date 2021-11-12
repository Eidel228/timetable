package app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/index")
    public String showIndex(){
        return "index";
    }

    @PostMapping("/index")
    public String login(@RequestParam (value = "login") String login, @RequestParam(value = "password") String password ){
        if (password.equals("tralala6014")&&login.equals("eidel"))return "main";
        else return "redirect:/index";
    }

    @PostMapping("/main")
    public String showMain(){
        return "main";
    }

}
