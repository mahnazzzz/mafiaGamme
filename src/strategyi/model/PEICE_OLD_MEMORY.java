/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategyi.model;

import strategyi.controller.InterfacePriceAvailer;
import strategyi.controller.Turn_Accounter;
import java.util.Random;

/**
 *
 * @author Troels
 */
public class PEICE_OLD_MEMORY implements InterfacePriceAvailer {

    private int chance1;
    private int chance2;
    private int chance3;
    private int chance4;
    
    private int price;
    private int avail;
    
    Random chance = new Random();
    Turn_Accounter ta = Turn_Accounter.getInstance();

    /**
     * Method must Calculate and return a new price.
     *
     * @return int a new price
     */
    @Override
    public int getNewPrice(int price) {
        chance1 = chance.nextInt(100) + 1;
        chance2 = chance.nextInt(2) + 1;
        chance3 = chance.nextInt(55) + 10;
        chance4 = chance.nextInt(25) + 10;
        
        
        if (ta.getTurn() == 1) {

            if (chance1 > 50) {

                return price;

            } else {
              
                    double change = (double) chance3/100;
                   
                if (chance2 == 1) {
                    
                    price = (int) (price * (1+change)) + 75;
                    
                } else {
                    
                    price = (int) (price * (1-change)) + 75;
                }
                return price;
            }
        } else {
            
            if (chance1 > 50) {

                return price;

            } else {
                
                double change = (double) chance4/100;
                
                if (chance2 == 1) {
                    
                    price = (int) (price * (1+change)) + 17;
                    
                } else {
                    
                    price = (int) (price * (1-change)) + 17;
                }
            }
            return price;
        }
    }
    /**
     *
     * method must calculate a new availability
     *
     * @return int the new availability.
     */
    @Override
    public int getNewAvailability(int avail) {
        chance1 = chance.nextInt(100) + 1;
        chance2 = chance.nextInt(2) + 1;
        chance3 = chance.nextInt(55) + 10;
        chance4 = chance.nextInt(25) + 10;
         if (ta.getTurn() == 1) {

            if (chance1 > 50) {

                return avail;

            } else {
              
                    double change = (double) chance3/100;
                if (chance2 == 1) {
                    
                    avail = (int) (avail * (1+change)) + 7;
                } else {
                    avail = (int) (avail * (1-change)) + 7;
                }
                return avail;
            }
        } else {
            if (chance1 > 50) {

                return avail;

            } else {
                double change = (double) chance4/100;
                
                if (chance2 == 1) {
                    avail = (int) (avail * (1+change)) + 13;
                    
                } else {
                    
                    avail = (int) (avail * (1-change)) + 13;
                }
            }
            return avail;
        }
    }

    @Override
    public int getprice() {
        return price;
    }

    @Override
    public int getavail() {
        return avail;
    }

}
