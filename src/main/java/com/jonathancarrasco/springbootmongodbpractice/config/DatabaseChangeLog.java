package com.jonathancarrasco.springbootmongodbpractice.config;

import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;
import com.jonathancarrasco.springbootmongodbpractice.model.Expense;
import com.jonathancarrasco.springbootmongodbpractice.model.ExpenseCategory;
import com.jonathancarrasco.springbootmongodbpractice.repository.ExpenseRepository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static com.jonathancarrasco.springbootmongodbpractice.model.ExpenseCategory.*;

@ChangeLog
public class DatabaseChangeLog {


    @ChangeSet(order = "001", id = "seedDatabase", author = "Jon")
    public void seedDatabase(ExpenseRepository expenseRepository){
        List<Expense> expenseList = new ArrayList<>();
        expenseList.add(createNewExpense("Movie Ticket", ENTERTAINMENT, BigDecimal.valueOf(60)));
        expenseList.add(createNewExpense("Dinner", RESTAURANT, BigDecimal.valueOf(47)));
        expenseList.add(createNewExpense("Netflix", ENTERTAINMENT, BigDecimal.valueOf(10)));
        expenseList.add(createNewExpense("Gym", UTILTIES, BigDecimal.valueOf(50)));
        expenseList.add(createNewExpense("Internet", MISC, BigDecimal.valueOf(30)));

        expenseRepository.insert(expenseList);
    }

    private Expense createNewExpense(String expenseName, ExpenseCategory expenseCategory, BigDecimal expenseAmount){
        Expense expense = new Expense();
        expense.setExpenseName(expenseName);
        expense.setExpenseCategory(expenseCategory);
        expense.setExpenseAmount(expenseAmount);

        return expense;
    }

}
