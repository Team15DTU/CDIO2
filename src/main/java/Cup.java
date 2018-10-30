public class Cup {

    private int cupValue;

    Die die1 = new Die();
    Die die2 = new Die();

    public void cupRoll () {

        die1.roll();
        die2.roll();
        int cupValue = die1.getFaceValue() + die2.getFaceValue();
        this.cupValue=cupValue;
    }

    // Variables accessible

    public int getCupValue () {return cupValue;}

    // public void setCupValue (int cupValue) {this.cupValue = cupValue;}

}
