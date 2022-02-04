package com.annabelle.launch.springboot.controllers;

import com.annabelle.launch.springboot.models.ModelData;
import com.annabelle.launch.springboot.models.ModelDemo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 *      Created by: Annabelle Ellis
 *      https://www.youtube.com/watch?v=0z_hjs5XRy0&list=PLs5n5nYB22fI83_UAFbPLC-Mg9Uc6jeU4&index=9
 */

@Controller
@RequestMapping("views")
public class ControllerDemo {

//    The name of the request mapping for the class has to pre-fix the return
//    statement and a directory of the same name has to be in the templates folder

    @GetMapping("/")
    public String index(Model model){
//        Takes two parameters of a key value pair
        model.addAttribute("parameter","attributePassed");
        model.addAttribute("title","Thymeleaf-Views,Index Page");
        return "/views/index";
    }


    @GetMapping("/names")
    public String names(Model model){
        model.addAttribute("title","Forms Page");
        return "/views/names";
    }

    @PostMapping("/names")
    public String addNamesFromForm(Model model, @RequestParam String name, @RequestParam String quote ){
        model.addAttribute("title","Forms Page");
        ModelDemo newPerson = new ModelDemo(name,quote);
        try{
            System.out.println(newPerson.getName());
            System.out.println(newPerson.getQuote());
            ModelData.addPerson(newPerson);
        }catch (Exception e){
            System.out.println("This where the error lye. " + e.getMessage());
        }
        return "redirect:/views/display-names";
    }

    @GetMapping("/display-names")
    public String displayNames(Model model){
        model.addAttribute("title","Display Person Data");
        model.addAttribute("persons", ModelData.getAll());
        return "views/allnames";
    }

}
