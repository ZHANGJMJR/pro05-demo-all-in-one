package com.zxf.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.Normalizer;

@Controller
@RequestMapping({"/hello","/dd"})
public class RequestMappingController {
    @RequestMapping("/su")
    public String index(){
        return "su";
    }

    @RequestMapping(value = "/testput",method = RequestMethod.PUT)
    public String testput(){
    return "su";
    }
}
