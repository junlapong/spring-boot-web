package com.demo.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ChartController {

    @RequestMapping(value = "/charts", method = RequestMethod.GET)
    public String chartsHome(Model model) {
        return "charts";
    }

}
