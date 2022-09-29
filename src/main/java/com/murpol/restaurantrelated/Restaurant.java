package com.murpol.restaurantrelated;

import java.util.Optional;
import java.util.Set;

class Restaurant extends Building {

    final Set<Employee> employeesList;

    public Restaurant(Integer roomsNumber, Boolean kitchen, Integer bathroomNumber, Set<Employee> employeesList) {
        super(roomsNumber, kitchen, bathroomNumber);
        this.employeesList = employeesList;
    }

    public void printAllEmployees() {
        System.out.println("*** Employees List ***");
        for (Employee employee : employeesList) {
            System.out.println(employee.getFullName() + " is working as a " + employee.getPosition() + " with salary per hour: " + employee.getSalaryPerHour());
        }
        System.out.println("*** End of employees list ***");
    }

    public void addEmployee(Employee employee) {
        if (employeesList.contains(employee)) {
            throw new IllegalArgumentException("This employee [" + employee.getFullName() + "] already exist in the list");
        }
        employeesList.add(employee);
        System.out.println(employee.getFullName() + " was added to Employees list");
    }

    public String getEmployeeSalary(String fullName) {
        Optional<Employee> desiredEmployee = employeesList.stream()
                .filter(employee -> employee.getFullName().equalsIgnoreCase(fullName))
                .findFirst();

        if (desiredEmployee.isEmpty()) {
            throw new NullPointerException("There is no such " + fullName + " in the list");
        }

        System.out.println(desiredEmployee.get().getFullName() + " salary is: " + desiredEmployee.get().getSalaryPerHour());
        return desiredEmployee.get().getSalaryPerHour().toPlainString();
    }

    public Set<Employee> getEmployeesList() {
        return employeesList;
    }
}
