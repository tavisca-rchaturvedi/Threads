package com.tavisca.workshops.callableexample1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Circle {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<Double> f1 = service.submit(new AreaCalculator(4.5));
        Future<Double> f2 = service.submit(new PerimeterCalculator(4.5));
        System.out.println("Area is " + f1.get());
        System.out.println("Area is " + f2.get());

    }
}
