package lab5.bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Nhap so luong hinh: ");
        int n = kb.nextInt();
        kb.nextLine();

        Hinh ds[] = new Hinh[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Chon loai hinh se nhap: ");
            System.out.println("1: hinh vuong");
            System.out.println("2: hinh chu nhat");
            System.out.println("3: hinh tron");
            System.out.println("Nhap lua chon: ");

            int chon = kb.nextInt();
            kb.nextLine();
            switch (chon) {
                case 1:
                    ds[i] = new HinhVuong();
                    ds[i].nhap();
                    break;
                case 2:

                    ds[i] = new HinhChuNhat();
                    ds[i].nhap();
                    break;
                case 3:
                    ds[i] = new HinhTron();
                    ds[i].nhap();
                    break;
                default:
                    System.out.println("Ban phai chon 1 trong 3 loai tren");
            }

        }
        System.out.println("Danh sach cac hinh:");
        for (Hinh hinh : ds) {
            hinh.xuat();
        }
        Hinh hinhDienTichLonNhat = ds[0];
        for (Hinh hinh : ds) {
            if (hinh.dienTich() > hinhDienTichLonNhat.dienTich()) {
                hinhDienTichLonNhat = hinh;
            }
        }
        System.out.println("Hinh co dien tich lon nhat:");
        hinhDienTichLonNhat.xuat();

    }
}
