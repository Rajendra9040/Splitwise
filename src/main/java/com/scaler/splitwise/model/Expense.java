package com.scaler.splitwise.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Expense extends BaseModel {
    private String description;
    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;
    private ExpenseType type;

//    private List<UserExpense> userExpenses;
}
