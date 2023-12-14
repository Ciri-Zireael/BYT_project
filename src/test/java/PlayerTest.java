import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {
    Player player;
    @Before
    public void setUp(){
       player = new Player("player1");
    }

    @Test
    public void PlayerConstructorTest(){
        assertNotNull(player.getTeam());
    }

    @Test
    public void PlayerTeamCheck(){
        assertEquals("player1", player.getTeam().getPlayer().getUsername());
    }
}
