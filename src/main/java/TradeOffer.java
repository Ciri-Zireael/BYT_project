public class TradeOffer {
    private final Player from_player, to_player;
    private final Pokemon offered_pokemon, requested_pokemon;
    private OfferStatus status;

    public TradeOffer(Player from_player, Player to_player,
                      Pokemon offered_pokemon, Pokemon requested_pokemon) {
        this.from_player = from_player;
        this.to_player = to_player;
        this.offered_pokemon = offered_pokemon;
        this.requested_pokemon = requested_pokemon;
        this.status = OfferStatus.PENDING;
    }

    public Player getFrom_player() {
        return from_player;
    }

    public Player getTo_player() {
        return to_player;
    }

    public Pokemon getOffered_pokemon() {
        return offered_pokemon;
    }

    public Pokemon getRequested_pokemon() {
        return requested_pokemon;
    }

    public OfferStatus getStatus() {
        return status;
    }

    public void setStatus(OfferStatus status) {
        this.status = status;
    }
}
