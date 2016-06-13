package net.bigboo.apollo.tmp;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by rao on 16-4-3.
 */

public class FSM {
    private static List<transitionTable3.State> transition_table;

    private int index;

    private int current_state;

    public FSM(List<transitionTable3.State> _transition_table){
        transition_table = _transition_table;
        index = 0;
        current_state = 0;
    }

    public boolean d_recog(String text){
        index = 0;
        current_state = 0;
        // set initial current_state to be 0 so that the first char of text will be
        // tested for start state af the beginning
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
