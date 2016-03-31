/**
 * Created by roy on 2016/3/30.
 */
package com.palmtree.tmp;

public class transitionTable {
    public enum State {
        MyOK(true),
        Initial( false ),
        Final( true ),
        Error( false );

    static public final Integer length = 1 + Error.ordinal();

    final boolean accepting;

    State( boolean accepting ) {
        this.accepting = accepting;
    }

}
    State transition[][] = {
    //  A               B               C
    {
        State.Initial,  State.Final,    State.Error
    }, {
        State.Final,    State.Initial,  State.Error
    }
};
}
