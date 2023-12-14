import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PokemonTest {
    @Test
    public void testAssignPokemonToPlayer() {
        PokeballDistributor distributor = new PokeballDistributor();
        Player player = new Player("TestPlayer", distributor);

        PokemonRepository pokemonRepository = new PokemonRepository();
        List<Pokemon> Pokemons = List.of(
                new Pokemon("Pikachu", PokemonRarity.COMMON,
                        50, 10, null),
                new Pokemon("Charizard", PokemonRarity.RARE,
                        80, 20, null),
                new Pokemon("Mewtwo", PokemonRarity.LEGENDARY,
                        100, 30, null)
        );
        for (Pokemon s : Pokemons)
            pokemonRepository.addPokemon(s);
        Pokemon.assignPokemonToPlayer(player);

        assertEquals(1, player.getPokemons().size());
    }

    @Test
    public void testRandomRarity() {
        int hasCommon = 0;
        int hasRare = 0;
        int hasLegendary = 0;

        for (int i = 0; i < 1000; i++) {
            PokemonRarity rarity = Pokemon.randomRarity();
            switch (rarity) {
                case COMMON -> hasCommon++;
                case RARE -> hasRare++;
                case LEGENDARY -> hasLegendary++;
            }
        }
        assertTrue(hasCommon > hasRare);
        assertTrue(hasRare > hasLegendary);
    }
}
