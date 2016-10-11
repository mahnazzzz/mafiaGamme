
package strategyi.controller;

/**
 *
 * @author Bruger
 */
public interface InterfacePriceAvailer {
    /**
     * Method must Calculate and return a new price.
     * @return int a new price
     */
     public int getprice();


    public int getavail();
    
    public int getNewPrice(int price);
    /**
     * 
     * method must calculate a new availability
     * @return int the new availability.
     */
    public int getNewAvailability(int availability);
}
