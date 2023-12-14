import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ParticipationTest {
    Player player;
    @Before
    public void setUp(){
        player = new Player("player1");
    }
    @Test
    public void testGetPlayer() {
        Participation participation = new Participation(player);
        assertEquals(player, participation.getPlayer());
    }

    @Test
    public void testGetBattle() {
        Participation participation = new Participation(player);
        assertNull(participation.getBattle());
    }

    @Test
    public void testGetResult() {
        Participation participation = new Participation(player);
        participation.setResult(BattleResult.DRAW);
        assertEquals(BattleResult.DRAW, participation.getResult());
    }

    @Test
    public void testSetResult() {
        Participation participation = new Participation(player);
        BattleResult result = BattleResult.WIN;
        participation.setResult(result);
        assertEquals(result, participation.getResult());
    }

}
