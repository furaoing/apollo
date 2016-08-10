package net.bigboo.apollo.common.io;
/**
 * Created by Roy on 10/22/2015.
 */

import java.io.*;

public class FileIO {

    public static String f_read(String file) {
        try {
            // TODO: Rewrite f_read function
            // link: http://stackoverflow.com/questions/4716503/reading-a-plain-text-file-in-java
            /*
            public static String readFile(String filename) throws IOException {
        StringBuilder sb = new StringBuilder();
        String everything;
        BufferedReader br = new BufferedReader(new FileReader(filename));
        try {
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            everything = sb.toString();
        } finally {
            br.close();
        }
        return everything;
    }
             */
            File fileDir = new File(file);

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(fileDir), "UTF8"));
            String text = "";
            String text_buffer;
            while ((text_buffer = br.readLine()) != null) {
                text = text + text_buffer + "\n";
            }
            br.close();
            return text;
        }
        catch (UnsupportedEncodingException e)
        {
            System.out.println(e.getMessage());
            return "";
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            return "";
        }
    }

    /* write string to file named "file" in CWD */
    public static int f_write(String file, String content){
        try {
            File fileDir = new File(file);

            BufferedWriter br = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream(fileDir), "UTF8"));

            br.write(content);
            br.close();
            return 0;
        }

        catch (UnsupportedEncodingException e)
        {
            System.out.println(e.getMessage());
            return 0;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            return 0;
        }
    }
}