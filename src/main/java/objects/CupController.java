package objects;

import objects.Cup;

public class CupController {

    // Fields

    private int cupRoll;

    public void raffle (Cup cup) {

        cup.cupRoll();

        cupRoll = cup.getCupValue();

    }

    // Variable accessible

    public int getCupRoll () {return cupRoll;}

    // public void setCupRoll (int cupRoll) {this.cupRoll=cupRoll;}

}
