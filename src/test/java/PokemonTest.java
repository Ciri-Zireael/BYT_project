import exceptions.PlayerNullException;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PokemonTest {
    String name;
    PokemonRarity rarity;
    int health;
    int strength;
    SpecialAbility ability;
    PokemonType type;
    Pokemon pokemon;
    @Before
    public void setUp(){
        name = "Pikachu";
        rarity = PokemonRarity.COMMON;
        health = 7;
        strength = 8;
        ability = new SpecialAbility("Electrocuting", "Zapp");
        type = new PokemonType("Electric", null, null);
        pokemon = new Pokemon(name, rarity, health, strength, ability, type);
    }
    @Test
    public void testGetName() {
        assertEquals(name, pokemon.getName());
    }

    @Test
    public void testGetRarity() {
        assertEquals(rarity, pokemon.getRarity());
    }

    @Test
    public void testGetHealth() {
        assertEquals(health, pokemon.getHealth());
    }

    @Test
    public void testGetStrength() {
        assertEquals(strength, pokemon.getStrength());
    }

    @Test
    public void testGetSpecialAbility() {
        assertEquals(ability, pokemon.getSpecialAbility());
    }

    @Test
    public void testGetType() {
        assertEquals(type, pokemon.getType());
    }

    @Test
    public void testGetOwner() {
        assertNull(pokemon.getOwner());
    }

    @Test
    public void testSetOwner() throws PlayerNullException {
        pokemon.setOwner(new Player("Bob"));
        assertEquals("Bob", pokemon.getOwner().getUsername());
        assertThrows(PlayerNullException.class, () -> pokemon.setOwner(null));
    }
}
