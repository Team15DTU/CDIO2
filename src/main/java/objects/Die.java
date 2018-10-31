package objects;

import java.util.Random;

public class Die {

    // Fields

    private int faceValue; // Value of die after roll
    private final int DIESIDES = 6; // Sides on die
    private int sides;  // Sides for custom sides on die

    // Constructor

    public Die () {

        sides=DIESIDES;

    }

    public Die (int sides) {

        this.sides = sides;

    }

    // Methods

    public void roll () { //

        Random generator = new Random();

        faceValue = generator.nextInt(DIESIDES)+1; // Random number om die with DIESIDES

    }

    // Make values accessible

    public int getFaceValue () { return faceValue; }

    // public void setFaceValue (int faceValue) {this.faceValue = faceValue; }

    public int getSides() {return sides;}

    public void setSides(int sides) {this.sides = sides;}
}

