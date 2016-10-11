/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategyi.model;

import strategyi.controller.InterfacePriceAvailer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Bruger
 */
public class PRICE_Pick_On_Of_10 implements InterfacePriceAvailer {

    private ArrayList<Drugs> arrCollctionDrugs;
    private int price;
    private int avail;
    private int random;

    public PRICE_Pick_On_Of_10() {

        arrCollctionDrugs = CreatePlayerDRUGS();
        
    }

    public ArrayList<Drugs> CreatePlayerDRUGS() {
        ArrayList<Drugs> tempCollection;
        tempCollection = new ArrayList();
        tempCollection.add(new Drugs(150, 100));
        tempCollection.add(new Drugs(230, 190));
        tempCollection.add(new Drugs(180, 200000));
        tempCollection.add(new Drugs(2350, 2));
        tempCollection.add(new Drugs(17, 95));
        tempCollection.add(new Drugs(360, 30));
        tempCollection.add(new Drugs(190, 165));
        tempCollection.add(new Drugs(440, 185));
        tempCollection.add(new Drugs(550, 250));

        return tempCollection;
    }

    @Override
    public int getprice() {
        return price;
    }

    @Override
    public int getavail() {
        return avail;
    }

    @Override
    public int getNewPrice(int price) {
        Random chance = new Random();
        random = chance.nextInt(arrCollctionDrugs.size());
        price = arrCollctionDrugs.get(random).getPrice();
        return price;

    }

    @Override
    public int getNewAvailability(int availability) {
        Random chance = new Random();
        random = chance.nextInt(arrCollctionDrugs.size());
        availability = arrCollctionDrugs.get(random).getAvailability();
        return availability;
    }

}
