package language;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {


    /*
    ----------- Fields -----------
     */

    static String selectedLanguage = "ENG.txt";

    /*
    -------- Public Methods -------
     */

    /**
     * This methods looks for textlabels in our languageFiles and retours the text of that label.
     * @param field
     * @return
     */

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

    /*
    --------- Variables accessible ----
     */

    public static String getSelectedLanguage() {return selectedLanguage;}

    public static void setSelectedLanguage(String selectedLanguage) {Reader.selectedLanguage = selectedLanguage;    }

}
