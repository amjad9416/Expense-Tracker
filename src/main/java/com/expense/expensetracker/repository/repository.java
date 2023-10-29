package com.expense.expensetracker.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.expense.expensetracker.entity.expensetable;



@Repository
public interface repository extends CrudRepository<expensetable, Long> {
}
