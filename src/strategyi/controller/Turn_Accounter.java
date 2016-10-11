/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategyi.controller;

/**
 *
 * @author Bruger
 */
public class Turn_Accounter {
    private int turn =0;
    private static Turn_Accounter instance =null;
    private Turn_Accounter() {
    }
    public static Turn_Accounter getInstance(){
       if (instance ==null) 
       {instance = new Turn_Accounter();}
      return instance; 
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn() {
        turn++;
    }
    
}
