package org.example.demospp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloworld(){
        return "Hello world!";
    }



}
