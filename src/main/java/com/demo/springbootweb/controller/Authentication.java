package com.demo.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Authentication {

   @RequestMapping(value = "/login", method = RequestMethod.GET)
   public String login(Model model) {
       return "login";
   }

   @RequestMapping(value = "/logout", method = RequestMethod.GET)
   public String logout(Model model) {
       return "redirect:/";
   }

}
