public class PerimeterCalculator implements Runnable{

    public double radius;
    public PerimeterCalculator(double radius){
        this.radius = radius;
    }

    @Override
    public void run() {
        System.out.println("Perimeter is being calculated");

        System.out.println("Perimeter is " + calculate(this.radius));
    }

    public double calculate(double radius){
        return 3.14*2*radius;
    }
}
