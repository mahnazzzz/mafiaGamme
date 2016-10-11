package strategyi.model;


public class HighScore implements Comparable<HighScore> {

    private  String name;
    private int score;
   
    public HighScore() {
    }
        
    public HighScore(String name, int score) {
        this.name = name;
        this.score = score;
        
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
    
    @Override
    public String toString() {
        return "Name:" + name + "\t HighScore: " + score ;
    }

    @Override
    public int compareTo(HighScore o) {
        if (score > o.getScore())
        {
            return -1;
        }
        else if(score < o.getScore()){
            return +1;
        }
        else{
            return 0;
        }
        
    }
    
}
