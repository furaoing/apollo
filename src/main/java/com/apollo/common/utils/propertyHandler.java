package com.apollo.common.utils;

import java.io.InputStreamReader;
import java.util.Properties;

/**
 * Created by roy on 2016/4/7.
 */
public class propertyHandler {
    public static String read(String property) {
        Properties p = new Properties();
        try {
            p.load(new InputStreamReader(Thread.currentThread().getContextClassLoader().getResourceAsStream("apollo.properties"), "UTF-8"));
            String root = p.getProperty(property);
            return root;
        } catch (Exception e) {
            System.out.println("No property file");
            return null;
        }
    }
}
