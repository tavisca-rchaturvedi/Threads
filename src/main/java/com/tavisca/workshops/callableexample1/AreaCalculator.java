package com.tavisca.workshops.callableexample1;

import java.util.concurrent.Callable;

public class AreaCalculator implements Callable<Double> {

    public double radius;

    public AreaCalculator(double radius){
        this.radius = radius;
    }

    @Override
    public Double call() {
        System.out.println("Area is being calculated");
        //System.out.println("Area is "  + calculate(this.radius));
        return calculate(this.radius);
    }



    public double calculate(double radius){
        return 3.14*radius*radius;
    }
}
