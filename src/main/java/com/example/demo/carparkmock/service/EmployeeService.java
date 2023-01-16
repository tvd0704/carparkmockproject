package com.example.demo.carparkmock.service;

import com.example.demo.carparkmock.dto.employee.EmployeeRequest;
import com.example.demo.carparkmock.dto.employee.EmployeeResponse;
import com.example.demo.carparkmock.enity.Employee;

import java.util.List;

public interface EmployeeService {

    public EmployeeResponse addEmployee (EmployeeRequest employeeRequest);

    public Employee employeeGetById (Long employeeId);

    public EmployeeResponse getById (Long employeeId);

    public List<EmployeeResponse> getEmployeeList ();

    public EmployeeResponse deleteEmployee (Long employeeId);

    public EmployeeResponse updateEmployee (Long employeeId, EmployeeRequest employeeRequest);

}
