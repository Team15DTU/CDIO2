package objects;

import static org.junit.Assert.*;

public class DieTest {

    // Testing object for conventional dice
    Die die = new Die();
    // Testing object for 12 sided dice
    Die die12 = new Die(12);

    @org.junit.Test
    public void roll() {
    }

    @org.junit.Test
    public void getFaceValue() {

        // Set expectations
        int faceValue = 1;
        die.setFaceValue(faceValue);

        // Test it
        assertEquals( faceValue, die.getFaceValue() );
    }

    @org.junit.Test
    public void setFaceValue() {

        // Set expectations
        int faceValue = 5;
        die.setFaceValue(faceValue);

        // Test it
        assertEquals( faceValue, die.getFaceValue() );
    }

    @org.junit.Test
    public void getSides() {
        assertEquals( 12, die12.getSides() );
    }

    @org.junit.Test
    public void setSides() {
    }
}