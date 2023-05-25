package vn.edu.hutech.selection;

import javax.swing.*;

public class GameUI {
    private RPS_Game_Engine rps;

    public GameUI(){
        rps = new RPS_Game_Engine();
    }

    public void playGame(){
        String [] sels = {"Continue", "Stop"};
        do {
            rps.play();
            Object choice = JOptionPane.showOptionDialog(null, "Your choice: ",
                    "Player",
                    JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null,
                    sels, "Rock");
            if(choice.equals(JOptionPane.NO_OPTION)){
                break;
            }
        }while(true);
    }
}
