package objects;

public class CupController {

    // Fields

    private static int cupRoll;

    public static void raffle (Cup cup) {

        cup.cupRoll();

        cupRoll = cup.getCupValue();

    }

    // Variable accessible

    public int getCupRoll () {return cupRoll;}

    public void setCupRoll (int cupRoll) {this.cupRoll=cupRoll;}

}
