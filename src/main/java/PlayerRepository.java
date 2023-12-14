import java.util.ArrayList;
import java.util.List;

public class PlayerRepository {
    private List<Player> players = new ArrayList<>();
    public List<Player> getPlayers() {
        return players;
    }
    public void addPlayer(Player player){
        this.players.add(player);
    }

}
