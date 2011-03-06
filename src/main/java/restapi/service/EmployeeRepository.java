package restapi.service;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import restapi.model.Employee;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Transactional
@Repository
public class EmployeeRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public Employee get(int id) {
        return getEntityManager().find(Employee.class, id);
    }

    public void save(Employee employee) {
        getEntityManager().persist(employee);
    }

}