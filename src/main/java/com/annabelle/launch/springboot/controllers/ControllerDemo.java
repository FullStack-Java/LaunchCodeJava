package com.annabelle.launch.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;


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
        return "views/index";
    }


    @GetMapping("/names")
    public String namesArr(Model model){
        ArrayList<String> names = new ArrayList<>();
        names.add("Anna");
        names.add("Adjaynae");
        names.add("Kaela");
        names.add("Khrisante");

        model.addAttribute("namesArray",names);
        return "views/names";
    }

}
