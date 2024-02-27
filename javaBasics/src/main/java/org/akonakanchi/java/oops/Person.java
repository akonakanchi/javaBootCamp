package org.akonakanchi.java.oops;

public class Person {
    private String name;
    private int phone;
    private String email;

    public Person(String name){
        this.name =name;
    }

    public String getName() {
        return name;
    }


    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("Name: %s  Phone: %d Email: %s",this.getName(),this.getPhone(),this.getEmail());
    }
}
