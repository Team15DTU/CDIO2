package language;

public class Language {


    /*
    ----------- Fields -----------
     */

    private static String languageCode;
    private static String fileName;

    /*
    -------- Public Methods -------
     */

    /**
     * This method sets the languageCode and fileName from input from user.
     * @param input is ths number for the selected language.
     */


    public static void languageSwitch (int input) {

        switch (input) {
            case 1:
                languageCode = "DK";
                fileName = "DK.txt";
                break;
            case 2:
                languageCode = "ENG";
                fileName = "ENG.txt";
                break;
            default:
                languageCode = "languageError";
                fileName = "fileError";
                break;
        }

    }

    /*
    --------- Variables accessible ----
     */


    public static String getLanguageCode() {return languageCode;}

    public static void setLanguageCode(String languageCode) {Language.languageCode = languageCode;}

    public static String getFileName() {return fileName;}

    public static void setFileName(String fileName) {Language.fileName = fileName;}
}
