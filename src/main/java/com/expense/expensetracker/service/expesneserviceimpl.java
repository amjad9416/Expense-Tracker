package com.expense.expensetracker.service;


import com.expense.expensetracker.entity.expensetable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.expense.expensetracker.repository.repository;

import java.util.List;
import java.util.Optional;

@Service

public class expesneserviceimpl implements expenseservice {


    @Autowired
    private final repository repository;

    public expesneserviceimpl(com.expense.expensetracker.repository.repository repository) {
        this.repository = repository;
    }


    @Override
    public expensetable saveexpensedetails(expensetable expensetable) {
        return repository.save(expensetable);
    }

    @Override
    public List<expensetable> fetchdetails() {
        return (List<expensetable>) repository.findAll();
    }

    public Optional<expensetable> findbyId(Long id) {
        return repository.findById(id);
    }

    @Override
    public void deletebyid(Long id) {
        repository.deleteById(id);
    }
}
