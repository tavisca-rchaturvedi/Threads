package com.tavisca.workshops.callableexample2;

import java.util.concurrent.*;

import java.util.ArrayList;
import java.util.List;

public class CallableExample2 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(10);
        List<Future<String>> list = new ArrayList<Future<String>>();

        Callable<String> c = new TestCallable();

        for(int i = 0; i < 1000; i++){
            Future<String> future = service.submit(new TestCallable());
            list.add(future);
        }

        for (Future<String> f : list) {
            System.out.println(f.get());
        };
    }
}


class TestCallable implements Callable<String>{

    @Override
    public String call() throws Exception{
        Thread.sleep(1000);
        return Thread.currentThread().getName();
    }
}
