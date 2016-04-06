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

    public boolean d_recog(String text){
        index = 0;
        current_state = 0;

        for (int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            if (i == text.length() - 1){
                return current_state == 4;
            }
            else if (!can_switch(c, current_state)) {
                return false;
            }
            else {
                current_state = state_switch(c, current_state);
                index += 1;
            }
        }
        return true;
    }

    private int state_switch(char c, int state) {
        return 2;
    }

    private boolean can_switch(char c, int state) {
        return true;
    }
}
