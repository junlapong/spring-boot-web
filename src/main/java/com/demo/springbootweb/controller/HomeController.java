package com.demo.springbootweb.controller;

import com.demo.springbootweb.domain.Customer;
import com.demo.springbootweb.repository.CustomerRepository;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    CustomerRepository customerRepo;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String customerHome(Model model) {

        Iterable<Customer> customerLst = customerRepo.findAll();
        model.addAttribute("customerLst", customerLst);
        model.addAttribute("serverTime", new Date());
        return "home";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String customerSave(@RequestParam(value = "firstName") String firstName, @RequestParam(value = "lastName") String lastName, Model model) {
        logger.info("Name: " + firstName);
        customerRepo.save(new Customer(firstName, lastName));
        return "redirect:/";
    }

}
