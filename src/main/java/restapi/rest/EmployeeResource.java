package restapi.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import restapi.model.Employee;
import restapi.service.EmployeeRepository;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;


@Component
@Path("/employee")
public class EmployeeResource {

    @Autowired
    EmployeeRepository employeeRepository;

    @Path("/{id}")
    @GET
    @Produces({"application/json"})
    public Employee get(@PathParam("id") String id) {
        return employeeRepository.get(Integer.valueOf(id));
    }

    @POST
    @Consumes({"application/json"})
    public Response post(Employee employee) {
        employeeRepository.save(employee);
        return Response.ok().build();
    }
}
