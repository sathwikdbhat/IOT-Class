class Shape {

    void draw() {
        System.out.println("Drawing a generic shape");
    }

    void render(String color) {
        System.out.println("Rendering shape in " + color);
    }

    void render(String color, int transparency) {
        System.out.println("Rendering shape in " + color + " with " + transparency + "% transparency");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

public class demo {
    public static void main(String[] args) {
        Shape myShape = new Circle();
        myShape.draw(); 
        System.out.println("---");
        myShape.render("Red");
        myShape.render("Blue", 50);
    }
}