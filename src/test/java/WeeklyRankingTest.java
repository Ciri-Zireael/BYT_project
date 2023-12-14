import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class WeeklyRankingTest {
    LocalDate start;
    LocalDate end;
    WeeklyRanking weeklyRanking;
    @Before
    public void setUp(){
        start = LocalDate.now();
        end = start.plusDays(7);
        weeklyRanking = new WeeklyRanking(start, end);
    }
    @Test
    public void testGetStartDate() {
        assertEquals(start, weeklyRanking.getStartDate());
    }

    @Test
    public void testGetEndDate() {
        assertEquals(end, weeklyRanking.getEndDate());
    }

    @Test
    public void testGetPlayers() {
        assertNotNull(weeklyRanking.getPlayers());
        assertEquals(20, weeklyRanking.getPlayers().length);
    }
}
