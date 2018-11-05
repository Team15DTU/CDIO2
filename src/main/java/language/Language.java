package language;

public class Language {

    static String languageCode;
    static String fileName;
    int landCode;

    public Language() {

    }

    public static String languageSwitch (int landCode) {

        switch (landCode) {
            case 1:
                languageCode = "DK";
                break;
            case 2:
                languageCode = "ENG";
                break;
            default:
                languageCode = "languageError";
                break;
        }

        return languageCode;
    }

    public static String fileSwitch (int landCode) {

        switch (landCode) {
            case 1:
                fileName = "DK.txt";
                break;
            case 2:
                fileName = "ENG.txt";
                break;
            default:
                fileName = "fileError";

        }
        return fileName;
    }

    public static String getLanguageCode() {
        return languageCode;
    }

    public static void setLanguageCode(String languageCode) {
        Language.languageCode = languageCode;
    }

    public static String getFileName() {
        return fileName;
    }

    public static void setFileName(String fileName) {
        Language.fileName = fileName;
    }

    public int getLandCode() {
        return landCode;
    }

    public void setLandCode(int landCode) {
        this.landCode = landCode;
    }
}
