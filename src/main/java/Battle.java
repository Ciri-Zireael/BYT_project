import java.time.LocalDate;
import java.util.Date;

public class Battle { //Sarah
    private LocalDate date;
    private Player player1;
    private Player player2;
    public Battle(Player player1, Player player2) {
        this.date = LocalDate.now();
        this.player1 = player1;
        this.player2 = player2;
    }
    public LocalDate getDate() {
        return date;
    }
    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }


}
