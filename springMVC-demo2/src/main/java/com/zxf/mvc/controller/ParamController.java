package com.zxf.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ParamController {
    @RequestMapping("para")
    public String testparam() {
        return "test_param";
    }

    @RequestMapping("serv")
    public String testServlet(@RequestParam(value = "user_name", required = false )
                                          String username,
                              String password,@RequestHeader("Host") String host) {
        System.out.println("username == " + username);
        System.out.println("pass == " + password);
        System.out.println("Host from headers == " + host);
        return "su";
    }
//    public String testServlet(HttpServletRequest request){
//        System.out.println("username == "+request.getParameter("username"));
//        System.out.println("pass == "+request.getParameter("pass"));
//        return "su";
//    }
}
