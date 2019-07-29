public class AreaCalculator implements Runnable {

    public double radius;

    public AreaCalculator(double radius){
        this.radius = radius;
    }

    @Override
    public void run() {
        System.out.println("Area is being calculated");
        System.out.println("Area is "  + calculate(this.radius));
    }

    public double calculate(double radius){
        return 3.14*radius*radius;
    }
}
