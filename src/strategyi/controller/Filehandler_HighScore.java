package strategyi.controller;

import java.io.BufferedReader;import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import strategyi.model.HighScore;
import strategyi.model.HighScore;
import strategyi.model.HighScore;

public class Filehandler_HighScore {

    private ArrayList<HighScore> highScoreCollection;

    public Filehandler_HighScore() {

        highScoreCollection = new ArrayList();
    }

    public ArrayList<HighScore> getHighScoreCollectionPlayers() {
        return highScoreCollection;
    }

    public void add(String Name, int highScore) {

        highScoreCollection.add(new HighScore(Name, highScore));

    }


    public void saveScore(String fileName) {
        FileWriter fw;
        PrintWriter ud;
        try {
            fw = new FileWriter(new File(fileName));
            ud = new PrintWriter(fw);
            for (HighScore highScore : highScoreCollection) {
                ud.append(highScore.getName() + "," + highScore.getScore() + "\n");
                System.out.println("Highscore: " + highScore.getName() + ", " + highScore.getScore());
            }
            fw.close();
        } catch (Exception e) {
            System.out.println("some ting is wrong");
        }
    }

    public boolean loadHighScore(String fileName) {

        FileReader fr;
        BufferedReader br;
        String NewLine;
        String[] highScorString;
        boolean loadok = true;
        try {
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);
            while ((NewLine = br.readLine()) != null) {
                highScorString = NewLine.split(",");
                highScoreCollection.add(new HighScore(highScorString[0], Integer.parseInt(highScorString[1])));
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            loadok = false;
        }

        return loadok;
    }

    public String highScoreToString() {

        String temp = "";
        for (HighScore highScore : highScoreCollection) {
            temp += highScore.toString() + "\n";
        }
        return temp;
    }

    public String comparatorToString() {
        
        String temp ="";
        Collections.sort(highScoreCollection);
        for (HighScore o : highScoreCollection) {
           temp += o.toString() + "\n";
        }
        return temp;
    }
  
}
