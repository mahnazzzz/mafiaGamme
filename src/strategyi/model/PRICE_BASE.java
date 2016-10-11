package strategyi.model;

import strategyi.controller.InterfacePriceAvailer;
import java.util.Random;

/**
 *
 * @author Bruger
 */
public class PRICE_BASE implements InterfacePriceAvailer {

    private int chance1;
    private int chance2;
    private int chance3;

    private int price;
    private int avail;
    Random chance = new Random();
  
    


    /**
     * Method must Calculate and return a new price.
     *
     * @param price
     * @return int a new price
     */
    @Override
    public int getNewPrice(int price) {
                  
        chance1 = chance.nextInt(100) + 1;    
        chance2 = chance.nextInt(2) + 1;
        chance3 = chance.nextInt(85) + 1;
        
        if (chance1 > 65) {
            return price;
           
        } else {
            double change = (double) chance3 / 100;

            if (chance2 == 1) {
                   price = (int) (price * (1 + change));
                
                return price;
            } else {
                    price = (int) (price * (1 - change));
                
                return price;

            }

        }

    }

    /**
     *
     * method must calculate a new availability
     *
     * @param avail
     * @return int the new availability.
     */
    @Override
    public int getNewAvailability(int avail) {
        chance1 = chance.nextInt(100) + 1;
        chance2 = chance.nextInt(2) + 1;
        chance3 = chance.nextInt(40) + 15;
        
        if (chance1 > 65) {
            return avail;
        } else {
            
            double change = (double) chance3 / 100;
            if (chance2 == 1) {
                
                avail = (int) (avail * (1 + change));
                
                return avail;
            } else {
                avail = (int) (avail * (1 - change));
                return avail;
            }

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
