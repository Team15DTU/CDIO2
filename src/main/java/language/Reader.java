package language;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

    public static String print (String field) {

        String result = null;

        try {
            FileReader fr = new FileReader("ENG.txt");
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
}

