package net.bigboo.apollotest;

import net.bigboo.apollo.common.utils.propertyHandler;

/**
 * Created by rao on 16-4-6.
 */

public class readPropertyTest {
    public static void main(String[] args) {
        String a = "regex.properties";
        propertyHandler.loadPropertiesEx(a);
        String text = propertyHandler.readPropertyEx("test");
        if (text != null) {
            System.out.println(text);
        }
        else {
            System.out.println("Property Read failed");
        }
    }
}
