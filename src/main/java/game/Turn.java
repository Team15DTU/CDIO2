package game;

import objects.Raffle;
import player.Player;

public class Turn {

    // Fields

    private int turnRaffle, turnPoint;

    private Point point = new Point();

    // Constructor

    public Turn (Raffle raffleCup, Player player) {

        raffleCup.raffle();
        turnRaffle=raffleCup.getCupRoll();

        point.pointSwitch(turnRaffle);
        turnPoint= point.getRafflePoint();

    }

    // Variables accessible

    public int getTurnRaffle () {return turnRaffle;}

    public int getTurnPoint () {return turnPoint;}

}
