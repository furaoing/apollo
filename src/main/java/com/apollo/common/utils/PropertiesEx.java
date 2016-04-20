package com.apollo.common.utils;

import java.io.*;
import java.util.Properties;
import java.util.Scanner;

/**
 * Created by roy on 2016/4/20.
 */

public class PropertiesEx extends Properties {
    public void load(String propertyFileName) throws IOException {
        InputStreamReader fis = new InputStreamReader(Thread.currentThread().
                    getContextClassLoader().
                    getResourceAsStream(propertyFileName), "UTF-8");

        Scanner in = new Scanner(fis);
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        while(in.hasNext()) {
            out.write(in.nextLine().replace("\\","\\\\").getBytes());
            out.write("\n".getBytes());
        }

        InputStream is = new ByteArrayInputStream(out.toByteArray());

        super.load(is);
    }
}
