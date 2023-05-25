package vn.edu.hutech.selection;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class RPS_Game_Engine {

    private String message;

    public String getMessage() {
        return message;
    }

    public void play(){
        // 1. Computer generate number in range[1,3]

        int compute_choice = generateNumber();
        int my_choice = enterChoice();
        int res = evaluateResult(compute_choice, my_choice);
        decision(res);

    }




    /**
     *
     * @paramn compute_choice compute_choice
     * @param my_choice my_choice
     * @return 0 = draw, 1 = player win, -1 = computer win
     */
    private int evaluateResult(int compute_choice, int my_choice) {
        int res = 0;
        // 0: rock, 1 paper, 2 scissors
        if(compute_choice == 0){
            if(my_choice == 0){
                res = 0;
                message = "Computer choice: Rock\nYour choice: Rock";
            }
            else if(my_choice == 1){
                res = 1;
                message = "Computer choice: Rock\nYour choice: Paper";
            } else{
                res = -1;
                message = "Computer choice: Rock\nYour choice: Scissors";
            }
        } else if(compute_choice == 1){
            if(my_choice == 0){
                res = -1;
                message = "Computer choice: Paper\nYour choice: Rock";
            }
            else if(my_choice == 1){
                res = 0;
                message = "Computer choice: Paper\nYour choice: Paper";
            } else{
                res = 1;
                message = "Computer choice: Paper\nYour choice: Scissors";
            }
        } else{
            if(my_choice == 0) {
                res = 1;
                message = "Computer choice: Scissors\nYour choice: Rock";
            }
            else if(my_choice == 1){
                res = -1;
                message = "Computer choice: Scissors\nYour choice: Paper";
            } else{
                res = 0;
                message = "Computer choice: Scissors\nYour choice: Scissors";
            }
        }
        return res;
    }

    private int enterChoice() {
        String sels [] = {"Rock" , "Paper", "Scissors" };
        Scanner sc = new Scanner(System.in);
//        String num = JOptionPane.showInputDialog("Your choice [1-3]: ");
//        Object num = JOptionPane.showInputDialog(null, "Your choice [1-3]: ",
//                "Enter your choice: ", JOptionPane.QUESTION_MESSAGE, null,
//                sels, "1");
        Object num = JOptionPane.showOptionDialog(null, "Your choice: ",
                "Player",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null,
                sels, "Rock");
        return Integer.parseInt(num.toString());
    }

    public int generateNumber(){
        Random rand = new Random();
        int compute_choices = rand.nextInt(2); // 0 - 2
        return compute_choices;
    }

    private void decision(int res) {
        if(res == 0){
            JOptionPane.showMessageDialog(null, message+"\nDraw");
        }else if(res == 1){
            JOptionPane.showMessageDialog(null, message+"\nYou win");
        } else{
            JOptionPane.showMessageDialog(null, message+"\nComputer win");
        }
    }

}
