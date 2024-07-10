package com.example.aop;
import org.springframework.stereotype.Service;

import com.example.aop.Employee;
@Service
public class EmployeeService {
    public Employee createEmployee(String name, String empId)
    {
        Employee emp = new Employee();
        emp.setName(name);
        emp.setId(empId);
        return emp;
    }
    public void deleteEmployee(String empId) {
        System.out.println("Deleting the Emp with ID" + empId);
    }
}