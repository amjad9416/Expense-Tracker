package com.expense.expensetracker.controller;


import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.expense.expensetracker.entity.expensetable;

import com.expense.expensetracker.service.expenseservice;
import org.springframework.web.servlet.ModelAndView;
import com.expense.expensetracker.repository.repository;
//import javax.servlet.http.HttpServletRequest;

import java.math.BigDecimal;
import java.util.List;

@Controller

public class listexpense {

    private final Logger logger= (Logger) LoggerFactory.getLogger(listexpense.class);

    @Autowired
    private final expenseservice expenseservice;

    public listexpense(expenseservice expenseservice) {
        this.expenseservice = expenseservice;
    }

    @GetMapping("/expense")
    public ModelAndView fetchdeta(){
        List<expensetable> expenses = expenseservice.fetchdetails();
        BigDecimal totalAmount = expenses.stream()
                .map(expensetable::getAmount)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        int totalExpenses=expenseservice.fetchdetails().size();



        ModelAndView mav=new ModelAndView("list");
        mav.addObject("totalExpenses",totalExpenses);
        mav.addObject("totalAmount", totalAmount);
        mav.addObject("expenses",expenses);
        return mav;
    }
    @GetMapping("/showupdate")
    public  ModelAndView showupdate(@RequestParam Long expenseid){

        ModelAndView mav=new ModelAndView("home");
        expensetable expense=expenseservice.findbyId(expenseid).get();
        mav.addObject("expense",expense);
        return mav;
    }
    @GetMapping("/deleteexpense")
    public String deleteexpense(@RequestParam Long expenseid){
        expenseservice.deletebyid(expenseid);


        return "redirect:/expense";
    }








}
