package lab5.bai1;

import java.time.chrono.MinguoChronology;
import java.util.Scanner;

class NghienCuu extends NhanVien{
     private String chuyenMon;
     private double phuCapDocHai;

     public NghienCuu(){
         this.chuyenMon = "";
         this.phuCapDocHai = 0.0;
     }

     public NghienCuu(String maNhanVien, String tenNhanVien, String trinhDo,double luongCoBan, String chuyenMon, double phuCapDocHai){
         super(maNhanVien,tenNhanVien,trinhDo,luongCoBan);
         this.chuyenMon = chuyenMon;
         this.phuCapDocHai = phuCapDocHai;
     }

    public String getChuyenMon() {
        return chuyenMon;
    }

    public double getPhuCapDocHai() {
        return phuCapDocHai;
    }

    @Override
     public void nhap(){
         super.nhap();
         Scanner kb = new Scanner(System.in);
        System.out.print("Nhap chuyen mon: ");
        this.chuyenMon= kb.nextLine();
        System.out.println("Nhap phu cap doc hai: "+phuCapDocHai);
        this.phuCapDocHai=kb.nextDouble();
    }
    @Override
     public void xuat(){
         super.xuat();
        System.out.println("Chuyen mon: "+chuyenMon);
        System.out.println("Phu cap doc hai: "+phuCapDocHai);
    }

    @Override
     public double tinhLuong(){
         return luongCoBan + phuCapDocHai;
    }
}
