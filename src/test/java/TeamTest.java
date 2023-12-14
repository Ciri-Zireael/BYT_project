import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TeamTest {
    Player player;
    Team team;
    @Before
    public void setUp(){
        player = new Player("player1");
        team = new Team(player);
    }
    @Test
    public void testGetPlayer() {
        assertEquals(player, team.getPlayer());
    }

    @Test
    public void testGetPokemons() {
        assertNotNull(team.getPokemons());
        assertEquals(4, team.getPokemons().length);
    }
}
