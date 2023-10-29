package com.expense.expensetracker.service;
import com.expense.expensetracker.entity.expensetable;

import java.util.List;
import java.util.Optional;


public interface expenseservice {
     expensetable saveexpensedetails(expensetable expensetable);
    List<expensetable> fetchdetails();
    Optional<expensetable> findbyId(Long id);
    void deletebyid(Long id);






}
