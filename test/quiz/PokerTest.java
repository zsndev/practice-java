package quiz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PokerTest {
    @Test
    public void playPoker() throws Exception {
        int[] a = new int[]{2, 4, 1, 2, 5, 6};
        Poker.Hand playerA = new Poker.Hand(a);
        int[] b = new int[]{3, 1, 3, 5, 6, 4};
        Poker.Hand playerB = new Poker.Hand(b);
        assertEquals("playerA", Poker.playPoker(playerA, playerB));
    }

}