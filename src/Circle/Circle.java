package Circle;

public class Circle {
    private double radius = 1.0;
    private String color = "Blue";
    private boolean filled = false;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public Circle(double radius , String color , boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    @Override
    public String toString(){
        return  "Circle:{" +
                ", Radius= " + getRadius() +
                ", Color= " + getColor() +
                ", Boolean= " + isFilled() +
                "}";
    };
}
