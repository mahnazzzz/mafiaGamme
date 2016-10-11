/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategyi.controller;

import strategyi.model.Drugs;
import strategyi.model.Drugs_Manager;

/**
 *
 * @author Bruger
 */
public class Drugs_Controler {

    private Drugs_Manager drugsManger;

    public Drugs_Controler() {

        drugsManger = new Drugs_Manager();
    }

    public String allDrugstoString() {

        return drugsManger.drugsToString();
    }

    public void calculateNewPriceAvail() {

        drugsManger.calculateNewPriceAvail();
    }


    public void increase(String selected, int newamount) {

        drugsManger.increaseDrugsAmount(selected, newamount);
    }

    public void decrease(String selected, int newamount) {

        drugsManger.decreaseDrugsAmount(selected, newamount);
    }

    public Drugs getDrugs(String key) {

        return drugsManger.getDrugs(key);
    }
}
