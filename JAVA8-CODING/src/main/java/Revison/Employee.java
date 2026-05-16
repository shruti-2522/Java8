package Revison;

public class Employee {
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    private int id;
    private String empname;
    private double salary;
    private String department;


    public int getId() {
        return id;
    }

    public Employee(int id, String empname, double salary, String department) {
        this.id = id;
        this.empname = empname;
        this.salary = salary;
        this.department = department;
    }


    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", empname='" + empname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
