package language;

import java.util.Scanner;

public class Controller {


    public Controller () {

        Scanner scan = new Scanner(System.in);

        System.out.println(Reader.print("SelectLanguage"));
    }

    public String languageSwitch (int landCode) {

        String languageCode;

        switch (landCode) {
            case 1:
                languageCode = "DK";
                break;
            case 2:
                languageCode = "ENG";
                break;
            default:
                languageCode = "The requested language is not support";
                break;
        }
    }
}
