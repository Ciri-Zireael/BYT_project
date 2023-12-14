import java.util.EventObject;

public class PokeballEvent extends EventObject { //does this need a test..?
    private int numberOfPokeballs;

    /**
     * Constructs a new PokeballEvent with the specified source and number of Pokeballs.
     *
     * @param source The object on which the event initially occurred (the source of the event).
     * @param numberOfPokeballs The number of Pokeballs associated with the event.
     */
    public PokeballEvent(Object source, int numberOfPokeballs) {
        super(source);
        this.numberOfPokeballs = numberOfPokeballs;
    }

    public int getNumberOfPokeballs() {
        return numberOfPokeballs;
    }
}
