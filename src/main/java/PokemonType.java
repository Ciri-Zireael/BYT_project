public class PokemonType {

    private final String name;
    private final PokemonType weak_against, strong_against;

    public PokemonType(String name, PokemonType weak_against, PokemonType strong_against) {
        this.name = name;
        this.weak_against = weak_against;
        this.strong_against = strong_against;
    }

    public String getName() {
        return name;
    }

    public PokemonType getWeak_against() {
        return weak_against;
    }

    public PokemonType getStrong_against() {
        return strong_against;
    }
}
