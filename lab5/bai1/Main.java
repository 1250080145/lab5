package lab5.bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        ArrayList<NhanVien>danhSachNhanVien = new ArrayList<>();

        QuanLy quanLy = new QuanLy("QL001", "Nguyen Van A", "Dai hoc", 10000000, "Quan tri", 2000000);
        quanLy.nhap();
        quanLy.xuat();
        System.out.println("Luong: " + quanLy.tinhLuong());

        NghienCuu nghienCuu = new NghienCuu("NC001", "Tran Thi B", "Thac si", 12000000, "Hoa hoc", 1500000);
        nghienCuu.nhap();
        nghienCuu.xuat();
        System.out.println("Luong: " + nghienCuu.tinhLuong());

        PhucVu phucVu = new PhucVu("PV001", "Le Van C", "Trung cap", 8000000);
        phucVu.nhap();
        phucVu.xuat();
        System.out.println("Luong: " + phucVu.tinhLuong());

        danhSachNhanVien.add(quanLy);
        danhSachNhanVien.add(nghienCuu);
        danhSachNhanVien.add(phucVu);


        System.out.println("Danh sach nhan vien: ");
        for (NhanVien nv : danhSachNhanVien) {
            nv.xuat();
            System.out.println("Luong: " + nv.tinhLuong());
        }
    }
}
