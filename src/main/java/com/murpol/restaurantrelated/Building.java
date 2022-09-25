package com.murpol.restaurantrelated;

public class Building {

    private Integer roomsNumber;
    private boolean isKitchen;
    private Integer bathroomNumber;

    public Building(Integer roomsNumber, boolean isKitchen, Integer bathroomNumber) {
        this.roomsNumber = roomsNumber;
        this.isKitchen = isKitchen;
        this.bathroomNumber = bathroomNumber;
    }

    public void displayBuildingStatus(){
        System.out.println("*** Building status ***");
        if (getIsKitchen()) {
            System.out.println("Building has " + roomsNumber + " room(s) and kitchen. Also with " + bathroomNumber + " bathroom(s).");
        } else {
            System.out.println("Building has " + roomsNumber + " room(s) and no kitchen. Also with " + bathroomNumber + " bathroom(s).");
        }
        System.out.println("*** End of building status ***");
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
        return "Building{" +
                "roomsNumber=" + roomsNumber +
                ", kitchen=" + isKitchen +
                ", bathroomNumber=" + bathroomNumber +
                '}';
    }
}
