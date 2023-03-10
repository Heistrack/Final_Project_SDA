//package com.example.final_project.infrastructure;
//
//import com.example.final_project.domain.expenses.Expense;
//import com.example.final_project.domain.expenses.ExpenseId;
//import org.springframework.stereotype.Repository;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Optional;
//
//@Repository
//public class InMemoryExpenseRepository implements ExpenseRepository {
//
//    private final Map<ExpenseId, Expense> storage = new HashMap<>();
//
//    @Override
//    public Expense save(Expense expense) {
//        return storage.put(expense.expenseId(), expense);
//    }
//
//    @Override
//    public Optional<Expense> getExpenseById(ExpenseId expenseId) {
//        return Optional.ofNullable(storage.get(expenseId));
//    }
//
//    @Override
//    public void deleteExpenseById(ExpenseId expenseId) {
//        storage.remove(expenseId);
//    }
//
//    @Override
//    public List<Expense> getAllExpenses() {
//        return storage.values().stream().toList();
//    }
//
//    @Override
//    public Expense updateExpenseById(Expense expense) {
//        storage.replace(expense.expenseId(), expense);
//        return expense;
//    }
//}
