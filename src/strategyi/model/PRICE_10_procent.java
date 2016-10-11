package strategyi.model;

import strategyi.controller.InterfacePriceAvailer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bruger
 */
public class PRICE_10_procent implements InterfacePriceAvailer{
    
    private int price;
    private int amount;

    @Override
    public int getprice() {
        return price;
    }

    @Override
    public int getavail() {
        return amount;
    }

    @Override
    public int getNewPrice(int price) {
        
        price = (int)(price*1.1);        
        
        return price;
    }

    @Override
    public int getNewAvailability(int availability) {
        availability =(int)( availability*1.1);
        return availability;
    }
    
}
