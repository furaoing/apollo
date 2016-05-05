package com.apollotest.concurrency;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by roy on 2016/5/5.
 */

public class TestThread {
    public static void main(String args[]) {
        long start_time = System.currentTimeMillis();
        List<RunnableADemo> r = new LinkedList<>();
        for(int i = 0; i < 50; i++) {
            RunnableADemo r_tmp = new RunnableADemo("Thread - " + i);
            r_tmp.start();
            r.add(r_tmp);
        }
        for(int i = 0; i < 50; i++) {
            r.get(i).join();
        }
        long end_time = System.currentTimeMillis();
        long pos_time = end_time - start_time;
        System.out.println(pos_time);
    }
}
