package strategyi.model;

import strategyi.controller.InterfacePriceAvailer;

public class Drugs {

    private String stofName;
    private int price;
    private int availability;
    private InterfacePriceAvailer InterfacepriceAvailer;

    public Drugs(int price, int availability) {
        this.price = price;
        this.availability = availability;
    }
    

    public Drugs(String name, int price, int availablity, InterfacePriceAvailer priceAvailerINTERFACE) {
        this.stofName = name;
        this.price = price;
        this.availability = availablity;
        this.InterfacepriceAvailer = priceAvailerINTERFACE;
    }

    public int getPrice() {
        return price;
    }

    public int getAvailability() {
        return availability;
    }

    public int getNewPrice() {

        price = InterfacepriceAvailer.getNewPrice(price);
        return price;
    }

    public int getNewAvailabilityy() {
        availability = InterfacepriceAvailer.getNewAvailability(availability);
        return availability;
    }
    
    public void setNextAvailability(int navailability) {

        availability = availability + navailability;
    }

    @Override
    public String toString() {
        return stofName + "\t price: " + getPrice() + "\t; Availibility :" + getAvailability();
    }

}
