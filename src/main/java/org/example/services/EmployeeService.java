package org.example.services;

import org.example.daos.EmployeeDao;
import org.example.daos.TestDao;
import org.example.models.Employee;

import java.sql.SQLException;
import java.util.List;

public class EmployeeService {

    EmployeeDao employeeDao; // needs changed to employeeDAO when ready

    public EmployeeService(final EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    } // change to employeeDAO


    public List<Employee> getAllSalesEmloyees() throws SQLException {
        return EmployeeDao.getAllSalesEmloyees();
    }

}
