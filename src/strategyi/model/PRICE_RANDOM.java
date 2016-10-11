/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategyi.model;

import strategyi.controller.InterfacePriceAvailer;
import java.util.Random;

/**
 *
 * @author Troels
 */
public class PRICE_RANDOM implements InterfacePriceAvailer {

    int price;
    int amount;

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
        Random chance2 = new Random();
        price = chance2.nextInt(12000) + 10;
        return price;
    }

    @Override
    public int getNewAvailability(int availability) {
        Random chance2 = new Random();
        amount = chance2.nextInt(400) + 2;
        return amount;    }

}
