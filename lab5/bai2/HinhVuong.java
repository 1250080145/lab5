package lab5.bai2;

import java.util.Scanner;

public class HinhVuong implements Hinh{
    private float canh;

    public HinhVuong(){
        this.canh = 0.0f;
    }
    public HinhVuong(float canh) {
        this.canh = canh;
    }
    public void nhap() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Nhap canh cho hinh vuong: ");
        canh = kb.nextFloat();
    }
    public void xuat(){
        System.out.println("Canh hinh vuong = "+canh);
        System.out.println("Dien tich hinh vuong = "+dienTich());
    }
    @Override
    public float dienTich(){
         return canh*canh;
    }
}
