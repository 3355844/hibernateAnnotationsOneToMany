package simpleHibernate;

import javax.persistence.*;
import java.util.List;

/**
 * Created by user on 25.12.2016.
 */
@Entity
@Table
public class Manager {
    @Id
    @GeneratedValue
    private int managerId;
    @Column
    private String managerName;

    //    @ManyToMany
//    @JoinTable (name = "MANAGER_DEPARTMENT", joinColumns = {@JoinColumn(name = "manager_id")},
//    inverseJoinColumns = {@JoinColumn(name = "department_id")})
//    private List<Department> departmentList;

//    public List<Department> getDepartmentList() {
//        return departmentList;
//    }
//
//    public void setDepartmentList(List<Department> departmentList) {
//        this.departmentList = departmentList;
//    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }
}
