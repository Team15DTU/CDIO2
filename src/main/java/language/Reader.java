package language;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

    Controller control = new Controller();
    Language land = new Language();
    static String controlFileName;

    static String selectedLanguage = "DK.txt";


    public String Reader () {

        selectedLanguage = control.getFileName();

        return selectedLanguage;

    }

    public static String print(String field) {

        String result = null;

        try {
            FileReader fr = new FileReader(selectedLanguage);
            BufferedReader br = new BufferedReader(fr);

            String str;
            while ((str = br.readLine()) != null) {

                if (str.equals(field)) {
                    result = br.readLine();
                }
            }
        } catch (IOException e) {

            System.out.println("Fejl");
        }
        return result;
    }
    public static String getSelectedLanguage() {
        return selectedLanguage;
    }

    public static void setSelectedLanguage(String selectedLanguage) {
        Reader.selectedLanguage = selectedLanguage;
    }

    public static String getControlFileName() {
        return controlFileName;
    }

    public static void setControlFileName(String controlFileName) {
        Reader.controlFileName = controlFileName;
    }
}

