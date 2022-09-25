package com.murpol.restaurantrelated;

public class Employee {

    private String fullName;
    private String position;
    private String salaryPerHour;

    public Employee(String fullName, String position, String salaryPerHour) {
        this.fullName = fullName;
        this.position = position;
        this.salaryPerHour = salaryPerHour;
    }

    public void printEmployeeData() {
        System.out.println(getFullName() + " is working as a " + getPosition() + " with salary per hour: " + getSalaryPerHour());
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(String salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", salaryPerHour='" + salaryPerHour + '\'' +
                '}';
    }
}
