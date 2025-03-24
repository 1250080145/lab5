package lab5.bai5;

import java.util.Scanner;

class PhongKhoaBan {
     private String maPhongKhoaBan;
     private String tenPhongKhoaBan;

     public PhongKhoaBan() {
         this.maPhongKhoaBan="";
         this.tenPhongKhoaBan="";
     }
     public PhongKhoaBan(String maPhongKhoaBan, String tenPhongKhoaBan) {
         this.maPhongKhoaBan=maPhongKhoaBan;
         this.tenPhongKhoaBan=tenPhongKhoaBan;
     }

     public String getMaPhongKhoaBan() {
         return maPhongKhoaBan;
     }

     public void setMaPhongKhoaBan(String maPhongKhoaBan) {
         this.maPhongKhoaBan = maPhongKhoaBan;
     }

     public String getTenPhongKhoaBan() {
         return tenPhongKhoaBan;
     }

     public void setTenPhongKhoaBan(String tenPhongKhoaBan) {
         this.tenPhongKhoaBan = tenPhongKhoaBan;
     }

     public void nhap(){
         Scanner kb = new Scanner(System.in);
         System.out.print("Nhap ma phong khoa ban: ");
         maPhongKhoaBan = kb.nextLine();
         System.out.print("Nhap ten phong khoa ban: ");
         tenPhongKhoaBan = kb.nextLine();
     }
     public void xuat(){
         System.out.println("Ma phong khoa ban: "+maPhongKhoaBan);
         System.out.println("Ten phong khoa ban: "+tenPhongKhoaBan);
     }
 }
