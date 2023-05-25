package vn.edu.hutech.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vn.edu.hutech.selection.RPS_Game_Engine;

public class rps_game_test {

    @Test
    void test (){
        RPS_Game_Engine rps_game = new RPS_Game_Engine();
        int val = rps_game.generateNumber();
        for(int i = 0; i <= 100; i++){
            Assertions.assertTrue(val>=1 && val<=3);
        }
    }
}
