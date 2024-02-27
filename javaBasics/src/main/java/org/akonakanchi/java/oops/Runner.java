package org.akonakanchi.java.oops;

public class Runner {

    public static void main(String[] args) {
        Employee e = new Employee("Aj","test");
        e.setEmail("aj@gmail.com");
        e.setPhone(1231234567);
        e.setEmployeeGrade("a");
        e.setSalary("412341");
        e.setTitle("analyst");

        System.out.println(e);
    }
}
