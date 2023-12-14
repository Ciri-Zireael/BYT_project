import exceptions.NegativeValueException;

public class PlayerWeekRank {
    private final Player player;
    private final WeeklyRanking ranking;
    private int acquiredXP;

    public PlayerWeekRank(Player player, WeeklyRanking weeklyRanking,
                          int acquiredXP){
        this.player = player;
        this.ranking = weeklyRanking;
        this.acquiredXP = acquiredXP;
    }

    public Player getPlayer() {
        return player;
    }

    public WeeklyRanking getRanking() {
        return ranking;
    }

    public int getAcquiredXP() {
        return acquiredXP;
    }

    public void setAcquiredXP(int acquiredXP) throws NegativeValueException{
        if(acquiredXP < 0)
            throw new NegativeValueException();
        this.acquiredXP += acquiredXP;
    }
}
