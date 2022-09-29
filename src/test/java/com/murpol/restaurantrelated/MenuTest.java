package com.murpol.restaurantrelated;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;


class MenuTest {

    private Menu menuClass;
    private Map<Integer, MenuItem> menu;

    @BeforeEach
    void setUp() {
        menuClass = new Menu();
        menu = new HashMap<>();
    }


    @Test
    void shouldMenuBeEmpty() {

        //when
        assertThat(menu).isEmpty();
    }

    @Test
    @Disabled
    void shouldAddItemsToMenu() {
        //given
        MenuItem frytki = new MenuItem("Frytki", "Posiekane i upieczone ziemniaki", new BigDecimal(14));
        MenuItem burger = new MenuItem("Burger", "Posiekane i upieczone ziemniaki", new BigDecimal(34));
        MenuItem pizza = new MenuItem("Pizza", "Posiekane i upieczone ziemniaki", new BigDecimal(41));
        //when
        menuClass.addMenuItems(frytki);
        menuClass.addMenuItems(burger);
        menuClass.addMenuItems(pizza);

        //then
        assertThat(menu.containsKey(2)).isTrue();
        assertThat(menu.containsKey(1)).isTrue();
        assertThat(menu.containsKey(3)).isTrue();

    }

    @ParameterizedTest
    @ValueSource(strings = {"frYTKi", "FRytki", "Frytki", "frytki", "FRYTkI"})
    void shouldReturnPriceIfGivenItemName(String itemName) {
        //given

        MenuItem frytki = new MenuItem("Frytki", "Posiekane i upieczone ziemniaki", new BigDecimal(41));

        menuClass.addMenuItems(frytki);

        //when

        //then
        assertThat(menuClass.fetchPriceOfMenuItemByName(itemName)).isEqualTo(new MenuItem("Frytki", "Posiekane i upieczone ziemniaki", new BigDecimal(41)).getItemPrice().toPlainString());
    }

    @Test
    @Disabled
    void printEntireMenu() {
    }
}