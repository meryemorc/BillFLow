package com.billflow.service;

import com.billflow.entity.Expense;
import java.util.List;

public interface ExpenseService {
    Expense saveExpense(Expense expense);
    List<Expense> getAllExpenses();
}
