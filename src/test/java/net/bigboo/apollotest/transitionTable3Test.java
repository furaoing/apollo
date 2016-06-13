package net.bigboo.apollotest;

import net.bigboo.apollo.tmp.transitionTable3;
import net.bigboo.apollo.tmp.transitionTable3.Container;
import net.bigboo.apollo.tmp.FSM;
/**
 * Created by rao on 16-4-3.
 */
public class transitionTable3Test {
    public static void main(String[] args) {
        String s = "baaaa!";
        Container c = transitionTable3.load();
        FSM automata = new FSM(c.transitionTable);
        boolean result = automata.d_recog(s);
    }
}
