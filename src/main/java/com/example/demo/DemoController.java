package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class DemoController {

    @GetMapping("/")
    public ModelAndView validator() {
        return new ModelAndView("index");
    }

    @PostMapping("/index")
    public ModelAndView form(@RequestParam String string){
         return new ModelAndView().addObject("isNumber", Validator.isNumber(string));
     }
}
