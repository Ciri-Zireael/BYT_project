import exceptions.PlayerNullException;

import java.util.List;
import java.util.Random;

public class Pokemon {
    private final String name;
    private final PokemonRarity rarity;
    private final int health;
    private final int strength;
    private final SpecialAbility specialAbility;
    private final PokemonType type;

    private Player owner;

    public Pokemon(String name, PokemonRarity rarity, int health, int strength,
                   SpecialAbility specialAbility, PokemonType type) {
        this.name = name;
        this.rarity = rarity;
        this.health = health;
        this.strength = strength;
        this.specialAbility = specialAbility;
        this.owner = null;
        this.type = type;
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

    public PokemonType getType() {
        return type;
    }

    public Player getOwner() {
        return owner;
    }
    public void setOwner(Player owner) throws PlayerNullException {
        if(owner == null)
            throw new PlayerNullException();
        this.owner = owner;
    }
    public void viewPokemonLibrary(){}
    public static void assignPokemonToPlayer(Player player) {}
}
