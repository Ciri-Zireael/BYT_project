import exceptions.PlayerNullException;
import org.junit.Test;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class BattleTest {
    @Test
    public void GetDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        Battle battle = new Battle();
        assertEquals(dtf.format(LocalDate.now()), dtf.format(battle.getDate()));
    }

    @Test
    public void testSetPlayers() {
        Battle battle = new Battle();
        Participation player1 = new Participation(new Player("Player1"));
        Participation player2 = new Participation(new Player("Player2"));
        battle.setPlayer1(player1);
        battle.setPlayer2(player2);
        assertEquals(player1, battle.getPlayer1());
        assertEquals(player2, battle.getPlayer2());
    }

    @Test
    public void testGetPlayers() {
        Battle battle = new Battle();
        Participation player2 = new Participation(new Player("Player2"));
        battle.setPlayer2(player2);
        assertNull(battle.getPlayer1());
        assertEquals(player2, battle.getPlayer2());
    }
}
