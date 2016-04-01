/**
 * Created by roy on 2016/3/30.
 */
package com.apollo.test;

public class transitionTable {
    enum State {
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
