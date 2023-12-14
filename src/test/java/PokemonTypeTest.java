import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PokemonTypeTest {
    String name;
    PokemonType type;
    PokemonType weak;
    PokemonType strong;
    @Before
    public void setUp(){
        name  = "Electric";
        weak = new PokemonType("Weak", null, null);
        strong = new PokemonType("Strong", null, null);
        type = new PokemonType(name, weak, strong);
    }
    @Test
    public void testGetName() {
        assertEquals(name, type.getName());
    }

    @Test
    public void testGetWeak_against() {
        assertEquals(weak, type.getWeak_against());
    }

    @Test
    public void testGetStrong_against() {
        assertEquals(strong, type.getStrong_against());
    }
}
