/**
 * Created by roy on 2016/3/30.
 */
package com.palmtree.tmp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

enum Stage {
    Initial,
    Normal,
    Final
}

public class transitionTable {

    List<Map> table;
    void insert(Map conds){
        table.add(conds);
    }
}
