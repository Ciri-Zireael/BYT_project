import java.util.List;
import java.util.Random;

public class Pokemon {
    private String name;
    private PokemonRarity rarity;
    private int health;
    private int strength;
    private SpecialAbility specialAbility;

    private Player owner;

    public Pokemon(String name, PokemonRarity rarity, int health, int strength,
                   SpecialAbility specialAbility) {
        this.name = name;
        this.rarity = rarity;
        this.health = health;
        this.strength = strength;
        this.specialAbility = specialAbility;
        this.owner = null;
    }
    public String getName() {
        return name;
    }

    public PokemonRarity getRarity() {
        return rarity;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public SpecialAbility getSpecialAbility() {
        return specialAbility;
    }

    public Player getOwner() {
        return owner;
    }
    public void setOwner(Player owner) {
        this.owner = owner;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Displays the names of all Pokemon in the Pokemon library.
     */
    public void viewPokemonLibrary(){
        //should it maybe be part of players class so they could see which Pokemons they own?
        //could Player be an argument?
        PokemonRepository.getPokemons().forEach(s-> System.out.println(s.getName()));
    }

    /**
     * Assigns a Pokemon to the specified player based on its rarity. The method filters
     * Pokemon from the PokemonRepository based on a randomly selected rarity, and then randomly
     * selects one Pokemon from the filtered list to be added to the player's collection.
     *
     * @param player The player to whom the Pokemon will be assigned.
     */
    public static void assignPokemonToPlayer(Player player){
        List<Pokemon> pokByRarity = PokemonRepository.getPokemons().stream()
                .filter(pokemon -> pokemon.getRarity() == randomRarity())
                .toList();
        int index = (int) (Math.random() * pokByRarity.size());
        player.getPokemons().add(pokByRarity.get(index));
    }

    /**
     * Generates and returns a random PokemonRarity based on predefined probabilities.
     * This method uses a random number generator to produce a value between 0 and 100.
     * Depending on this value, it returns one of the three PokemonRarity values: COMMON,
     * RARE, or LEGENDARY.
     *
     * @return A randomly selected PokemonRarity.
     */
    public static PokemonRarity randomRarity(){
        Random rand = new Random();
        int number = rand.nextInt(101);

        if(number <= 70){
            return PokemonRarity.COMMON;
        }
        else
            if(number < 90){
            return PokemonRarity.RARE;
        }
            else return PokemonRarity.LEGENDARY;
    }
}
