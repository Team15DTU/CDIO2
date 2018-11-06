package game;

import player.Player;

public class PointController {

    // Methods

    public static void add (Player player, int points) {
        player.updateScore(points);

        if (player.getAccount().getBalance() < 0) {
            player.resetScore();
            System.out.println("Din konto er nulstillet");
        }

    }

}

