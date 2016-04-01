/**
 * Created by roy on 2016/3/30.
 */
package com.apollo.tmp;

import java.util.List;
import java.util.Map;

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
