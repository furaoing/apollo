package net.bigboo.apollotest;

import net.bigboo.apollo.common.utils.PropertyUtils;

import java.util.Optional;
import java.util.Properties;

/**
 * Created by rao on 16-4-6.
 */

public class readPropertyTest2 {
    public static void main(String[] args) {
        Optional<Properties> propertiesOptional = PropertyUtils.loadProperties("apollo.properties");
        if(propertiesOptional.isPresent()){
            Properties p = propertiesOptional.get();
            Optional<String> value = PropertyUtils.readProperty(p, "LinuxRoot");
            if (value.isPresent()){
                System.out.println(Long.parseLong((value.get())));
            }
            else{
                System.out.println("No property key found");
            }
        }
        else{
            System.out.println("No property found");
        }
    }
}
