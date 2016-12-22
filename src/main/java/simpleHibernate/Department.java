package simpleHibernate;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by user on 20.12.2016.
 */
@Entity
@Table
public class Department {
    @Id
    @GeneratedValue
    @Column (name = "department_id")
    private long departmentId;
    @Column (name = "department_name")
    private String departmentName;
    @OneToMany(mappedBy = "department")
    private Set<Employee> employees;

    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}
