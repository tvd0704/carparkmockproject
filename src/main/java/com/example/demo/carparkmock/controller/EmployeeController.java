package com.example.demo.carparkmock.controller;

import com.example.demo.carparkmock.dto.employee.EmployeeRequest;
import com.example.demo.carparkmock.dto.employee.EmployeeResponse;
import com.example.demo.carparkmock.enity.Employee;
import com.example.demo.carparkmock.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public ResponseEntity<EmployeeResponse> addEmployee (@RequestBody final EmployeeRequest employeeRequest) {
        EmployeeResponse employeeResponse = employeeService.addEmployee(employeeRequest);
        return new ResponseEntity<>(employeeResponse, HttpStatus.OK);
    }

    @GetMapping("/get/{employeeId}")
    public ResponseEntity<EmployeeResponse> getEmployee (@PathVariable final Long employeeId) {
        EmployeeResponse employeeResponse = employeeService.getById(employeeId);
        return new ResponseEntity<>(employeeResponse,HttpStatus.OK);
    }

    @GetMapping("/get/all")
    public ResponseEntity<List<EmployeeResponse>> getAllEmployee () {
        List<EmployeeResponse> employeeResponseList = employeeService.getEmployeeList();
        return  new ResponseEntity<>(employeeResponseList,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{employeeId}")
    public ResponseEntity<EmployeeResponse> deleteEmployee (@PathVariable final Long employeeId) {
        EmployeeResponse employeeResponse = employeeService.deleteEmployee(employeeId);
        return new ResponseEntity<>(employeeResponse,HttpStatus.OK);
    }

    @PutMapping("/update/{employeeId}")
    public ResponseEntity<EmployeeResponse> updateEmployee (@PathVariable final Long employeeId, @RequestBody final EmployeeRequest employeeRequest) {
        EmployeeResponse employeeResponse = employeeService.updateEmployee(employeeId,employeeRequest);
        return  new ResponseEntity<>(employeeResponse,HttpStatus.OK);
    }

}
