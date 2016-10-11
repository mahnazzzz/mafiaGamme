package strategyi.view;


import javax.swing.JFrame;

public class MafiaGamestartMain {
    
    
    public static void main(String[] args) 
    {
        
       JFrame Frame1 = new JFrame("MAFIA GAME");
       Frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       Frame1.setVisible(true);              
       Frame1.getContentPane().add(new JPanelStartMafiaGame());        
       Frame1.pack();     
    }
    
                          
    
   
}
