package org.example.javatest.player;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

@Test
    public void looses_when_dice_number_is_too_low(){
    Dice dice;
    dice = Mockito.mock(dice,3);
    Player player=new Player(dice,2);
    assertEquals(false,player.play());


}


}