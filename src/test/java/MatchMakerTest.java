import org.junit.Test;

import java.util.Timer;
import java.util.TimerTask;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MatchMakerTest {
        @Test
        public void testEnterQueue(){
            Timer timer = new Timer();
            MatchMaker matchMaker = new MatchMaker();
            PokeballDistributor distributor = new PokeballDistributor();

            Player player = new Player("Player1", distributor);

            matchMaker.enterQueue(player);
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    assertTrue(matchMaker.getWaitingPlayers().contains(player));
                }
            }, 60000);

        }

        @Test
        public void testHandleMatching() {
            MatchMaker matchMaker = new MatchMaker();
            PokeballDistributor distributor = new PokeballDistributor();

            Player player1 = new Player("Player1", distributor);
            Player player2 = new Player("Player2", distributor);

            matchMaker.getWaitingPlayers().add(player1);
            matchMaker.getWaitingPlayers().add(player2);

            matchMaker.handleMatching(player1);

            assertEquals(0, matchMaker.getWaitingPlayers().size());
        }
}
