package com.piecebyte.controller;

import com.piecebyte.dto.Employee;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Profile("dev")
@RestController
@RequestMapping(value = "/api/v1")
public class EmployeeController {


    @GetMapping(value = "/employees", produces = {"application/json"})
    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(
                new Employee(
                        "Aqeel Abbas", "aqeel@abbas.gmail.com", "Aqeel@Password"));
        return employees;
    }

    @GetMapping(value = "/greetings")
    public String showGreeting(@RequestParam String name) {
        return String.format("Hello, %s! Welcome to piecebyte blog", name);
    }
}
