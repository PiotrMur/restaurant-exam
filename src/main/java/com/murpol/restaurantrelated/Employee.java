package com.murpol.restaurantrelated;

import java.math.BigDecimal;

class Employee {

    String fullName;
    String position;
    BigDecimal salaryPerHour;

    public Employee(String fullName, String position, BigDecimal salaryPerHour) {
        this.fullName = fullName;
        this.position = position;
        this.salaryPerHour = salaryPerHour;
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

    public BigDecimal getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(BigDecimal salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public void printEmployee(){
        System.out.println(new StringBuilder(fullName)
                .append(" works as a ")
                .append(position)
                .append(" and earns ")
                .append(salaryPerHour.toPlainString())
                .append(" PLN"));
    }
}
