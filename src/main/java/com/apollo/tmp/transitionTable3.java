package com.apollo.tmp;

import com.apollo.common.io.FileIO;
import com.google.gson.Gson;

import java.util.List;
import java.util.Map;

/**
 * Created by rao on 16-4-3.
 */
public class transitionTable3 {

    public static class State {
        private int stateId;
        private String status;
        private Map<String, Integer> transitionCond;
    }

    public static class Container{
      private List<State> transitionTable;
   }

    public static Container load() {
        String path = "/home/rao/apollo/src/test/resources/bird.json";
        String json_str = FileIO.f_read(path);
        Gson gson = new Gson();
        Container c = gson.fromJson(json_str, Container.class);
        return c;
    }
}

