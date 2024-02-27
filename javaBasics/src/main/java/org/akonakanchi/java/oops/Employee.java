package org.akonakanchi.java.oops;

public class Employee extends Person{

    private String title;
    private String employer;
    private String employeeGrade;
    private String salary;

    public Employee(String name, String employer) {
        super(name);
        this.employer = employer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployer() {
        return employer;
    }

    public String getEmployeeGrade() {
        return employeeGrade;
    }

    public void setEmployeeGrade(String employeeGrade) {
        this.employeeGrade = employeeGrade;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Title: %s  Employer: %s  EmployeeGrade:%s  Salary:%s ",getTitle(),getEmployer(),getEmployeeGrade(),getSalary());
    }
}
