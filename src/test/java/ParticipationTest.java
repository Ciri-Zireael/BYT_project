import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParticipationTest {
    @Test
    public void testSetResult() {
        Player player = new Player("Player1");
        Player player2 = new Player("Player2");

        Participation participation = new Participation(player);
        Participation participation2 = new Participation(player2);
        BattleResult winResult = BattleResult.WIN;
        BattleResult drawResult = BattleResult.DRAW;


        participation.setResult(winResult);
        participation2.setResult(drawResult);
        assertEquals(2, player.getNumberOfPokeballs());
        assertEquals(1, player2.getNumberOfPokeballs());



    }
}
