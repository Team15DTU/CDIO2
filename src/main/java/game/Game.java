package game;

import language.Controller;
import language.Reader;
import objects.Cup;
import player.Player;

import java.util.Scanner;

/**
 * @author Karl Emil Jeppesen
 * StudyID: s180557
 * Date: 04-11-2018
 * University: DTU
 */
public class Game {

    Scanner scanner = new Scanner(System.in);

    final static int STARTPOINT = 1000;
    final static int WINNINGPOINTS = 3000;

    public void launch () {
        Controller.selectorWindow();

        System.out.println(Reader.print("enterName") + Reader.print("player1"));
        String navn = scanner.next();
        Player player1 = new Player(navn, STARTPOINT);
        String player1Name = player1.getName();
        System.out.print(Reader.print("hi") + " " + player1Name + Reader.print("hiPlayer"));
        System.out.println(" " + STARTPOINT + Reader.print("pointName"));

        System.out.println(Reader.print("enterName") + Reader.print("player2"));
        navn = scanner.next();
        Player player2 = new Player(navn, STARTPOINT);
        String player2Name = player2.getName();
        System.out.print(Reader.print("hi") + " " + player2Name + Reader.print("hiPlayer"));
        System.out.println(" " + STARTPOINT + Reader.print("pointName"));
        System.out.println();

        System.out.println(Reader.print("welcomeToGame"));

        Cup cup = new Cup();

        // turn needs to only take in player and cup
        Turn GameTurn = new Turn();

            while (!player1.isHasWon() && !player2.isHasWon()) {
                GameTurn.turn(player1, cup);
                if (!player1.isHasWon()) {
                    GameTurn.turn(player2, cup);
                }
            }


            if (player1.getAccount().getBalance() > player2.getAccount().getBalance()) {
                System.out.println(Reader.print("congrats") + " " +player1.getName());
                System.out.print(Reader.print("theEnding"));
            } else {
                System.out.println(Reader.print("congrats") + " " + player2.getName());
                System.out.print(Reader.print("theEnding"));
            }
    }

}
