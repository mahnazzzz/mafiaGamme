
package strategyi.model;

import java.util.ArrayList;
import java.util.HashMap;
import strategyi.model.Drugs;

/**
 * must crate and manage all the icecreams.
 *
 * @author Bruger
 */
public class Drugs_Manager {

    private HashMap<String, Drugs> drugsCollection;

    public Drugs_Manager() {
        drugsCollection = CreateDRUGS();
    }

    public static HashMap<String,Drugs> CreateDRUGS() {
        HashMap<String, Drugs> tempCollection;
        tempCollection = new HashMap();
        tempCollection.put("Cocaine", new Drugs("Cocaine",1000, 100, new PEICE_OLD_MEMORY()));
        tempCollection.put("Heroin", new Drugs("Heroin",180,40, new PRICE_10_procent()));
        tempCollection.put("Amphetamine", new Drugs("Amphetamine",200,50, new PRICE_RANDOM()));
        tempCollection.put("Acid", new Drugs("Acid",550,33, new PRICE_RANDOM()));
        tempCollection.put("Angel dust", new Drugs("Angel dust",400, 60,new PRICE_Pick_On_Of_10()));
        tempCollection.put("Crystal Meth", new Drugs("Crystal Meth",800,38, new PRICE_BASE()));
        tempCollection.put("Hash", new Drugs("Hash",180,100, new PRICE_TWO_CHOISE()));
        tempCollection.put("weed", new Drugs("weed",150,115, new PRICE_Pick_On_Of_10()));
        tempCollection.put("Mushrooms", new Drugs("Mushrooms",120,95, new PRICE_SECONDS_OF_THE_CLOCK()));
        tempCollection.put("Valium", new Drugs("Valium",290,80, new PRICE_BASE()));
        
        return tempCollection;
    }
    
    public HashMap<String, Drugs> getDrugsCollection() {
        return drugsCollection;
    }
    
    public String drugsToString() {
        String temp = "";
        for (Drugs Drugs : drugsCollection.values()) {
            temp += Drugs.toString() + "\n";
        }
        return temp;
    }

    public void calculateNewPriceAvail() {
        for (Drugs drugObject : drugsCollection.values()) {
            drugObject.getNewPrice();
            drugObject.getNewAvailabilityy();
        }
    }
   
     public void increaseDrugsAmount(String selected, int newamount) {
        drugsCollection.get(selected).setNextAvailability(newamount);
      
    }

    public void decreaseDrugsAmount(String selected, int newamount) {
        
      int x = 0-newamount;  
      drugsCollection.get(selected).setNextAvailability(x);   

    }
    
    public Drugs getDrugs (String key)
    {
       return drugsCollection.get(key);
        
    }
}
