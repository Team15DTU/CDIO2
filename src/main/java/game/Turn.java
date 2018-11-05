package game;

import objects.CupController;
import player.Player;

import java.util.Scanner;

public class Turn {

    // Fields

    private int rollValue, turnPoint;

    Scanner scanner = new Scanner(System.in);

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

        System.out.println("Press enter to roll cup for "+player.getName());
        scanner.next();
        //DETTE ER DET NYESTE



    }


    // Variables accessible

    public int getRollValue() {return rollValue;}

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
