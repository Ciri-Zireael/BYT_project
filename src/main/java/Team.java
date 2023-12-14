import java.util.Scanner;

public class  Team {
    private final Player player;
    private final Pokemon[] pokemons;

    public Team(Player player) {
        this.player = player;
        this.pokemons = new Pokemon[4];
    }

    public Player getPlayer() {
        return player;
    }

    public Pokemon[] getPokemons() {
        return pokemons;
    }

    void assembleTeam() {}
}
