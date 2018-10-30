public class Account {

    // Fields

    private int beforeScore, afterScore,turnPoint;
    private int balance;

    // Constructor

    public void add (Player player, Point point) {

        beforeScore = player.getAccount();
        turnPoint = point.getRafflePoint();
        afterScore = beforeScore + turnPoint;
        player.setAccount(afterScore);
    }

    public void checkBalance (Player player) {
        balance = player.getAccount();
    }

    public int getBalance () {return balance;}

}
