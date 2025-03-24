package lab5.bai4;

public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(5, 5, 2, 2);
        System.out.println("Truoc khi di chuyen: " + point);
        point.moveUp();
        System.out.println("Sau khi di chuyen len: " + point);
        point.moveRight();
        System.out.println("Sau khi di chuyen sang phai: " + point);

        MovableCircle circle = new MovableCircle(10, 10, 3, 3, 5);
        System.out.println("Truoc khi di chuyen: " + circle);
        circle.moveDown();
        System.out.println("Sau khi di chuyen xuong: " + circle);
    }
}

