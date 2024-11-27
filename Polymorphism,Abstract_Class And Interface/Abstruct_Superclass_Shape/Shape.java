// Abstract Class Shape
public abstract class Shape {
   
    protected String color;
    protected boolean filled;

    //defaults constructors
    public Shape() {
        this.color = "red";
        this.filled = true;
    }

    //parametric constructor
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    //getters and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape[color=" + color + ", filled=" + filled + "]";
    }

    //main class
    // public static void main(String[] args) {
    //     //test for abstract methods
    //     Shape shape = new Shape();
    //     System.out.println("Shape: " + shape);
    //     System.out.printf("Area: %.2f%n", shape.getArea());
    //     System.out.printf("Perimeter: %.2f%n", shape.getPerimeter());

    //     //test for abstract class
    //     Shape shape2 = new Rectangle(5.0, 10.0);
    //     System.out.println("Shape 2: " + shape2);
    //     System.out.printf("Area: %.2f%n", shape2.getArea());
    //     System.out.printf("Perimeter: %.2f%n", shape2.getPerimeter());
    //     System.out.println("Color: " + shape2.getColor());
    //     System.out.println("Filled: " + shape2.isFilled());

    //     //test for toString method
    //     Shape shape3 = new Rectangle(3.0, 6.0, "blue", true);
    //     System.out.println("Shape 3: " + shape3);
    //     System.out.printf("Area: %.2f%n", shape3.getArea());
    //     System.out.printf("Perimeter: %.2f%n", shape3.getPerimeter());
    //     System.out.println("Color: " + shape3.getColor());
    //     System.out.println("Filled: " + shape3.isFilled());

    // }
}
