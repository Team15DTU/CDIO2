package objects;

public class Cup {

    private int cupValue;

    private Die die1;
    private Die die2;

    public Cup () {

        die1 = new Die();
        die2 = new Die();
    }

    public int cupRoll () {

        die1.roll();
        die2.roll();
        int cupValue = die1.getFaceValue() + die2.getFaceValue();
        this.cupValue=cupValue;
        return cupValue;
    }

    // Variables accessible


    public int getCupValue () {return cupValue;}

    public void setCupValue (int cupValue) {this.cupValue = cupValue;}

}
