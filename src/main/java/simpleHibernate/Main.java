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
        Manager manager = new Manager();
        manager.setManagerName("Ololosha");
//        Department department = session.get(Department.class,15);
//        manager.getDepartmentList().add(department);
        session.save(manager);

//        department.getManagerList().add(manager);
//        session.update(department);
//        Director director = session.get(Director.class, 13);
//        Employee employee = session.get(Employee.class, 14);
//        employee.setFirstName("Developer");
//        employee.setLastName("Java");
//        employee.setCellPhone("06333366633");
//        Department department = session.get(Department.class, 15);
//        employee.setDepartment(department);
//        session.update(employee);
//        department.setDirector(director);
//        director.getDepartmentSet().add(department);
//        session.save(employee);
//        session.save(department);
//        session.update(director);
//        for (Department department1 : director.getDepartmentSet()) {
//            System.out.println(department1.getDepartmentName());
//        }
//        Department department = (Department) session.get(Department.class, 11);
//        director.getDepartmentSet().add(department);
//        director.setDirectorName("Andrew");
//        System.out.println(department.toString());
//        List<Department> departments = List<Department>();
//        departments.add(department);
//        session.save(director);
//        department.setDirector(director);
//        System.out.println(director.toString());
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
