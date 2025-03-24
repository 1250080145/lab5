package lab5.bai2;

import java.util.Scanner;

class HinhChuNhat implements Hinh{
     private float dai;
     private float rong;

     public HinhChuNhat(){
         this.dai = 0.0f;
         this.rong = 0.0f;
     }
     public HinhChuNhat(float dai, float rong) {
         this.dai = dai;
         this.rong = rong;
     }

     @Override
     public void nhap() {
         Scanner kb = new Scanner(System.in);
         System.out.print("Nhap chieu dai: ");
         dai = kb.nextFloat();
         System.out.print("Nhap chieu rong: ");
         rong = kb.nextFloat();
     }

     @Override
    public void xuat(){
         System.out.println("Chieu dai = "+dai+", chieu rong = "+rong);
         System.out.println("Dien tich HCN = "+dienTich());
     }

     @Override
    public float dienTich(){
         return dai*rong;
     }
}
