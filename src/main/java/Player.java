import java.util.ArrayList;

public class Player implements PokeballListener{ //Sarah (i got suggestions tho)
    private String username;
    private int XP;
    private int level;
    private int numberOfPokeballs; //TODO: use it when assigining pokemon?

    private ArrayList<Pokemon> pokemons = new ArrayList<>();
    private ArrayList<Player> friends = new ArrayList<>();

    public Player(String username, PokeballDistributor distributor) {
        this.username = username;
        this.XP = 0;
        this.level = 1;
        this.numberOfPokeballs = 0;
        distributor.addPokeballListener(this);
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

    public void setXP(int XP) {
        this.XP = XP;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    public ArrayList<Pokemon> getPokemons() {
        return pokemons;
    }

    public int getNumberOfPokeballs() {
        return this.numberOfPokeballs;
    }

    public void setNumberOfPokeballs(int numberOfPokeballs) {
        this.numberOfPokeballs = numberOfPokeballs;
    }
    void ViewLeaderboard(){}
    void ViewFriendsList(){
        this.friends.forEach(s -> System.out.println(s.getUsername()));
    }
    void AddFriend(Player player){
        this.friends.add(player);
    }
    void DeleteFriend(Player player){
        this.friends.remove(player);
    }
    void MakeTradeOffer(){}
    void Login(){}
    void Register(PokeballDistributor distributor){
        //TODO:logic for registering
        distributor.assignPokeballsToPlayer(4);
    }
    void ParticipateInBattle(MatchMaker mananger){
        mananger.enterQueue(this);
    }
    @Override
    public void onAssigned(PokeballEvent event) {
        this.numberOfPokeballs += event.getNumberOfPokeballs();
    }
}
