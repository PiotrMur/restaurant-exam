package com.murpol.restaurantrelated;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

class Menu {

    final Map<Integer, MenuItem> menu;
    int indexPosition = 0;

    public Menu() {
        this.menu = new HashMap<>();
    }

    public void addMenuItems(MenuItem menuItem) {
        menu.put(++indexPosition, menuItem);
        System.out.println(menuItem.getItemName() + " was added into the menu at position " + indexPosition);
    }

    public BigDecimal fetchPriceOfMenuItemByName(String itemName) {

        Optional<BigDecimal> desiredMenuItemPrice = menu.values()
                .stream()
                .filter(menuItem -> menuItem.getItemName().equalsIgnoreCase(itemName))
                .map(MenuItem::getItemPrice)
                .findFirst();

        if (desiredMenuItemPrice.isEmpty()) {
            throw new NullPointerException("There is no [" + itemName + "] in Menu");
        }
        return desiredMenuItemPrice.get();
    }

    public void printEntireMenu() {
        System.out.println("*** Restaurant Menu ***");
        menu.forEach((key, value) ->
                System.out.println(key + ". " + value.getItemName() + " " + value.getItemDescription() + " item's price: " + value.getItemPrice())
        );
        System.out.println("*** End of restaurant menu ***");
    }

    public Map<Integer, MenuItem> getMenu() {
        return menu;
    }
}
