package com.murpol.restaurantrelated;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashMap;
import java.util.Map;
import static org.assertj.core.api.Assertions.*;


class MenuMapMethodsImplementationTest {

    private MenuMapMethodsImplementation mapMethodsImplementation;
    private Map<Integer, MenuItem> menu;

    @BeforeEach
    void setUp(){
        mapMethodsImplementation = new MenuMapMethodsImplementation();
        menu = new HashMap<>();
    }


    @Test
    void shouldMenuBeEmpty(){

        //when
        assertThat(menu).isEmpty();
    }

    @Test
    @Disabled
    void shouldAddItemsToMenu() {
        //given
        MenuItem frytki = new MenuItem("Frytki", "Posiekane i upieczone ziemniaki", "14 PLN");
        MenuItem burger = new MenuItem("Burger", "Posiekane i upieczone ziemniaki", "34 PLN");
        MenuItem pizza = new MenuItem("Pizza", "Posiekane i upieczone ziemniaki", "41 PLN");
        //when
        mapMethodsImplementation.addMenuItems(menu,frytki);
        mapMethodsImplementation.addMenuItems(menu,burger);
        mapMethodsImplementation.addMenuItems(menu,pizza);

        //then
        assertThat(menu.containsKey(2)).isTrue();
        assertThat(menu.containsKey(1)).isTrue();
        assertThat(menu.containsKey(3)).isTrue();

    }

    @ParameterizedTest
    @ValueSource(strings = {"frYTKi", "FRytki", "Frytki", "frytki", "FRYTkI"})
    void shouldReturnPriceIfGivenItemName(String itemName) {
        //given

        MenuItem frytki = new MenuItem("Frytki", "Posiekane i upieczone ziemniaki", "14 PLN");

        menu.put(1, frytki);

        //when

        //then
        assertThat(mapMethodsImplementation.fetchPriceOfMenuItemByName(menu, itemName)).isEqualTo("14 PLN");
    }

    @Test
    @Disabled
    void printEntireMenu() {
    }
}