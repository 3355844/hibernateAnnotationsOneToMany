package simpleHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by user on 20.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Director director = session.get(Director.class, 13);
        Department department = (Department) session.get(Department.class, 11);
        director.getDepartmentSet().add(department);
//        director.setDirectorName("Andrew");
//        System.out.println(department.toString());
//        List<Department> departments = List<Department>();
//        departments.add(department);
//        session.save(director);
        department.setDirector(director);
        System.out.println(director.toString());
//        department.setDepartmentName("Kisses");
//        Employee employee = new Employee();
//        employee.setFirstName("Andrei");
//        employee.setCellPhone("0676767676");
//        employee.setLastName("Ponomarenko");
//        employee.setDepartment(department);
//        session.save(employee);
//        department.setEmployees(employee);
        session.getTransaction().commit();
        session.close();
        HibernateUtil.shutdown();
    }
}
