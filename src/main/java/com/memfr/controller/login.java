package com.memfr.controller;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/")
@Controller
public class login {

    @GetMapping("/")
    public String homePage(){
        return "<p>index<p>";
    }
    @GetMapping("/connec")
    public String connection( @RequestParam String username, @RequestParam String password) {

        if (username.equals("user") && password.equals("pass")) {
            return "onnected";
        }

        return "error";
    }
    @GetMapping("/test")
    @ResponseBody
    public String testFct(HttpServletResponse response){
        response.setContentType("text/plain");
        return "Hello World";
    }


}
