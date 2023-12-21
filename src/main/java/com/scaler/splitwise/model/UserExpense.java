package com.scaler.splitwise.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class UserExpense extends BaseModel {
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private Integer amount;
    private UserExpenseType type;
    @ManyToOne
    @JoinColumn(name = "expense_id")
    private Expense expense;
}
