package org.example.controllers;

import io.swagger.annotations.Api;
import org.example.services.EmployeeService;
import org.example.services.TestService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.SQLException;

@Api("Employee API")
@Path("/api/employees") // change to /api/employee
public class EmployeeController {

    EmployeeService employeeService; // change to employee service when created

    public EmployeeController(final EmployeeService employeeService) { // add employee service when setup
        this.employeeService = employeeService; // change to employee service when created
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllSalesEmloyees() throws SQLException {
        return Response.ok().entity(employeeService.getAllSalesEmloyees()).build(); //update to employee service when ready
    }
}