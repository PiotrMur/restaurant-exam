package com.murpol.restaurantrelated;

import com.murpol.restaurantrelated.Employee;
import com.murpol.restaurantrelated.Restaurant;

import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isWorking = true;
        Set<Employee> employees = new TreeSet<>(Comparator.comparing(Employee::getFullName));

        createMandatoryObjects(scanner, employees);


        while (isWorking) {

            System.out.println("""
                    List of available activities:
                    1. Add employee
                    2. Show employees' list
                    3. End programme
                    """);
            System.out.println("What would you like to do?");
            int whichActivity = scanner.nextInt();
            switch (whichActivity) {
                case 1 -> {
                    createAndAddEmployee(scanner, employees);
                }
                case 2 -> {
                    for (Employee employee : employees) {
                        System.out.printf(String.valueOf(employee) + "\n");
                    }
                    ;
                }
                default -> {
                    System.out.println("Program has been terminated");
                    isWorking = false;
                }
            }

        }


    }

    private static void createAndAddEmployee(Scanner scanner, Set<Employee> employees) {
        System.out.println("Enter full name:");
        String firstName = scanner.next();
        String lastName = scanner.next();
        String fullName = firstName + " " + lastName;
        System.out.println("Enter position (Chef/Waiter/Cook):");
        String position = scanner.next();
        System.out.println("Enter salary per hour:");
        BigDecimal salary = scanner.nextBigDecimal();
        employees.add(new Employee(fullName, position, salary));
        Optional<Employee> createdEmployee = employees.stream()
                .filter(employee -> employee.getFullName().equals(fullName))
                .findFirst();
        System.out.println("\n" + createdEmployee.get() + "\n");
    }

    private static void createMandatoryObjects(Scanner scanner, Set<Employee> employees) {

        System.out.println("Let's create a resturant!\nInsert number of rooms: ");

        Integer roomsNumber = scanner.nextInt();

        System.out.println("Is there a kitchen? (true/false): ");

        Boolean isKitchen = scanner.nextBoolean();

        System.out.println("Enter number of bathrooms: ");

        Integer bathroomsNumber = scanner.nextInt();

        Restaurant restaurant = new Restaurant(roomsNumber, isKitchen, bathroomsNumber, employees);
        System.out.println(restaurant);
    }
}
