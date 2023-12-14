import exceptions.NegativeValueException;

import java.util.ArrayList;

public class Player{
    private String username;
    private int XP;
    private int level;
    private int numberOfPokeballs;
    private final Team team;
    private final ArrayList<Pokemon> pokemons = new ArrayList<>();
    private final ArrayList<Player> friends = new ArrayList<>();
    private final ArrayList<TradeOffer> tradeOffers = new ArrayList<>();
    private final ArrayList<Participation> participations = new ArrayList<>();
    private final ArrayList<PlayerWeekRank> ranks = new ArrayList<>();

    public Player(String username) {
        this.username = username;
        this.XP = 0;
        this.level = 1;
        this.numberOfPokeballs = 0;
        this.team = new Team(this);
    }
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public int getXP() {
        return this.XP;
    }

    public void setXP(int XP) throws NegativeValueException {
        if(XP < 0)
            throw new NegativeValueException();
        this.XP = XP;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) throws NegativeValueException {
        if(level < 0)
            throw new NegativeValueException();
        this.level = level;
    }
    public ArrayList<Pokemon> getPokemons() {
        return pokemons;
    }

    public int getNumberOfPokeballs() {
        return this.numberOfPokeballs;
    }

    public void setNumberOfPokeballs(int numberOfPokeballs) throws NegativeValueException {
        if(numberOfPokeballs < 0)
            throw new NegativeValueException();
        this.numberOfPokeballs = numberOfPokeballs;
    }

    public Team getTeam() {
        return team;
    }

    public ArrayList<Player> getFriends() {
        return friends;
    }

    public ArrayList<TradeOffer> getTradeOffers() {
        return tradeOffers;
    }

    public ArrayList<Participation> getParticipations() {
        return participations;
    }

    void ViewLeaderboard(){}
    void ViewFriendsList(){}
    void AddFriend(Player player){}
    void DeleteFriend(Player player){}
    void MakeTradeOffer(){}
    void Login(){}
    void Register(){}

}
