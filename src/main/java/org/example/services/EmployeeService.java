package org.example.services;

import org.example.daos.EmployeeDao;
import org.example.models.Employee;

import java.sql.SQLException;
import java.util.List;

public final class EmployeeService {
    private EmployeeService() {
    }

    EmployeeDao employeeDao;

    public EmployeeService(final EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }


    public List<Employee> getAllSalesEmloyees() throws SQLException {
        return employeeDao.getAllSalesEmloyees();
    }

}
