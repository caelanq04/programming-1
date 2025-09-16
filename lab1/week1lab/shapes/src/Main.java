public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.makeVisible();

        Square square1 = new Square();
        square1.makeVisible();

        circle1.moveDown();
        circle1.moveRight();
        circle1.moveRight();

        // square1.moveHorizontal(100);
        square1.moveHorizontal(-50);
        square1.moveVertical(10);

        circle1.changeColor("green");

        Circle circle2 = new Circle();
        circle2.makeVisible();

        System.out.println(circle1);
        System.out.println(square1);
        System.out.println(circle2);

    }
}