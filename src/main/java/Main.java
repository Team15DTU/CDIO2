import game.Point;
import language.Controller;
import language.Reader;
import objects.Cup;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * @author Karl Emil Jeppesen
 * StudyID: s180557
 * Date: 22-10-2018
 * University: DTU
 */
public class Main {

    public static void main(String[] args) throws IOException {

        Controller control = new Controller();
        String language;
        String fileName;

        for (int i =1; i<5; i++) {
            Controller.selectorWindow();

            if (control.fileName() != Reader.getSelectedLanguage()) {
                Reader.setSelectedLanguage(control.getFileName());
            }
            fileName = control.getFileName();
            language = control.language();


            System.out.println(Reader.print("selectedLanguage") + Reader.print(language));


            Cup cup = new Cup();
            int raffle = cup.cupRoll();

            Point point = new Point();
            String turnField = point.nameSwitch(raffle);

            System.out.println(Reader.print(turnField));

        }

    }
}
