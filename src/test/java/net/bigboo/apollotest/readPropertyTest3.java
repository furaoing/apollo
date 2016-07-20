package net.bigboo.apollotest;

import net.bigboo.apollo.common.utils.PropertyUtils;

import java.util.Optional;
import java.util.Properties;

/**
 * Created by rao on 16-4-6.
 */

public class readPropertyTest3 {
    public static void main(String[] args) {
        String aa = PropertyUtils.readPropertyAsText("apollo.properties").get();
        System.out.print(aa);
    }
}
