package com.annabelle.launch.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
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

    /**
     * Handler to add the form
     * @param model
     * @return
     */
    @GetMapping("/add-names")
    public String namesForm(Model model){
        model.addAttribute("formVar","Data is being passed.");
        return "views/addNames";
    }

    /**
     * Handler to get the information from the form
     * Get names from the form using HttpServletRequest
     * Add it to an arrayList and pass it back to the html attibute
     * where it is displayed using thymeleaf
     *
     * @param model
     * @param request
     * @return
     */
    ArrayList<String> names = new ArrayList<>();
    @PostMapping("/add-names")
    public String namesAcceptForm(Model model, HttpServletRequest request){
        String name = request.getParameter("usrname");
        names.add(name);
        model.addAttribute("namesCollected",names);
        return "views/addNames";
    }



    @GetMapping("/add-names-two")
    public String namesFormTwo(Model model){
        model.addAttribute("formVar2","The data that is collected from the form will be handled differently.");
        return "views/addNamesTwo";
    }

    static ArrayList<String> names2 = new ArrayList<>();
    @PostMapping("/add-names-two")
    public String namesAcceptFormData(Model model, @RequestParam String usrname2){
        names2.add(usrname2);
        model.addAttribute("namesCollected2",names2);
        return "views/addNamesTwo";
    }



}
