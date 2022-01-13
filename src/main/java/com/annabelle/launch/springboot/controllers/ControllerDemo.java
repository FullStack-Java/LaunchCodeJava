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
@RequestMapping("routes")
public class ControllerDemo {

    @GetMapping("/{id}")
    @ResponseBody
    public String index(@PathVariable String id){
        return "Hi Annabelle" + id;
    }

    @GetMapping("/message")
    @ResponseBody
    public String getMessage(HttpServletRequest request){
        String msg = "tahdah";
        Optional<String> usrMessage = Optional.of(Optional.ofNullable(request.getParameter("msg")).orElse(msg));
        return "Takes a query parameter: "+ usrMessage.get();
    }

    @GetMapping("/goodbye")
    @ResponseBody
    public String bye(){
        return "Bye-Bye Anna Sad to see you go!";
    }

    @GetMapping("/hi-again")
    @ResponseBody
    public String noBye(){
        return "I know you didn't wanna go. Notice that the redirect that sends you here does not have a response body annotation";
    }

    @GetMapping("/hello-goodbye")
    public String helloBye(){
        return "redirect:/routes/hi-again";
    }

}
