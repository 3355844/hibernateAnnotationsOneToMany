package simpleHibernate;

import javax.persistence.*;
import java.util.List;

/**
 * Created by user on 20.12.2016.
 */
@Entity
@Table
public class Department {
    @Id
    @GeneratedValue
    @Column(name = "department_id")
    private int departmentId;
    @Column(name = "department_name")
    private String departmentName;
    @OneToOne(mappedBy = "department")
    private Employee employees;
    @ManyToOne
    @JoinColumn (name = "directorId")
    private Director  director;
//    @ManyToMany (mappedBy = "MANAGER")
//    private List<Manager> managerList;
//
//    public List<Manager> getManagerList() {
//        return managerList;
//    }
//
//    public void setManagerList(List<Manager> managerList) {
//        this.managerList = managerList;
//    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Employee getEmployees() {
        return employees;
    }

    public void setEmployees(Employee employees) {
        this.employees = employees;
    }
}
