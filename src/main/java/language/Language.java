package language;

public class Language {

    String languageCode;
    String fileName;
    int landCode;

    public Language() {

    }

    public String languageSwitch (int landCode) {

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

    public String fileSwitch (int landCode) {

        this.landCode=landCode;

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

    public String getLanguageCode() {return languageCode;}
    public void setLanguageCode(String languageCode) {this.languageCode = languageCode;}

    public String getFileName() { return fileName;}
    public void setFileName(String fileName) {this.fileName = fileName;}

    public int getLandCode() {
        return landCode;
    }
    public void setLandCode(int landCode) {
        this.landCode = landCode;
    }
}
