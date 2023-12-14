import java.util.ArrayList;
import java.util.List;

public class MatchMaker {

    private List<Player> waitingPlayers = new ArrayList<>();

    /**
     * Adds the given player to the waiting queue for a battle. If the player is not already
     * in the queue a background thread is started to wait for 60 secs
     * before attempting to match the player with another waiting player. If the player is already in
     * the queue a message is printed saying that the player is currently waiting to be matched.
     *
     * @param player The player to be added to the waiting queue.
     */
    public void enterQueue(Player player) {
        if (!waitingPlayers.contains(player)) {
            waitingPlayers.add(player);

            //a thread for waiting? Do we want threads?
            new Thread(() -> {
                try {
                    Thread.sleep(60000);
                    handleMatching(player);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        } else {
            System.out.println("You are currently waiting to be matched");
        }
    }

    /**
     * Attempts to match the given player with another waiting player. If there are enough players
     * in the waiting queue, a new battle is created between the given player and the first waiting
     * player in the queue. Participation objects are created for both players, and the battle
     * results are set. If there are not enough players, the given player is removed from the waiting
     * queue, and a message is printed saying that the player has been waiting for too long
     * without finding an opponent.
     *
     * @param player The player to be matched with another waiting player.
     */
    public void handleMatching(Player player) {

        if (waitingPlayers.size() > 1) {
            Player opponent;
            int index = 0;
            for(Player pl : this.waitingPlayers){
                if(!pl.equals(player)) {
                   index  = waitingPlayers.indexOf(pl);
                    break;
                }
            }
            opponent = waitingPlayers.remove(index);
            waitingPlayers.remove(player);
            Battle battle = new Battle(player, opponent);

            //do we store those anywhere?..
            Participation parPlayer = new Participation(player, battle);
            Participation parOpponent = new Participation(opponent, battle);

        } else { //no opponents available
            waitingPlayers.remove(player);
            System.out.println("You've been waiting for too long and no one has shown up");
        }
    }
    public List<Player> getWaitingPlayers() {
        return waitingPlayers;
    }
}
