package Shapes;

public class ShapesTest {

    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(4, 5);
//        Rectangle box2 = new Square(5);
//
//        System.out.println("box1 Area = " + box1.getArea());
//        System.out.println("box1 Perimeter = " + box1.getPerimeter());
//
//        System.out.println("box2 Area = " + box2.getArea());
//        System.out.println("box2 Perimeter = " + box2.getPerimeter());

        Measurable myShape = new Rectangle(4, 5);
        Measurable mySquare = new Square(5);


        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        System.out.println(mySquare.getArea());
        System.out.println(mySquare.getPerimeter());

    }
}
