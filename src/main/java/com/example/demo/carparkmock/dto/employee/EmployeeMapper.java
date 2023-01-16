package com.example.demo.carparkmock.dto.employee;

import com.example.demo.carparkmock.enity.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMapper {


    public static  EmployeeResponse employeeResponse (Employee employee) {
        EmployeeResponse employeeResponse = new EmployeeResponse();
        employeeResponse.setName(employee.getEmployeeName());
        employeeResponse.setDateOfBirth(employee.getEmployeeBirthDate());
        employeeResponse.setAddress(employee.getEmployeeAddress());
        employeeResponse.setPhoneNumber(employee.getEmployeePhone());
        employeeResponse.setDepartment(employee.getDepartment());
        return employeeResponse;
    }

    public static List<EmployeeResponse> employeeResponseList (List<Employee> employeeList) {
        List<EmployeeResponse> employeeResponseList = new ArrayList<>();
        for (Employee employee:employeeList) {
            employeeResponseList.add(employeeResponse(employee));
        }
        return employeeResponseList;
    }

}
