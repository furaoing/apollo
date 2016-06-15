package net.bigboo.apollotest;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by roy on 2016/4/6.
 */

public class setContainTest {
    public static void main(String[] args) {
        Set my_set = new HashSet<>();
        my_set.add("a");
        my_set.add("b");
        String c = "a";
        boolean test = my_set.contains(c);
        int a = 1;
    }
}
