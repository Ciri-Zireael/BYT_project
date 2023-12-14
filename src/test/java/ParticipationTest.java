import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParticipationTest {
    @Test
    public void testSetResult() {
        PokeballDistributor distributor = new PokeballDistributor();
        Player player = new Player("Player1", distributor);
        Player player2 = new Player("Player2", distributor);
        Battle battle = new Battle(player,player2);

        Participation participation = new Participation(player, battle);
        Participation participation2 = new Participation(player2, battle);
        BattleResult winResult = BattleResult.WIN;
        BattleResult drawResult = BattleResult.DRAW;


        participation.setResult(winResult);
        participation2.setResult(drawResult);
        assertEquals(2, player.getNumberOfPokeballs());
        assertEquals(1, player2.getNumberOfPokeballs());



    }
}
