import java.util.ArrayList;
import java.util.List;

public class PokeballDistributor {
    private List<PokeballListener> pokeballListeners = new ArrayList<>();

    /**
     * Adds a PokeballListener to the list of listeners. The listener will be notified when
     * Pokeballs are assigned to a player.
     *
     * @param listener The PokeballListener to be added.
     */
    public void addPokeballListener(PokeballListener listener) {
        pokeballListeners.add(listener);
    }
    /**
     * Assigns the specified number of Pokeballs to the player and notifies all registered
     * PokeballListeners about the assignment.
     *
     * @param numberOfPokeballs The number of Pokeballs to be assigned to the player.
     */
    void assignPokeballsToPlayer(int numberOfPokeballs){
        PokeballEvent event = new PokeballEvent(this, numberOfPokeballs);
        notifyListeners(event);
    }
    /**
     * Notifies all registered PokeballListeners about a PokeballEvent.
     *
     * @param event The PokeballEvent to be sent to the listeners.
     */
    private void notifyListeners(PokeballEvent event) {
        for (PokeballListener listener : pokeballListeners) {
            listener.onAssigned(event);
        }
    }
}
