package com.expense.expensetracker.controller;


import com.expense.expensetracker.entity.expensetable;
import com.expense.expensetracker.service.expenseservice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@Controller
public class sendetails {


    @Autowired
    private final expenseservice expenseservice;


    private final Logger logger= LoggerFactory.getLogger(sendetails.class);

    public sendetails(expenseservice expenseservice) {
        //this.expensetable = expensetable;
        this.expenseservice = expenseservice;
    }

    @PostMapping(value = "/register")
    public String expllense(@ModelAttribute expensetable expensetable){

        //expensetable expens
        //
        // etable=new expensetable();
        //logger.info("receibbed");

        expenseservice.saveexpensedetails( expensetable);



        return "redirect:/expense";





    }




}
