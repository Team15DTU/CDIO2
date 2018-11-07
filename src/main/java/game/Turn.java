package game;

import language.Reader;
import player.Player;
import objects.Cup;

import java.util.Scanner;

public class Turn {

    // Fields

    private int rollValue, turnPoint, totalScore;
    private String fieldName, fieldDescription;

    String input;

    Scanner scanner = new Scanner(System.in);

    // Constructor


    public void turn (Player player, Cup cup) {
        // Initialize object variable

        // Press to roll message printed and waiting for input
        System.out.println(Reader.print("rollPress")+" "+player.getName());
        input=scanner.nextLine();

        // teksten "exit" eller "sluk" afslutter spillet
        if (input.equals(Reader.print("exit"))) {
            System.exit(666);
        }

        // Cup is rolled and result is assigned to rollValue
        cup.cupRoll();
        rollValue=cup.getCupValue();

        // rollValue is converted to points and assigned to turnPoint
        turnPoint=pointSwitch(rollValue);

        // turnPoint is added to the players current balance and the new balance is assigned to totalScore
        PointController.add(player,turnPoint);
        totalScore=player.getAccount().getBalance();

        // Name and Description of the rollValue is assigned to fieldName and fieldDescription
        Fields.fieldsSwitch(rollValue);
        fieldName = Fields.getFieldName();
        fieldDescription = Fields.getFieldDescription();

        // Result of your turn is printed out.
        System.out.println(Reader.print("rolled") + " " + rollValue + Reader.print("landed") + " " + Reader.print(fieldName));
        System.out.println();
        System.out.println(Reader.print(fieldDescription));
        System.out.println(Reader.print("totalScore") + " " + totalScore + Reader.print("pointName"));
        System.out.println();

        // Check if totalScore is enough to win. If yes, players boolean hasWon is set to true.
        if (totalScore > Game.WINNINGPOINTS) {
            player.setHasWon(true);
        }

        // If rollValue is equal to 10 you get an extra turn
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
