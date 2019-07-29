public class Circle {


    public static void main(String[] args){
        AreaCalculator calculator1 = new AreaCalculator(4);
        PerimeterCalculator calculator2 = new PerimeterCalculator(4);
        Thread t1 = new Thread(calculator1);
        Thread t2 = new Thread(calculator2);
        t1.start();
        t2.start();
    }
}
