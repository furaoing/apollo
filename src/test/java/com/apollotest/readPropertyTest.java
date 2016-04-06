package com.apollotest;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * Created by rao on 16-4-6.
 */
public class readPropertyTest {
    public static void main(String[] args) {
        Properties p = new Properties();
        try {
            p.load(new InputStreamReader(Thread.currentThread().getContextClassLoader().getResourceAsStream("apollo.properties"), "UTF-8"));
            String root = p.getProperty("root");
        }
        catch (Exception e){
            System.out.println("No property file");
        }
    }

}
