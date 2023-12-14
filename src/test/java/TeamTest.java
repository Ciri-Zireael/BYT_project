import org.junit.Test;

import java.util.List;

public class TeamTest {
    @Test
    public void testAssembleTeam() { //testing with keyboard input?
        PokeballDistributor distributor = new PokeballDistributor();
        Player player = new Player("player1", distributor);
        List<Pokemon> Pokemons = List.of(
                new Pokemon("Pikachu", PokemonRarity.COMMON,
                        50, 10, null),
                new Pokemon("Charizard", PokemonRarity.RARE,
                        80, 20, null),
                new Pokemon("Mewtwo", PokemonRarity.LEGENDARY,
                        100, 30, null),
                new Pokemon("Piplup", PokemonRarity.LEGENDARY,
                        35, 25, null)
        );
        Pokemons.forEach(s -> player.getPokemons().add(s));
    }
}
