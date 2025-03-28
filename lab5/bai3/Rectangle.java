package lab5.bai3;

 class Rectangle extends shape {
 private double width;
 private double length;

 public Rectangle() {
     this.width=0.0;
     this.length=0.0;
 }
 public Rectangle(double width, double length){
     this.width =  width;
     this.length = length;
 }
 public Rectangle(double width, double length, String color, boolean filled){
 super(color,filled);
     this.width =  width;
     this.length = length;
    }

     public double getWidth() {
         return width;
     }

     public void setWidth(double width) {
         this.width = width;
     }

     public double getLength() {
         return length;
     }

     public void setLength(double length) {
         this.length = length;
     }
     @Override
     public double getArea() {
     return width * length;
     }
     @Override
     public double getPerimeter(){
     return 2*(width+length);
     }

     @Override
     public String toString() {
         return "Rectangle: Width= "+width+", Length= "+length+", color= "+color+", filled= "+filled;
     }
 }
