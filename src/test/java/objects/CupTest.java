package objects;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Alfred Röttger Rydahl
 * @date 05-11-2018
 */
public class CupTest {

    // Cup with 2 conventional 6 sided dies
    Cup cup = new Cup();
    // Cup with 4, 12 sided dies
    Cup cup12 = new Cup(4, 12);


    @Test
    public void cupRoll() {
        /*
        Roll the dies in the conventional cup and put the value into "first".
        Check that the roll is in the correct range.
        Check that the roll actually is different from time to time - THIS WILL EVENTUALLY FAIL
         */
        int first = cup.cupRoll();
        assertTrue(first > 1 && first < 13);
        assertTrue(first != cup.cupRoll());     // CAN FAIL

        /*
        Roll the dies in the pervert cup and put them into "first".
        Check that the roll is in the correct range.
        Check that the roll actually is different from time to time - THIS WILL EVENTUALLY FAIL
         */
        first = cup12.cupRoll();
        assertTrue(first > 3 && first < 49);
        assertTrue(first != cup12.cupRoll());   // CAN FAIL

    }

    @Test
    public void getDies() {
    }

    @Test
    public void setDies() {
    }

    @Test
    public void getCupValue() {
    }

    @Test
    public void setCupValue() {
    }
}