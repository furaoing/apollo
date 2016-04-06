package com.apollo.tmp;

import com.apollo.tmp.transitionTable3.State;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by rao on 16-4-3.
 */

public class FSM {
    private static List<State> transition_table;

    private int index;

    private int current_state;

    public FSM(List<State> _transition_table){
        transition_table = _transition_table;
        index = 0;
        current_state = 0;
    }

    private boolean identify_init(char c){
        return c == transition_table.get(0).transitionCond.get("b");
    }

    public boolean d_recog(String text){
        index = 0;
        current_state = 0;
        String single_char_s;

        while (true) {
            if (index == text.length()){
                return current_state == 4;
            }
            single_char_s = Character.toString(text.charAt(index));

            if (!can_switch(single_char_s, current_state)) {
                return false;
            }
            else {
                current_state = state_switch(single_char_s, current_state);
                index += 1;
            }
        }
    }

    private int state_switch(String single_char_s, int state) {
        Map cond = transition_table.get(state).transitionCond;
        int state_id = (int) cond.get(single_char_s);
        return state_id;
    }

    private boolean can_switch(String single_char_s, int state) {
        Set tran_chars = transition_table.get(state).transitionCond.keySet();
        return tran_chars.contains(single_char_s);
    }
}
