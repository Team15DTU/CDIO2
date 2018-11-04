package objects;

import static org.junit.Assert.*;

public class DieTest {

    @org.junit.Test
    public void roll() {
    }

    @org.junit.Test
    public void getFaceValue() {

        // Create a Die with 6 sides
        Die die = new Die();

        // Set expectations
        int faceValue = 1;
        die.setFaceValue(faceValue);

        // Test it
        assertEquals( faceValue, die.getFaceValue() );
    }

    @org.junit.Test
    public void setFaceValue() {
    }

    @org.junit.Test
    public void getSides() {
    }

    @org.junit.Test
    public void setSides() {
    }
}