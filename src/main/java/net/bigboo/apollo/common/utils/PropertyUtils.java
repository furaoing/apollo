package net.bigboo.apollo.common.utils;

import java.io.InputStreamReader;
import java.util.Optional;
import java.util.Properties;

/**
 * Created by roy on 2016/4/7.
 */

public class PropertyUtils {
    // TODO: Static variable should be removed;
    private static PropertiesEx pEx;

    public static Optional<String> readApolloProperty(String key) {
        String propertyFileName = "apollo.properties";
        Optional<Properties> apolloPropertyOptional = loadProperties(propertyFileName);
        if (apolloPropertyOptional.isPresent()) {
            Properties properties = apolloPropertyOptional.get();
            if (properties.isEmpty()) {
                return Optional.empty();
            } else {
                return readProperty(properties, key);
            }
        }
        else {
            return Optional.empty();
        }
    }

    public static Optional<Properties> loadProperties(String propertyFileName) {
        Properties properties = new Properties();
        try {
            properties.load(new InputStreamReader(Thread.currentThread().
                    getContextClassLoader().
                    getResourceAsStream(propertyFileName), "UTF-8"));
            return Optional.of(properties);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("No property file");
            return Optional.empty();
        }
    }

    public static Optional<String> readProperty(Properties properties, String key) {
        if(properties.isEmpty()){
            return Optional.empty();
        }
        else {
            try {
                String value = properties.getProperty(key);
                return Optional.of(value);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("No property key");
                return Optional.empty();
            }
        }
    }

    // TODO: LoadPropertiesEx bug, can not support utf-8, fail to replace backslash
    public static boolean loadPropertiesEx(String propertyFileName) {
        pEx = new PropertiesEx();
        try {
            pEx.load(propertyFileName);
            return true;
        } catch (Exception e) {
            System.out.println("No property file");
            return false;
        }
    }

    public static String readPropertyEx(String key) {
        try {
            String value = pEx.getProperty(key);
            return value;
        } catch (Exception e) {
            System.out.println("No property key");
            return null;
        }
    }
}
