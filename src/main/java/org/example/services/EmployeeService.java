package org.example.services;

import org.example.daos.TestDao;
import org.example.models.Employee;

import java.sql.SQLException;
import java.util.List;

public class EmployeeService {

    TestDao testDao; // needs changed to employeeDAO when ready

    public EmployeeService(final TestDao testDao) {
        this.testDao = testDao;
    } // change to employeeDAO

    public List<String> testConnection() throws SQLException {
        return testDao.testConnection(); // change to employeeDAO
    }

    public List<Employee> getAllDeliveryEmployees() throws SQLException {
        return EmployeeDao.getAllDeliveryEmployees();
    }

    public List<Employee> getAllSalesEmloyees() throws SQLException {
        return EmployeeDao.getAllSalesEmloyees();
    }

}
