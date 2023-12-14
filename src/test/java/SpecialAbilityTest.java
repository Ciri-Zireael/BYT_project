import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SpecialAbilityTest {
    String name;
    String description;
    SpecialAbility ability;
    @Before
    public void setUp(){
        name = "Special";
        description = "The ability unique to a set of Pokemon";
        ability = new SpecialAbility(name, description);
    }

    @Test
    public void testGetName() {
        assertEquals(name, ability.getName());
    }

    @Test
    public void testGetDescription() {
        assertEquals(description, ability.getDescription());
    }
}
