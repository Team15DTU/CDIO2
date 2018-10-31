package game;

import objects.Raffle;
import player.Player;

public class Turn {

    // Fields

    private int turnRaffle, turnPoint;
    private Raffle raffleCup;
    private Player player;

    private Point point = new Point();

    // Constructor

    public Turn (Raffle raffleCup, Player player) {

        this.raffleCup = raffleCup;
        this.player = player;

    }



    // Variables accessible

    public int getTurnRaffle () {return turnRaffle;}

    public int getTurnPoint () {return turnPoint;}

}
