package com.ali.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    // need a controller method to process the html form
    @RequestMapping("/")
    public String showPage() {
        return "main-menu";
    }




}
