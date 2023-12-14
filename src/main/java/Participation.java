public class Participation {

    private Player player;
    private Battle battle;
    private BattleResult result;

    public Participation(Player player, Battle battle) {
        this.player = player;
        this.battle = battle;
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
    /**
     * Sets the result of the battle and assigns Pokeballs to the player based on the result.
     * If the result is a win, the player receives 2 Pokeballs. If the result is a draw, the player
     * receives 1 Pokeball.
     *
     * @param result The result of the battle (WIN, DRAW, LOSS).
     */
    public void setResult(BattleResult result) {
        PokeballDistributor distributor = new PokeballDistributor();
        this.result = result;
        if(result == BattleResult.WIN)
            distributor.assignPokeballsToPlayer(2);
        else if (result == BattleResult.DRAW)
            distributor.assignPokeballsToPlayer(1);
    }
   //I dont think matchPlayer() would work here very well if i understood the purpose
    //of this class correctly

}
