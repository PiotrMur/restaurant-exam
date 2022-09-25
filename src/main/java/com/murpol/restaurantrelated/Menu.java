package com.murpol.restaurantrelated;

import java.util.HashMap;
import java.util.Map;

public class Menu extends MenuMapMethodsImplementation {

    private Map<Integer, MenuItem> menu;

    public Menu() {
        this.menu = new HashMap<>();
    }

    @Override
    public void addMenuItems(Map<Integer, MenuItem> menu, MenuItem menuItem) {
        super.addMenuItems(menu, menuItem);
    }

    @Override
    public String fetchPriceOfMenuItemByName(Map<Integer, MenuItem> menu, String itemName) {
        return super.fetchPriceOfMenuItemByName(menu, itemName);
    }

    @Override
    public void printEntireMenu(Map<Integer, MenuItem> menu) {
        super.printEntireMenu(menu);
    }

    public Map<Integer, MenuItem> getMenu() {
        return menu;
    }
}
