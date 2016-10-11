/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategyi.controller;

import java.util.HashMap;
import strategyi.model.DrugsPlaye_Manager;

/**
 *
 * @author Bruger
 */
public class DrugsPlayer_Controler {
    
    private DrugsPlaye_Manager drugsPlayerManager;
 

    public DrugsPlayer_Controler() {
        drugsPlayerManager = new DrugsPlaye_Manager();
    }
    public String drugsPlayerToString() {
        return drugsPlayerManager.drugsPlayerToString();
    }
    public int increase(String selected, int newamount) {
       return drugsPlayerManager.increase(selected, newamount);
    }
    public int decrease(String selected, int newamount) {
         return drugsPlayerManager.decrease(selected, newamount);
    }
     public int getPlayerMoney() {
     
         return drugsPlayerManager.getPlayerMoney();
    }
      public void setPlayerMoney(int PlayerMoney) {
        drugsPlayerManager.setPlayerMoney(PlayerMoney);
    }
    public int getValue(String selected) {
        return drugsPlayerManager.getValue(selected);
    }
     public String getPlayername() {
        return drugsPlayerManager.getPlayername();
    }

    public void setPlayername(String playername) {
        drugsPlayerManager.setPlayername(playername);
    }
     public boolean drugsLastTurn(){
         return drugsPlayerManager.drugsLastTurn();
     }
}
