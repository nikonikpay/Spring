package com.ali.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {


    // need a controller method to show the initial html form

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }


    // need a controller method to process the html form
    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }


    //new a controller method to read form data
    // add data to the model
    @RequestMapping("/processFormVersionTwo")
    public String letShoutDude(HttpServletRequest request, Model model) {

        //read the request parameter from the html form
        String theName = request.getParameter("studentName");

        // convert the data to all cap
        theName.toUpperCase();
        //create the message
        String result = "Yo !" + theName;
        //add message to the model
        model.addAttribute("message",result);

        return "helloworld";
    }

    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName")String name, Model model) {

        // convert the data to all cap
        name.toUpperCase();
        //create the message
        String result = "Hey my friend V3 !" + name;
        //add message to the model
        model.addAttribute("message",result);

        return "helloworld";
    }


}
