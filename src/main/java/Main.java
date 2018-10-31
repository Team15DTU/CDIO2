import game.Point;
import language.Reader;
import objects.Cup;

import java.io.IOException;

/**
 * @author Karl Emil Jeppesen
 * StudyID: s180557
 * Date: 22-10-2018
 * University: DTU
 */
public class Main {

    public static void main (String[] args) throws IOException {

        Cup cup = new Cup();
        cup.setCupValue(2); // Bare for at sikre jeg slår 2
        int raffle = cup.cupRoll();


        Point point = new Point();
        String turnField = point.nameSwitch(raffle);

        System.out.println(Reader.print(turnField));

    }

}
