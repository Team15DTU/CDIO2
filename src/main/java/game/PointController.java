package game;

import language.Reader;
import player.Player;

public class PointController {

    // Methods

    public void (Player player, int points) {
        player.updateScore(points);

        if (player.getAccount().getBalance() < 0) {
            player.resetScore();
        }
        System.out.println("Din konto er nulstillet");
    }

    public String nameSwitch(int value) {

        String pointName;

        switch (value) {
            case 2:
                pointName = "field2name";
                break;
            case 3:
                pointName = "field3name";
                break;
            case 4:
                pointName = "field4name";
                break;
            case 5:
                pointName = "field5name";
                break;
            case 6:
                pointName = "field6name";
                break;
            case 7:
                pointName = "field7name";
                break;
            case 8:
                pointName = "field8name";
                break;
            case 9:
                pointName = "field9name";
                break;
            case 10:
                pointName = "field10name";
                break;
            case 11:
                pointName = "field11name";
                break;
            case 12:
                pointName = "field12name";
                break;
            default:
                pointName = "feildError";
                break;
        }

        return pointName;

    }

}

