package lab5.bai3;

 class Square extends Rectangle {
     public Square(){}

     public Square(double side){
         super(side,side);
     }


     public Square(double side, String color, boolean filled){
         super(side, side, color, filled);
     }

     public double getSide() {
         return getWidth();
     }

     public void setSide(double side) {
         setLength(side);
         setWidth(side);
     }

     @Override
     public void setWidth(double width) {
         super.setWidth(width);
     }

     @Override
     public void setLength(double leight) {
         super.setLength(leight);
     }

     @Override
     public String toString() {
         return("Square: Side="+getSide()+", Color= "+getColor()+", Filled= "+isFilled());
     }
 }
