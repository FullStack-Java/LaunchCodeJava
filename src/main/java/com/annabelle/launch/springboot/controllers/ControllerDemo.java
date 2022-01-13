package com.annabelle.launch.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

/**
 *      Created by: Annabelle Ellis
 */

@Controller
@RequestMapping("views")
public class ControllerDemo {

//    The name of the request mapping for the class has to pre-fix the return
//    statement and a directory of the same name has to be in the templates folder

    @GetMapping("/")
    public String index(){
        return "views/index";
    }


}
