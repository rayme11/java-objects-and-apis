package code;

import model.Rectangle;
import model.Square;

public class Inheritance_SquareMethod {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Square square = new Square();

        rectangle.print();
        square.print("I am something else");
    }




}
