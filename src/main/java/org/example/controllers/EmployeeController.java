package org.example.controllers;

import io.swagger.annotations.Api;
import org.example.services.EmployeeService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.SQLException;

@Api("Employee API")
@Path("/api/employees") // change to /api/employee
public class EmployeeController {

    EmployeeService employeeService;

    public EmployeeController(final EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllSalesEmloyees() throws SQLException {
        return Response.ok().entity(employeeService.getAllSalesEmloyees()).build();
    }
}