import java.util.Scanner;

public class  Team {
    private Player player;
    private Pokemon[] pokemons;

    public Team(Player player) { //where does an instance of this class get created?
        this.player = player;
        this.pokemons = new Pokemon[4];
    }

    /**
     * Allows the player to assemble a team of Pokemon by interactively choosing Pokemon from their
     * collection. The method prompts the player for each Pokemon in their collection, and if the
     * player chooses to add a Pokemon to the team (by pressing 'Y' for Yes), it is added to the team.
     * The process continues until the team size reaches 4 or the player decides not to add more Pokemon.
     * This method uses console-based input.
     */
    void assembleTeam() { //should i make it console based?
        Scanner scanner = new Scanner(System.in);
        int teamSize = 0;
        for (Pokemon pokemon : this.player.getPokemons()) {
            if (teamSize < 4) {
                System.out.println("Add this pokemon to team?" +
                        "press Y for Yes and N for no");
                String choice = scanner.nextLine();
                if (choice.equals("Y")) {
                    this.pokemons[teamSize] = pokemon;
                    teamSize++;
                }
            } else
                break;
        }
    }
}
