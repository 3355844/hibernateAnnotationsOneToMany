package simpleHibernate;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by user on 23.12.2016.
 */
@Entity
@Table
public class Director {
    @Id
    @GeneratedValue
    @Column (name = "directorId")
    private int directorId;
    @Column
    private String directorName;
    @OneToMany (mappedBy = "director")
    private List<Department> departmentSet ;

    @Override
    public String toString() {
        return "Director{" +
                "directorId=" + directorId +
                ", directorName='" + directorName + '\'' +
                ", departmentSet=" + departmentSet +
                '}';
    }

    public List<Department> getDepartmentSet() {
        return departmentSet;
    }

    public void setDepartmentSet(List<Department> departmentSet) {
        this.departmentSet = departmentSet;
    }

    public int getDirectorId() {
        return directorId;
    }

    public void setDirectorId(int directorId) {
        this.directorId = directorId;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

}
