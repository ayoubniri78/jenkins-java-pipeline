package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
* Module DevOps
* TP : test un pipline ci avec java , jenkins , github webhook , et ngrok
* */
public class Main {
    public static void main(String[] args) {
            ExecutorService pool = Executors.newFixedThreadPool(1);
            pool.execute(new Task());
    }

    public static class Task extends Thread{
        @Override
        public void run() {
            System.out.println("bonjour c'est une thread");
            System.out.println("test 1");
        }
    }
}