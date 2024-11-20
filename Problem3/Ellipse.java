package Problem3;

// Created Ellipse class.
public class Ellipse extends Shape{
    private double a;
    private double b;

    // Created the constructor.
    public Ellipse(double a, double b) {
        super("Ellipse");
        if (a < b) {
            double temp = a;
            a = b;
            b = temp;
        }
        this.a = a;
        this.b = b;
    }

    // Created toString method.
    public double getArea() {
        return Math.PI * a * b;
    }

    public double getPerimeter() {
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) *(a + 3 * b)));
    }
    
}
