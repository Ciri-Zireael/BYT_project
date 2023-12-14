import exceptions.PlayerNullException;

import java.time.LocalDate;

public class Battle {
    private final LocalDate date;
    private Participation player1;
    private Participation player2;

    public Battle(){
       this.date = LocalDate.now();
    }
    public LocalDate getDate() {
        return date;
    }
    public Participation getPlayer1() {
        return player1;
    }
    public Participation getPlayer2() {
        return player2;
    }

    public void setPlayer1(Participation player1) {
        if(this.player1 == null)
          this.player1 = player1;
    }

    public void setPlayer2(Participation player2) {
        if(this.player2 == null)
           this.player2 = player2;
    }

//no need for setters, since instances of battle class cannot be modified
}
