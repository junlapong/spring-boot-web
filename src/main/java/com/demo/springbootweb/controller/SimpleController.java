package com.demo.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public @ResponseBody
    String provideUploadInfo() {
        return "Hello World!";
    }
}
