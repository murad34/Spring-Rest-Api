package com.spring.rest.DAO;

import com.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeDaoInter {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
