package lab5.bai1;

import java.util.Scanner;

class QuanLy extends NhanVien {
     private String chuyenMon;
     private double phuCapChucVu;

     public QuanLy() {
         this.chuyenMon = "";
         this.phuCapChucVu = 0.0;
     }

     public QuanLy(String maNhanVien, String tenNhanVien, String trinhDo, double luongCoBan, String chuyenmon, double phuCapChucVu) {
         super(maNhanVien, tenNhanVien, trinhDo, luongCoBan);
         this.chuyenMon = chuyenMon;
         this.phuCapChucVu = phuCapChucVu;
     }

     public String getChuyenmon() {
         return chuyenMon;
     }

     public double getPhuCapChucVu() {
         return phuCapChucVu;
     }

     @Override
         public void nhap() {
         super.nhap();
             Scanner kb = new Scanner(System.in);
             System.out.print("Nhap chuyen mon: ");
             this.chuyenMon = kb.nextLine();
             System.out.print("Nhap phu cap chuc vu: ");
             this.phuCapChucVu = kb.nextDouble();
     }

     @Override
     public void xuat() {
         super.xuat();
         System.out.println("Chuyen mon: "+chuyenMon);
         System.out.println("Phu cap chuc vu: "+phuCapChucVu);
     }

     @Override
     public double tinhLuong() {
         return luongCoBan + phuCapChucVu;
     }
 }
