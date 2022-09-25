package com.murpol.restaurantrelated;

import java.util.Map;
import java.util.Optional;

public class MenuMapMethodsImplementation implements MenuMapMethods {

    @Override
    public void addMenuItems(Map<Integer, MenuItem> menu, MenuItem menuItem) {
        Integer generatedKey = menu.size()+1;
        menu.put(generatedKey, menuItem);
        System.out.println(menuItem.getItemName() + " was added into the menu at position " + generatedKey);
    }

    @Override
    public String fetchPriceOfMenuItemByName(Map<Integer, MenuItem> menu, String itemName) {

        Optional<MenuItem> desiredMenuItem = menu.values()
                .stream()
                .filter(menuItem -> menuItem.getItemName().equalsIgnoreCase(itemName))
                .findFirst();

        if (desiredMenuItem.isEmpty()) {
            throw new NullPointerException("There is no " + itemName + " in Menu");
        }

        String desiredMenuItemPrice = desiredMenuItem.get().getItemPrice();
        String desiredMenuItemName = desiredMenuItem.get().getItemName();

        System.out.println("Price of " + desiredMenuItemName + " is: " + desiredMenuItemPrice);
        return desiredMenuItemPrice;
    }

    @Override
    public void printEntireMenu(Map<Integer, MenuItem> menu) {
        System.out.println("*** Restaurant Menu ***");
        menu.forEach((key, value) ->
                System.out.println(key + ". " + value.getItemName() + " " + value.getItemDescription() + " item's price: " + value.getItemPrice())
        );
        System.out.println("*** End of restaurant menu ***");

    }
}
