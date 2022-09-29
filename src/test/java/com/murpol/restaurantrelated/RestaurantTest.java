package com.murpol.restaurantrelated;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.*;

class RestaurantTest {

    private Restaurant restaurant;

    @BeforeEach
    void setUp(){
        restaurant = new Restaurant(3,true,4, new HashSet<>());
    }

    @Test
    @Disabled
    void printAllEmployees() {
    }

    @Test
    void shouldAddNewEmployee() {
        //given
        Employee karol = new Employee("Karol Okrasa", "Chef", new BigDecimal(100));
        Employee alina = new Employee("Alina Michalska", "Waitress", new BigDecimal(30));
        Employee robert = new Employee("Robert Maklowicz", "Cook", new BigDecimal(50));
        //when
        restaurant.addEmployee(karol);
        //then
        assertThat(restaurant.getEmployeesList()).contains(karol);
    }

    @Test
    void shouldThrowExceptionWhenAddingDuplicateEmployee(){
        Employee karol = new Employee("Karol Okrasa", "Chef", new BigDecimal(100));

        restaurant.addEmployee(karol);

        assertThatThrownBy(() -> restaurant.addEmployee(karol))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("This employee [Karol Okrasa] already exist in the list");
    }

    @ParameterizedTest
    @ValueSource(strings = {"karoL Okrasa", "KAROL OkrASA", "Karol okrasa","kARoL oKRasa"})
    void shouldReturnEmployeesSalaryWhenProvidedWithName(String name){
        Employee karol = new Employee("Karol Okrasa", "Chef", new BigDecimal(45));
        restaurant.addEmployee(karol);

        String salary = restaurant.getEmployeeSalary(name);

        assertThat(salary).isEqualTo(karol.getSalaryPerHour());
    }

    @Test
    @Disabled
    void getEmployeesList() {
    }
}