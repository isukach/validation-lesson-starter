package by.hector.controller;

import by.hector.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

/**
 * @author i.sukach
 */
@Controller
public class EmployeeController {

    @ModelAttribute
    public Employee employee() {
        return new Employee();
    }

    @GetMapping("/employee")
    public String showEmployeePage() {
        return "employee";
    }

    @PostMapping("/employee")
    public String saveEmployee(Employee employee) {
        System.out.println(employee);
        return "employee";
    }
}
