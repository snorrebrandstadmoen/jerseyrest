package restapi.rest;

import com.sun.jersey.api.json.JSONConfiguration;
import com.sun.jersey.api.json.JSONJAXBContext;
import restapi.model.Employee;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;
import javax.xml.bind.JAXBContext;

@Provider
public class JAXBContentResolver implements ContextResolver<JAXBContext> {
    private JAXBContext context;
    private Class[] types = {Employee.class};

    public JAXBContentResolver() throws Exception {
        this.context = new JSONJAXBContext(JSONConfiguration.natural().build(), types);
    }

    public JAXBContext getContext(Class<?> objectType) {
        for (Class clazz : types) {
            if (clazz.equals(objectType)) {
                return context;
            }
        }

        return null;
    }
}