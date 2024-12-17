package com.kerosenelabs.billtracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.kerosenelabs.billtracker.entity.UserEntity;

import java.util.ArrayList;

@Controller
public class ExpensesController {
    @GetMapping("/expenses")
    public String getExpenses(UserEntity user, Model model) {
        model.addAttribute("expenses", new ArrayList<>() {{add("test");}});
        return "pages/expenses/manager";
    }
}