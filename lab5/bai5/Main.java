package lab5.bai5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap thong tin hoc vien");
        HocVien hocVien = new HocVien();
        hocVien.nhap();

        System.out.println("Nhap thong tin nhan vien");
        NhanVien nhanVien = new NhanVien();
        nhanVien.nhap();

        System.out.println("Thong tin hoc vien: ");
        hocVien.xuat();

        System.out.println("Thong tin nhan vien: ");
        nhanVien.xuat();

    }
}
