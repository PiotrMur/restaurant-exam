package com.murpol.restaurantrelated;

import java.util.Map;

public interface MenuMapMethods {

    void addMenuItems(Map<Integer, MenuItem> menu, MenuItem menuItem);
    String fetchPriceOfMenuItemByName(Map<Integer, MenuItem> menu, String itemName);
    void printEntireMenu(Map<Integer, MenuItem> menu);

}
