package objects;

public class Cup {

    /*
    ----------- Fields -----------
     */
    private int cupValue;

    private Die[] dies;

    /*
    ---------- Constructors -------
     */

    /**
     * Default constructor which creates a cup with 2 dies of 6 sides.
     */
    public Cup () {
        // Initialize
        dies = new Die[2];

        for (Die die : dies) {
            die = new Die();
        }
    }

    /**
     * Alternative constructor, which creates a cup with "amountOfDies" dies of "dieSides" sides.
     * @param amountOfDies int
     * @param dieSides int
     */
    public Cup (int amountOfDies, int dieSides) {
        // Initialize
        dies = new Die[amountOfDies];

        for (Die die : dies) {
            die = new Die(dieSides);
        }
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
