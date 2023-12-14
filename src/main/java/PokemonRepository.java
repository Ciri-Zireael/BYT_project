import java.util.ArrayList;
import java.util.List;

public class PokemonRepository {
    private static List<Pokemon> pokemons = new ArrayList<>();
    public static List<Pokemon> getPokemons() {
        return pokemons;
    }
    public void addPokemon(Pokemon pokemon){
        pokemons.add(pokemon);
    }
}
