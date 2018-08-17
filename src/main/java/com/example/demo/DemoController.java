package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class DemoController {
      private Validator validator = new Validator();
//    @Autowired
//    private Validator validator;

    @GetMapping("/")
    public ModelAndView validator() {
        return new ModelAndView("index");
    }

    @PostMapping("/index")
    public ModelAndView form(@RequestParam String string) {
        return new ModelAndView("index").addObject("isNumber", validator.isNumber(string));
    }

    @PostMapping("/email-validator")
    public ModelAndView emailForm(@RequestParam String emailString) {
        return new ModelAndView("index").addObject("isEmail", validator.isEmail(emailString));
    }

    @PostMapping("/palindrome-validator")
    public ModelAndView palindromForm(@RequestParam String palindromeString) {
        return new ModelAndView("index").addObject("isPalindrome", validator.isPalindrome(palindromeString));
    }
}
