package simpleHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Created by user on 20.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Department department = new Department();
        department.setDepartmentName("Sales");
        session.save(department);
        Employee employee = new Employee();
        employee.setCellPhone("0676776767");
        employee.setDepartment(department);
        employee.setFirstName("Anderew");
        employee.setLastName("Ponomarenko");
        Employee employee2 = new Employee();
        employee2.setCellPhone("0677777777");
        employee2.setDepartment(department);
        employee2.setFirstName("Julia");
        employee2.setLastName("Ponomarenko");
        session.save(employee);
        session.save(employee2);
        session.getTransaction().commit();
        session.close();
        HibernateUtil.shutdown();
    }
}
