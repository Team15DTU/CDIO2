public class Raffle {

    // Fields

    private int cupRoll, raffleScore;

    Cup cup = new Cup();

    public void raffle () {

        cup.cupRoll();

        cupRoll = cup.getCupValue();

    }

    // Variable accessible

    public int getCupRoll () {return cupRoll;}

    // public void setCupRoll (int cupRoll) {this.cupRoll=cupRoll;}

}
