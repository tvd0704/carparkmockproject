package com.example.demo.carparkmock.serviceiml;

import com.example.demo.carparkmock.dto.employee.EmployeeMapper;
import com.example.demo.carparkmock.dto.employee.EmployeeRequest;
import com.example.demo.carparkmock.dto.employee.EmployeeResponse;
import com.example.demo.carparkmock.enity.Employee;
import com.example.demo.carparkmock.repository.EmployeeRepository;
import com.example.demo.carparkmock.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceIml implements EmployeeService {

   @Autowired
    private EmployeeRepository employeeRepositoty;

    @Override
    public EmployeeResponse addEmployee(EmployeeRequest employeeRequest) {
        Employee employee = new Employee();
        employee.setEmployeeName(employeeRequest.getFullName());
        employee.setEmployeePhone(employeeRequest.getPhoneNumber());
        employee.setEmployeeBirthDate(employeeRequest.getDateOfBirth());
        employee.setSex(employeeRequest.isSex());
        employee.setEmployeeAddress(employeeRequest.getAddress());
        employee.setEmployeeEmail(employeeRequest.getEmail());
        employee.setAccount(employeeRequest.getAccount());
        employee.setPassword(employeeRequest.getPassword());
        employee.setDepartment(employeeRequest.getDepartment());

        employeeRepositoty.save(employee);
        return EmployeeMapper.employeeResponse(employee);
    }

    @Override
    public Employee employeeGetById(Long employeeId) {
        Employee employee = employeeRepositoty.findById(employeeId).orElseThrow(() -> new IllegalArgumentException("not found employee "+employeeId));
        return employee;
    }

    @Override
    public EmployeeResponse getById(Long employeeId) {
            Employee employee = employeeGetById(employeeId);
            return EmployeeMapper.employeeResponse(employee);
    }

    @Override
    public List<EmployeeResponse> getEmployeeList() {
        List<Employee> employeeList = employeeRepositoty.findAll();
        return EmployeeMapper.employeeResponseList(employeeList);
    }

    @Override
    public EmployeeResponse deleteEmployee(Long employeeId) {
            Employee employee = employeeGetById(employeeId);
            employeeRepositoty.delete(employee);
            return EmployeeMapper.employeeResponse(employee);
    }

    @Override
    public EmployeeResponse updateEmployee(Long employeeId, EmployeeRequest employeeRequest) {
        Employee employee = employeeGetById(employeeId);
        employee.setEmployeeName(employeeRequest.getFullName());
        return EmployeeMapper.employeeResponse(employee);

    }
}
