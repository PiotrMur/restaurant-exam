package com.murpol.restaurantrelated;

import java.math.BigDecimal;

class MenuItem {

    String itemName;
    String itemDescription;
    BigDecimal itemPrice;

    public MenuItem(String itemName, String itemDescription, BigDecimal itemPrice) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Override
    public String toString() {
        return String.format("""
                %s "%s" with price: %s PLN
                """,itemName, itemDescription, itemPrice.toPlainString());
    }
}
