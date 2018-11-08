package language;

import java.util.Scanner;

public class Controller {

    /*
    ----------- Fields -----------
     */

    Language land = new Language();

    private static String fileName;
    private static String language;

    private static int input;

    /*
    ---------- Constructors -------
     */

    public Controller () {

        fileName=Language.fileSwitch(input);
        language=Language.languageSwitch(input);

    }

    /*
    -------- Public Methods -------
     */

    /**
     * This method asks the user about preferred language and sets it up.
     * @return input from user which is used in setting up language.
     */

    public static int selectorWindow() {

        Scanner scan = new Scanner(System.in);

        System.out.println(Reader.print("selectLanguage"));
        System.out.println("1 - " + Reader.print("DK"));
        System.out.println("2 - " + Reader.print("ENG"));

        input = scan.nextInt();

        fileName = Language.fileSwitch(input);
        language = Language.languageSwitch(input);
        Reader.setSelectedLanguage(fileName);
        System.out.println(Reader.print("selectedLanguage")+ " " + Reader.print(language));

        return input;
    }

    /*
    --------- Variables accessible ----
     */

    public String getFileName(){return fileName;}

    public void setFileName(String fileName) {this.fileName = fileName;}

    public Language getLand() {return land;}

    public void setLand(Language land) {this.land = land;}

    public static int getInput() {return input;}

    public static void setInput(int input) {Controller.input = input;}

    public static String getLanguage() {return language;}

    public static void setLanguage(String language) {Controller.language = language;}

}
