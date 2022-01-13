package com.annabelle.launch.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 *      Created by: Annabelle Ellis
 */

@Controller
@RequestMapping("views")
public class ControllerDemo {

//    The name of the request mapping for the class has to pre-fix the return
//    statement and a directory of the same name has to be in the templates folder

    @GetMapping("/")
    public String index(Model model){
//        Takes two parameters of a key value pair
        model.addAttribute("param","attributePassed");
        return "views/index";
    }


}
