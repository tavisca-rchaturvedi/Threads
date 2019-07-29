package com.tavisca.workshops.callableexample1;
import java.util.concurrent.Callable;

public class PerimeterCalculator implements Callable<Double> {

    public double radius;
    public PerimeterCalculator(double radius){
        this.radius = radius;
    }

    @Override
    public Double call() {
        System.out.println("Perimeter is being calculated");
        return calculate(this.radius);
    }

    public double calculate(double radius){
        return 3.14*2*radius;
    }
}
