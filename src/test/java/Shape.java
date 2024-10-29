class Shape {
    public void draw() {
        System.out.println("Drawing shape.");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle.");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle.");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Triangle.");
    }
}

public class DrawingApp {
    public static void startDrawing(Shape shape) {
        shape.draw();
    }

    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new (Rectangle);
        Shape triangle = new Triangle();

        startDrawing(circle);
        startDrawing(rectangle);
        startDrawing(triangle);
    }

