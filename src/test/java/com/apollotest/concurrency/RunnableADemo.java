package com.apollotest.concurrency;

import com.apollo.common.utils.HttpRequest;

/**
 * Created by roy on 2016/5/5.
 */
public class RunnableADemo implements Runnable {
    private Thread t;
    private String threadName;

    RunnableADemo(String name){
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    public void run() {
        System.out.println("Running " + threadName);
        try {
            String response = HttpRequest.sendGet("http://www.baidu.com");
            System.out.println(threadName + " Crawling Finished");
            Thread.sleep(50);
        }
        catch(InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted");
            e.printStackTrace();
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if(t == null)
        {
            t = new Thread(this, threadName);
            t.start();
        }
    }

    public void join() {
        try {
            t.join();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
