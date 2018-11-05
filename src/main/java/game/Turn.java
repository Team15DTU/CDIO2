package game;

import objects.CupController;
import player.Player;

public class Turn {

    // Fields

    private int turnRaffle, turnPoint;
    private CupController cupControllerCup;
    private Player player;

    private PointController pointController = new PointController();

    // Constructor

    /**
     * Primary constructor
     * @param cupControllerCup CupController
     * @param player Player
     */
    public Turn (CupController cupControllerCup, Player player) {
        // Initialize object variables
        this.cupControllerCup = cupControllerCup;
        this.player = player;

    }


    // Variables accessible

    public int getTurnRaffle () {return turnRaffle;}

    public int getTurnPoint () {return turnPoint;}


    // Public Methods
    public void raffle () {
        cupControllerCup.raffle(); // Roll the dices
    }

    public int pointSwitch(int value) {

        int rafflePoint;

        switch (value) {
            case 2:
                rafflePoint = (+250);
                break;
            case 3:
                rafflePoint = (-100);
                break;
            case 4:
                rafflePoint = (+100);
                break;
            case 5:
                rafflePoint = (-20);
                break;
            case 6:
                rafflePoint = (+180);
                break;
            case 7:
                rafflePoint = (0);
                break;
            case 8:
                rafflePoint = (-70);
                break;
            case 9:
                rafflePoint = (+60);
                break;
            case 10:
                rafflePoint = (-80);
                break;
            case 11:
                rafflePoint = (-50);
                break;
            case 12:
                rafflePoint = (+650);
                break;
            default:
                rafflePoint = (-1);
                break;
        }

        return rafflePoint;
    }

}
