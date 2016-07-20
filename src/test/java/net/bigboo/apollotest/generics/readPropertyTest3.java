package net.bigboo.apollotest.generics;

import net.bigboo.apollo.common.utils.PropertyUtils;

import java.util.Optional;
import java.util.Properties;

/**
 * Created by rao on 16-4-6.
 */

public class readPropertyTest3 {
    public static void main(String[] args) {
        Optional<Properties> propertiesOptional = PropertyUtils.loadProperties("apollo.properties");
        int result = PropertyUtils.parseInt(propertiesOptional.get(), "Rate").get();
        System.out.println(result);
    }
}
