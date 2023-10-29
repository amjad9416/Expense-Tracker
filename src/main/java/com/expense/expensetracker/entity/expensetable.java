package com.expense.expensetracker.entity;


import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "Expense")
public class expensetable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long Expenseid;



    private String name;


    private String note;


    private BigDecimal amount;


    private String Date;

    public Long getExpenseid() {
        return Expenseid;
    }

    public void setExpenseid(Long Expenseid) {
        this.Expenseid =Expenseid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    @Override
    public String toString() {
        return "expensetable{" +
                "Expenseid=" + Expenseid +
                ", name='" + name + '\'' +
                ", note='" + note + '\'' +
                ", amount=" + amount +
                ", Date=" + Date +
                '}';
    }
}
