import java.util.EventListener;

public interface PokeballListener extends EventListener {
    void onAssigned(PokeballEvent event);
}
