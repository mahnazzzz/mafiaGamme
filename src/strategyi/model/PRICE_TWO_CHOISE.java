///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
package strategyi.model;

import strategyi.controller.InterfacePriceAvailer;
import strategyi.controller.Turn_Accounter;

/**
 *
 * @author Troels
 */
public class PRICE_TWO_CHOISE implements InterfacePriceAvailer {

    private int PriceWhite = 90;
    private int PriceBlack = 300;
    private int AmountWhite = 50;
    private int AmountBlack = 180;
    private int price = 0;      
    private int amount = 0;    
    Turn_Accounter ta = Turn_Accounter.getInstance();

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
        if (ta.getTurn() % 2 == 0) {
            price = PriceWhite;
        } else {
            price = PriceBlack;
        }
        return price;
    }

    @Override
    public int getNewAvailability(int availability) {
        if (ta.getTurn() % 2 == 0) {
            amount = AmountWhite;

        } else {
            amount = AmountBlack;
        }
        return amount;
    }

}
