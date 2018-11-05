package game;

import language.Reader;
import player.Player;

public class PointController {

    // Methods

    public static void reset(Player player, int points) {
        player.updateScore(points);

        if (player.getAccount().getBalance() < 0) {
            player.resetScore();
        }
        System.out.println("Din konto er nulstillet");
    }

}

