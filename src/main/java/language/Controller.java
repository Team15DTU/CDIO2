package language;

import java.util.Scanner;

public class Controller {

    Language land = new Language();

    private static String fileName;
    private static String language;

    private static int input;

    public static int selectorWindow() {

        Scanner scan = new Scanner(System.in);

        System.out.println(Reader.print("selectLanguage"));
        System.out.println("1 - " + Reader.print("DK"));
        System.out.println("2 - " + Reader.print("ENG"));

        input = scan.nextInt();

        return input;
    }

    public String language() {

        language = land.languageSwitch(input);
        return language;
    }

    public String fileName() {

        fileName = land.fileSwitch(input);
        return fileName;

    }

    public void languageUpdate() {

        Reader.setSelectedLanguage(fileName());

    }

    // Variables Setters and Getters

    public String getFileName(){return fileName;}

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Language getLand() {
        return land;
    }

    public void setLand(Language land) {
        this.land = land;
    }

    public static int getInput() {
        return input;
    }

    public static void setInput(int input) {
        Controller.input = input;
    }

    public static String getLanguage() {
        return language;
    }

    public static void setLanguage(String language) {
        Controller.language = language;
    }

}
