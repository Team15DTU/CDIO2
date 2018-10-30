public class Turn {

    // Fields

    private int turnRaffle, turnPoint;

    Point point = new Point();

    // Constructor

    public void turn (Raffle raffleCup, Player player) {

        raffleCup.raffle();
        turnRaffle=raffleCup.getCupRoll();

        point.pointSwith(turnRaffle);
        turnPoint= point.getRafflePoint();

    }

    // Variables accessible

    public int getTurnRaffle () {return turnRaffle;}

    public int getTurnPoint () {return turnPoint;}

}
