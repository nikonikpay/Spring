package com.ali.spring;


import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.r2dbc.core.binding.Bindings;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/customer")
public class CustomerController {


// add an inintbinder to trim lastname if its white space

@InitBinder
public void initBinder(WebDataBinder dataBinder) {

    StringTrimmerEditor trimmer = new StringTrimmerEditor(true);
    dataBinder.registerCustomEditor(String.class,trimmer);

}


    @RequestMapping("/showForm")
    public String showForm(Model theModel) {
        theModel.addAttribute("customer", new Customer());
        return "customer-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer, BindingResult theBindingResult) {


        if(theBindingResult.hasErrors()) {
            return "customer-form";
        } else {
            return "customer-confirmation";
        }

    }

}
