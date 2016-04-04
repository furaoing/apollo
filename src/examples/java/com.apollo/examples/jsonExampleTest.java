package com.apollo.examples;

import com.google.gson.Gson;
import com.apollo.common.io.FileIO;

import java.util.Map;

/**
 * Created by roy on 2016/3/30.
 */
public class jsonExampleTest {
    public static void main(String[] args) {
        String json_str = "{\"a\": 1}";
        String path = "D:\\workspace\\palmtree\\src\\test\\resources\\bird.json";
        json_str = FileIO.f_read(path);
        Gson gson = new Gson();
        Map m = gson.fromJson(json_str, Map.class);
        int a = 1;
    }
}
