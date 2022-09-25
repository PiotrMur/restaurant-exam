package com.murpol;

import com.murpol.restaurantrelated.*;

public class Main {

    public static void main(String[] args) {

        /*Building resturant = new Building(4, true, 2);
        Building gym = new Building(7, false, 4);

        resturant.displayBuildingStatus();
        System.out.println("=================");
        gym.displayBuildingStatus();*/

        Employee karol = new Employee("Karol Okrasa", "Chef", "100 PLN");
        Employee alina = new Employee("Alina Michalska", "Waitress", "30 PLN");
        Employee robert = new Employee("Robert Maklowicz", "Cook", "50 PLN");

        Restaurant amberRestaurant = new Restaurant(5,true,4);
        amberRestaurant.addEmployee(karol);
        amberRestaurant.addEmployee(alina);
        amberRestaurant.addEmployee(robert);
        amberRestaurant.addEmployee(robert);


        System.out.println("");
        System.out.println("");

        amberRestaurant.printAllEmployees();


       /* Menu sanGiovani = new Menu();
        MenuItem frytki = new MenuItem("Frytki", "Posiekane i upieczone ziemniaki", "14 PLN");
        MenuItem burger = new MenuItem("Burger", "Bulka z miesem", "34 PLN");
        MenuItem pizza = new MenuItem("Pizza", "Placek z pomidorami, mozzarella i pepperoni", "41 PLN");

        System.out.println("");
        System.out.println("");
        sanGiovani.addMenuItems(sanGiovani.getMenu(), frytki);
        sanGiovani.addMenuItems(sanGiovani.getMenu(), burger);
        sanGiovani.addMenuItems(sanGiovani.getMenu(), pizza);

        System.out.println("");

        sanGiovani.printEntireMenu(sanGiovani.getMenu());
*/


    }
}
