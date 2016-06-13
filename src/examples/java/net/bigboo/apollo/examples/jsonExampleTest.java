package net.bigboo.apollo.examples;

import com.google.gson.Gson;
import net.bigboo.apollo.common.io.FileIO;

import java.util.Map;

/**
 * Created by roy on 2016/3/30.
 */
public class jsonExampleTest {
    public static void main(String[] args) {
        String json_str = "{\"a\": 1}";
        String path = "/home/rao/apollo/src/test/resources/bird.json";
        json_str = FileIO.f_read(path);
        Gson gson = new Gson();
        Map m = gson.fromJson(json_str, Map.class);
        int a = 1;
    }
}
