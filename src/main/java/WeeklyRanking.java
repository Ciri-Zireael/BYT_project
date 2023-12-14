import java.time.LocalDate;
import java.util.ArrayList;

public class WeeklyRanking {

    private final LocalDate startDate;
    private final LocalDate endDate;
    private final PlayerWeekRank[] players;

    public WeeklyRanking(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
        players = new PlayerWeekRank[20];
        assignPlayers();
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public LocalDate getEndDate() {
        return endDate;
    }

    public PlayerWeekRank[] getPlayers() {
        return players;
    }

    public void viewRanking(){}

    private void assignPlayers(){}

}
