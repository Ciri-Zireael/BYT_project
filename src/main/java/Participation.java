public class Participation {

    private final Player player;
    private Battle battle;
    private BattleResult result;

    public Participation(Player player) {
        this.player = player;
        this.battle = null;
        this.result = null;
    }
    public Player getPlayer() {
        return player;
    }

    public Battle getBattle() {
        return battle;
    }

    public BattleResult getResult() {
        return result;
    }

    public void setResult(BattleResult result) {
        this.result = result;
    }
   public void matchPlayer(){} //would also set the Battle field


}
