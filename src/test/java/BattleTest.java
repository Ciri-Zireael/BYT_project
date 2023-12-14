import org.junit.Test;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.assertEquals;

public class BattleTest {
    PokeballDistributor pokeballDistributor = new PokeballDistributor();
    @Test
    public void GetDate() {
        Player player1 = new Player("Player 1", pokeballDistributor);
        Player player2 = new Player("Player 2", pokeballDistributor);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        Battle battle = new Battle(player1, player2);
        assertEquals(dtf.format(LocalDate.now()), dtf.format(battle.getDate()));
    }

    @Test
    public void GetPlayer1() {
        Player player1 = new Player("Player 1", pokeballDistributor);
        Player player2 = new Player("Player 2", pokeballDistributor);

        Battle battle = new Battle(player1, player2);
        assertEquals(player1, battle.getPlayer1());
    }

    @Test
    public void GetPlayer2() {
        Player player1 = new Player("Player 1", pokeballDistributor);
        Player player2 = new Player("Player 2", pokeballDistributor);
        
        Battle battle = new Battle(player1, player2);
        assertEquals(player2, battle.getPlayer2());
    }
}
