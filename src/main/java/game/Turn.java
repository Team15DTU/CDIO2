package game;

import objects.Raffle;
import player.Player;

public class Turn {

    // Fields

    private int turnRaffle, turnPoint;

    Point point = new Point();

    // Constructor

    public Turn (Raffle raffleCup, Player player) {

        raffleCup.raffle();
        turnRaffle=raffleCup.getCupRoll();

        point.pointSwith(turnRaffle);
        turnPoint= point.getRafflePoint();

    }

    // Variables accessible

    public int getTurnRaffle () {return turnRaffle;}

    public int getTurnPoint () {return turnPoint;}

}
