package com.expense.expensetracker.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.expense.expensetracker.entity.expensetable;
import com.expense.expensetracker.service.expenseservice;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;

@Controller

public class sendform {



    @GetMapping("/expense/senddata")
    public ModelAndView homekj(){
        ModelAndView mav=new ModelAndView("home");
        expensetable exp=new expensetable();
        mav.addObject("expense",exp);

        return mav;
    }







}
