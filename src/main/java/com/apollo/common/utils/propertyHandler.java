package com.apollo.common.utils;

import java.io.InputStreamReader;
import java.util.Properties;

/**
 * Created by roy on 2016/4/7.
 */
public class propertyHandler {
    private static Properties p;

    public static String readApolloProperty(String key) {
        String propertyFileName = "apollo.properties";
        Properties apolloProperty = new Properties();
        try {
            apolloProperty.load(new InputStreamReader(Thread.currentThread().getContextClassLoader().getResourceAsStream(propertyFileName), "UTF-8"));
            String root = apolloProperty.getProperty(key);
            return root;
        } catch (Exception e) {
            System.out.println("No property file");
            return null;
        }
    }

    public static boolean loadProperties(String propertyFileName) {
        p = new Properties();
        try {
            p.load(new InputStreamReader(Thread.currentThread().
                    getContextClassLoader().
                    getResourceAsStream(propertyFileName), "UTF-8"));
            return true;
        } catch (Exception e) {
            System.out.println("No property file");
            return false;
        }
    }

    public static String readProperty(String key) {
        try {
            String root = p.getProperty(key);
            return root;
        } catch (Exception e) {
            System.out.println("No property key");
            return null;
        }
    }

    public static boolean loadPropertiesEx(String propertyFileName) {
        p = new PropertiesEx();
        try {

            return true;
        } catch (Exception e) {
            System.out.println("No property file");
            return false;
        }
    }

    public static String readPropertyEx(String key) {
        try {
            String root = p.getProperty(key);
            return root;
        } catch (Exception e) {
            System.out.println("No property key");
            return null;
        }
    }


}
