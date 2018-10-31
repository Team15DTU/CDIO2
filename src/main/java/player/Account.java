package player;

import game.Point;

public class Account {

    // Fields
    private int balance;

    // Constructors

    /**
     * Primary Constructor
     */
    public Account () {
        balance = 0;
    }

    // Properties
    public void checkBalance (Player player) {
        balance = player.getAccount();
    }

    public int getBalance () {return balance;}

    // Public Methods

    public void add (Player player, Point point) {

        beforeScore = player.getAccount();
        turnPoint = point.getRafflePoint();
        afterScore = beforeScore + turnPoint;
        player.setAccount(afterScore);
    }

}
