class Shape {
    void draw() {
        System.out.println("Drawing a generic shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle with radius r");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle with length and width");
    }
}

public class size {
    public static void main(String[] args) {
        Shape myShape;
        myShape = new Circle();
        myShape.draw();
        myShape = new Rectangle();
        myShape.draw();
    }
}