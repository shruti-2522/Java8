package Coding.Intermediate;

public class Employe {

    int empid;
    String empName;
    String department;

    public int getEmpid() {
        return empid;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "empid=" + empid +
                ", empName='" + empName + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Employe(int empid, String empName, String department) {
        this.empid = empid;
        this.empName = empName;
        this.department = department;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public Employe(int empid) {
        this.empid = empid;
    }
}
