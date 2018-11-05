package language;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

    static String selectedLanguage = "ENG.txt";

    public static String print(String field) {

        String result = null;

        try {
            FileReader fr = new FileReader( "src\\main\\resources\\" + selectedLanguage);
            BufferedReader br = new BufferedReader(fr);

            String str;
            while ((str = br.readLine()) != null) {

                if (str.equals(field)) {
                    result = br.readLine();
                }
            }
        } catch (IOException e) {

            System.out.println("fileError");
        }
        return result;
    }

    public static String getSelectedLanguage() {
        return selectedLanguage;
    }

    public static void setSelectedLanguage(String selectedLanguage) {
        Reader.selectedLanguage = selectedLanguage;
    }

}
