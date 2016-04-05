package com.apollo.tmp;

import com.apollo.tmp.transitionTable3.State;

import java.util.List;

/**
 * Created by rao on 16-4-3.
 */
public class FSM {
    public static List<State> transition_table;

    private int index;

    private int current_state;

    private boolean identify_init(char c){
        return c == transition_table.get(0).transitionCond.get("b");
    }

    public boolean recog(String text){
        char[] t_chars = text.toCharArray();
        for (int i = 0; i < t_chars.length; i++){
            if (identify_init(t_chars[i])) {

            }
        }
        return true;
    }

    private boolean d_recog(char c) {

    }
}
