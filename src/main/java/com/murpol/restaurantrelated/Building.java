package com.murpol.restaurantrelated;

abstract class Building {

    private Integer roomsNumber;
    private boolean isKitchen;
    private Integer bathroomNumber;

    public Building(Integer roomsNumber, boolean isKitchen, Integer bathroomNumber) {
        this.roomsNumber = roomsNumber;
        this.isKitchen = isKitchen;
        this.bathroomNumber = bathroomNumber;
    }

    public Integer getRoomsNumber() {
        return roomsNumber;
    }

    public void setRoomsNumber(Integer roomsNumber) {
        this.roomsNumber = roomsNumber;
    }

    public boolean getIsKitchen() {
        return isKitchen;
    }

    public void setIsKitchen(boolean isKitchen) {
        this.isKitchen = isKitchen;
    }

    public Integer getBathroomNumber() {
        return bathroomNumber;
    }

    public void setBathroomNumber(Integer bathroomNumber) {
        this.bathroomNumber = bathroomNumber;
    }

    @Override
    public String  toString() {
        return String.format("""
                *** Building status ***
                Building has %d room(s) and %s kitchen. There are also %d bathroom(s)
                "*** End of building status ***""",roomsNumber, isKitchen ? "" : "no",bathroomNumber );
    }
}
