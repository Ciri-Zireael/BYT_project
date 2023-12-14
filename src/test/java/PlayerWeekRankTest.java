import exceptions.NegativeValueException;
import org.junit.Before;
import org.junit.Test;
import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class PlayerWeekRankTest {
    Player player;
    WeeklyRanking weeklyRanking;
    PlayerWeekRank playerWeekRank;
    @Before
    public void setUp(){
        player = new Player("player1");
        weeklyRanking = new WeeklyRanking(LocalDate.of(2023, Month.APRIL,25),
                LocalDate.of(2023, Month.MAY,1));
        playerWeekRank = new PlayerWeekRank(player,weeklyRanking,25);
    }
    @Test
    public void testGetPlayer() {
        assertEquals(player, playerWeekRank.getPlayer());
    }

    @Test
    public void testGetRanking() {
        assertEquals(weeklyRanking, playerWeekRank.getRanking());
    }

    @Test
    public void testGetAcquiredXP() {
        assertEquals(25, playerWeekRank.getAcquiredXP());
    }

    @Test
    public void testSetAcquiredXP() throws NegativeValueException {
        playerWeekRank.setAcquiredXP(50);
        assertEquals(75, playerWeekRank.getAcquiredXP());
        assertThrows(NegativeValueException.class, () -> playerWeekRank.setAcquiredXP(-50));
    }
}
