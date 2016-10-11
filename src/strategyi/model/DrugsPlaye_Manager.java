package strategyi.model;

import java.util.HashMap;

/**
 *
 * @author Bruger
 */
public class DrugsPlaye_Manager {

    private int PlayerMoney = 5000;
    private int stofAmount = 0;

    private HashMap< String, Integer> PlayerDrugscollection;
    private String playername = "";

    public DrugsPlaye_Manager() {

        PlayerDrugscollection = CreatePlayerDrugs();

    }

    public HashMap<String, Integer> CreatePlayerDrugs() {
        HashMap<String, Integer> tempCollection;
        tempCollection = new HashMap();

        tempCollection.put("Cocaine", stofAmount);
        tempCollection.put("Heroin", stofAmount);
        tempCollection.put("Amphetamine", stofAmount);
        tempCollection.put("Acid", stofAmount);
        tempCollection.put("Angel dust", stofAmount);
        tempCollection.put("Crystal Meth", stofAmount);
        tempCollection.put("Hash", stofAmount);
        tempCollection.put("weed", stofAmount);
        tempCollection.put("Mushrooms", stofAmount);
        tempCollection.put("Valium", stofAmount);
       
        return tempCollection;
    }

    public String drugsPlayerToString() {
        String temp = "Stof" + "\t" + "Amount of drugs" + "\t" + "\n";
        for (String key : PlayerDrugscollection.keySet()) {
            temp += key + "\t" + PlayerDrugscollection.get(key) + "\n";
        }
        return temp;
    }

    public boolean drugsLastTurn() {
        boolean f = false;
        for (String key : PlayerDrugscollection.keySet()) {

            if (PlayerDrugscollection.get(key) > 0) {
                f = true;
            }

        }
        return f;
    }

    public int increase(String selected, int newamount) {
        int amount = PlayerDrugscollection.get(selected);
        amount += newamount;
        PlayerDrugscollection.put(selected, amount);

        return PlayerDrugscollection.get(selected);
    }

    public int decrease(String selected, int newamount) {
        int amount = PlayerDrugscollection.get(selected);
        amount -= newamount;
        PlayerDrugscollection.put(selected, amount);

        return PlayerDrugscollection.get(selected);
    }

    public int getPlayerMoney() {
        return PlayerMoney;
    }

    public void setPlayerMoney(int PlayerMoney) {
        this.PlayerMoney = PlayerMoney;
    }

    public int getValue(String selected) {
        return PlayerDrugscollection.get(selected);
    }

    public String getPlayername() {
        return playername;
    }

    public void setPlayername(String playername) {
        this.playername = playername;
    }

}
