package lab5.bai4;

import java.util.Scanner;

class MovableCircle implements Movable {
     private int radius;
     private MovablePoint center;

     public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
         this.center = new MovablePoint(x, y, xSpeed, ySpeed);
         this.radius = radius;
     }

     public void nhap(){
         Scanner kb = new Scanner(System.in);
         center.nhap();
         System.out.print("Nhap ban kinh: "+ radius);
         this.radius=kb.nextInt();
     }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MovablePoint getCenter() {
        return center;
    }

    public void setCenter(MovablePoint center) {
        this.center = center;
    }
    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
    @Override
    public String toString() {
        return "Hinh tron tai " + center.toString() + ", ban kinh= " + radius;
    }
}
