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

    /**
     * Primary constructor
     * @param raffleCup
     * @param player
     */
    public Turn (Raffle raffleCup, Player player) {
        // Initialize object variables
        this.raffleCup = raffleCup;
        this.player = player;

    }


    // Variables accessible

    public int getTurnRaffle () {return turnRaffle;}

    public int getTurnPoint () {return turnPoint;}


    // Public Methods
    public void raffle () {
        raffleCup.raffle(); // Roll the dices
    }

}
