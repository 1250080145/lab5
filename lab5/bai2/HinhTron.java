package lab5.bai2;

import java.util.Scanner;

class HinhTron implements Hinh{
     private float banKinh;
     public HinhTron() {
         this.banKinh = 0.0f;
     }
     public HinhTron(float banKinh){
         this.banKinh = banKinh;
     }
     @Override
     public void nhap() {
         Scanner kb = new Scanner(System.in);
         System.out.print("Nhap ban kinh hinh tron: ");
         banKinh = kb.nextFloat();
     }
     @Override
    public void xuat(){
         System.out.println("Ban kinh hinh tron = "+banKinh);
         System.out.println("Dien tich hinh tron = "+dienTich());
     }
    @Override
    public float dienTich() {
         return pi*banKinh*banKinh;
    }
}
