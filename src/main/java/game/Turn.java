package game;

import objects.CupController;
import player.Player;
import objects.Cup;

import java.util.Scanner;

public class Turn {

    // Fields

    private int rollValue, turnPoint, totalScore;

    String input;

    Scanner scanner = new Scanner(System.in);

    // Constructor


    public void turn (Player player, Cup cup) {
        // Initialize object variable


        System.out.println("Press enter to roll cup for "+player.getName());
        input=scanner.next();

        cup.cupRoll();
        rollValue=cup.getCupValue();

        turnPoint=pointSwitch(rollValue);

        PointController.add(player,turnPoint);
        totalScore=player.getAccount().getBalance();

        System.out.print("Your rolled:" + rollValue +"\t Which gives you:" + turnPoint + " point\n");
        System.out.println("and a total score of: " + totalScore + " points");

        if (totalScore > Game.WINNINGPOINTS) {
            player.setHasWon(true);
        }

        if (rollValue == 10) {
            turn(player,cup);
        }

    }


    // Variables accessible

    public int getRollValue() {return rollValue;}

    public int getTurnPoint () {return turnPoint;}


    // Public Methods

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
