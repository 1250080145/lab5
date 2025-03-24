package lab5.bai3;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "blue", true);


        Rectangle rectangle = new Rectangle(4, 6, "green", false);


        Square square = new Square(3, "yellow", true);


        System.out.println("Thong tin hinh tron:");
        System.out.println(circle);

        System.out.println("Thong tin HCN:");
        System.out.println(rectangle);

        System.out.println("Thong tin hinh vuong:");
        System.out.println(square);


        System.out.println("Kiem tra equals:");
        System.out.println("Circle va Rectangle co bang nhau khong? " + circle.equals(rectangle));
        System.out.println("Rectangle và Square co bang nhau khong? " + rectangle.equals(square));
    }
}