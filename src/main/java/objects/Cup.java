package objects;

public class Cup {

    /*
    ----------- Fields -----------
     */
    private int cupValue;

    private Die die1;
    private Die die2;

    /*
    ---------- Constructors -------
     */
    public Cup () {

        die1 = new Die();
        die2 = new Die();
    }

    /*
    -------- Public Methods -------
     */

    public int cupRoll () {

        die1.roll();
        die2.roll();
        int cupValue = die1.getFaceValue() + die2.getFaceValue();
        this.cupValue=cupValue;
        return cupValue;
    }

    /*
    --------- Support Methods ---------
     */

    /*
    --------- Variables accessible ----
     */


    public int getCupValue () {return cupValue;}

    public void setCupValue (int cupValue) {this.cupValue = cupValue;}

}
