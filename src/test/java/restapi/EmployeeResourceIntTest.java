package restapi;

import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.spi.spring.container.servlet.SpringServlet;
import com.sun.jersey.test.framework.JerseyTest;
import com.sun.jersey.test.framework.WebAppDescriptor;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.request.RequestContextListener;
import restapi.model.Employee;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class EmployeeResourceIntTest extends JerseyTest {

    public EmployeeResourceIntTest() throws Exception {
        super(new WebAppDescriptor.Builder("restapi")
                .contextPath("spring")
                .contextParam("contextConfigLocation", "classpath:springContextTest.xml")
                .servletClass(SpringServlet.class)
                .contextListenerClass(ContextLoaderListener.class)
                .requestListenerClass(RequestContextListener.class)
                .build());
    }

    @Test
    public void testGetEmployee() throws IOException {
        WebResource webResource = resource();
        String json = webResource.path("employee/95").accept("application/json").get(String.class);

        ObjectMapper mapper = new ObjectMapper();
        Employee employee = mapper.readValue(json, Employee.class);
        assertEquals("Brandstadmoen", employee.getLastName());
    }

}
