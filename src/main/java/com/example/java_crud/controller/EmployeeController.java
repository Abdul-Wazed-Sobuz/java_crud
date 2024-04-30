package com.example.java_crud.controller;

import com.example.java_crud.entity.Employee;
import com.example.java_crud.repository.EmployeeRepository;
import com.example.java_crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    EmployeeRepository employeeRepository;

    @PostMapping(value = "/create")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }

    @GetMapping("/all_employs")
    public List<Employee> getAllEmploys(){
        return employeeService.getAllEmploys();
    }

    @GetMapping("/show_employee/{id}")
    public Employee getEmployeeById(@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }

    @DeleteMapping("/show_employee/{id}")
    public void deleteEmployeeById(@PathVariable Long id){
        employeeService.deleteEmployeeById(id);
    }

    @PutMapping("/show_employee/{id}")
    public ResponseEntity<Employee> getUpdateEmployeeById(@PathVariable Long id, @RequestBody Employee employee){
        Employee getEmployee = employeeRepository.getReferenceById(id);
        getEmployee.setAddress(employee.getAddress());
        Employee update = employeeRepository.save(getEmployee);

        return ResponseEntity.ok().body(update);
    }
}
