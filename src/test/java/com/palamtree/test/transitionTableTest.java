package com.palamtree.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by roy on 2016/3/30.
 */
public class transitionTableTest {
    public static void main(String[] args) {
        String json_str = "{\"a\": 1}";

        Gson gson = new Gson();
        Map m = gson.fromJson(json_str, Map.class);
        int a = 1;
    }
}
