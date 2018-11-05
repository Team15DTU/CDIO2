package game;

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

    public Game () {
        //Language controller

        final int STARTPOINT = 1000;
        final int WINNINGPOINTS = 3000;

        System.out.println("Indtast navn");
        String navn = scanner.next();
        Player player1 = new Player(navn, STARTPOINT);

        System.out.println("Indtast navn");
        navn = scanner.next();
        Player player2 = new Player(navn, STARTPOINT);

        System.out.println("Welcome string");

        Cup cup = new Cup();

        Turn turn = new Turn();

        turns();

        announceWinner();

    }

    public void turns (){
        while (player1.getAccount().getBalance() < WINNINGPOINTS && player2.getAccount().getBalance() < WINNINGPOINTS) {
            turn(player1, cup);
            if (player1.getAccount().getBalance() < WINNINGPOINTS) {
                turn(player2, cup);
            }
        }
    }

    public void announceWinner (player1, player2) {
        if (player1.getAccount().getBalance() > player2.getAccount().getBalance()) {
            System.out.println("Tillykke"+player1.getName());
        }
        System.out.println("Tillykke"+player2.getName());


    }
}
