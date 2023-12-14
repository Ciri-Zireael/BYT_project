import exceptions.NegativeValueException;
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
    @Test
    public void testGetUsername() {
        assertEquals("player1", player.getUsername());
    }

    @Test
    public void testSetUsername() {
        player.setUsername("tHePlAyEr");
        assertEquals("tHePlAyEr", player.getUsername());
    }

    @Test
    public void testGetXP() {
        assertEquals(0, player.getXP());
    }

    @Test
    public void testSetXP() throws NegativeValueException {
            player.setXP(100);
            assertEquals(100, player.getXP());
            assertThrows(NegativeValueException.class, () -> player.setXP(-100));
    }


    @Test
    public void testGetLevel() {
        assertEquals(1, player.getLevel());
    }

    @Test
    public void testSetLevel() throws NegativeValueException {
        player.setLevel(1);
        assertEquals(1, player.getLevel());
        assertThrows(NegativeValueException.class, () -> player.setLevel(-1));
    }

    @Test
    public void testGetNumberOfPokeballs() {
        assertEquals(0, player.getNumberOfPokeballs());
    }

    @Test
    public void testSetNumberOfPokeballs() throws NegativeValueException {
        player.setNumberOfPokeballs(10);
        assertEquals(10, player.getNumberOfPokeballs());
        assertThrows(NegativeValueException.class, () -> player.setNumberOfPokeballs(-10));
    }

    @Test
    public void testGetPokemons() {
        assertNotNull(player.getPokemons());
        assertTrue(player.getPokemons().isEmpty());
    }

    @Test
    public void testGetTeam() {
        assertNotNull(player.getTeam());
        assertNull(player.getTeam().getPokemons()[0]);
    }

    @Test
    public void testGetFriends() {
        assertNotNull(player.getFriends());
        assertTrue(player.getFriends().isEmpty());
    }

    @Test
    public void testGetTradeOffers() {
        assertNotNull(player.getTradeOffers());
        assertTrue(player.getTradeOffers().isEmpty());
    }

    @Test
    public void testGetParticipations() {
        assertNotNull(player.getParticipations());
        assertTrue(player.getParticipations().isEmpty());
    }
}
