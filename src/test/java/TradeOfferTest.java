import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TradeOfferTest {
    Player from;
    Player to;
    Pokemon offered;
    Pokemon requested;
    TradeOffer offer;
    @Before
    public void setUp(){
        from = new Player("from");
        to = new Player("to");
        offered = new Pokemon("Pikachu", PokemonRarity.COMMON, 7,
                8,
                new SpecialAbility("Fire_Breathing", "breathing fire"),
                new PokemonType("Electric", null, null));
        requested = new Pokemon("Psyduck", PokemonRarity.COMMON, 8,
                9,
                new SpecialAbility("Electrocuting", "Zap"),
                new PokemonType("Electric", null, null));
        offer = new TradeOffer(from, to, offered, requested);
    }
    @Test
    public void testGetplayers() {
        assertEquals(from, offer.getFrom_player());
        assertEquals(to, offer.getTo_player());
    }

    @Test
    public void testGetPokemons() {
        assertEquals(offered, offer.getOffered_pokemon());
        assertEquals(requested, offer.getRequested_pokemon());
    }
    @Test
    public void testGetStatus() {
        assertEquals(OfferStatus.PENDING, offer.getStatus());
    }

    @Test
    public void testSetStatus() {
        offer.setStatus(OfferStatus.ACCEPTED);
        assertEquals(OfferStatus.ACCEPTED, offer.getStatus());
    }
}
