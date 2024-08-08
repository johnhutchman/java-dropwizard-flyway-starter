package org.example.controllers;

import io.swagger.annotations.Api;
import org.example.services.TestService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.SQLException;

@Api("Test API")
@Path("/api/employees") // change to /api/employee
public class EmployeeController {

    TestService testService; // change to employee service when created

    public EmployeeController(final TestService testService) { // add employee service when setup
        this.testService = testService; // change to employee service when created
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getEmployees() throws SQLException {
        return Response.ok().entity(testService.getAllEmployees()).build(); //update to employee service when ready
    }
}