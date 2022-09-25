package com.murpol.restaurantrelated;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Restaurant extends Building{

    private Set<Employee> employeesList;

    public Restaurant(Integer roomsNumber, Boolean kitchen, Integer bathroomNumber) {
        super(roomsNumber, kitchen, bathroomNumber);
        this.employeesList = new LinkedHashSet<>();
    }

    public void printAllEmployees(){
        System.out.println("*** Employees List ***");
        for (Employee employee : employeesList) {
            System.out.println(employee.getFullName() + " is working as a " + employee.getPosition() + " with salary per hour: " + employee.getSalaryPerHour());
        }
        System.out.println("*** End of employees list ***");
    }

    public void addEmployee(Employee employee){
        if (employeesList.contains(employee)) {
            throw new IllegalArgumentException("This employee [" + employee.getFullName() + "] already exist in the list");
        }
        employeesList.add(employee);
        System.out.println(employee.getFullName() + " was added to Employees list");
    }

    public String getEmployeeSalary(String fullName){
        Optional<Employee> desiredEmployee = employeesList.stream()
                .filter(employee -> employee.getFullName().equalsIgnoreCase(fullName))
                .findFirst();

        if (desiredEmployee.isEmpty()){
            throw new NullPointerException("There is no such " + fullName + " in the list");
        }

        System.out.println(desiredEmployee.get().getFullName() + " salary is: " + desiredEmployee.get().getSalaryPerHour());
        return desiredEmployee.get().getSalaryPerHour();
    }

    public Set<Employee> getEmployeesList() {
        return employeesList;
    }
}
