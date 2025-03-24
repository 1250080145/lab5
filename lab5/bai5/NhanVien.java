package lab5.bai5;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

class NhanVien extends ConNguoi {
    private double luong;
    private Date ngayNhanViec;
    private PhongKhoaBan phongKhoaBan;

    public NhanVien() {
        super();
        this.luong = 0;
        this.ngayNhanViec = null;
        this.phongKhoaBan = null;
    }

    public NhanVien(String hoTen, int namSinh, double luong, Date ngayNhanViec, PhongKhoaBan phongKhoaBan) {
        super(hoTen, namSinh);
        this.luong = luong;
        this.ngayNhanViec = ngayNhanViec;
        this.phongKhoaBan = phongKhoaBan;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public Date getNgayNhanViec() {
        return ngayNhanViec;
    }

    public void setNgayNhanViec(Date ngayNhanViec) {
        this.ngayNhanViec = ngayNhanViec;
    }

    public PhongKhoaBan getPhongKhoaBan() {
        return phongKhoaBan;
    }

    public void setPhongKhoaBan(PhongKhoaBan phongKhoaBan) {
        this.phongKhoaBan = phongKhoaBan;
    }

    public void nhap() {
        super.nhap();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap luong: ");
        luong = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Nhap ngay nhan viec (ngay/thang/nam): ");
        String ngay = scanner.nextLine();
        try {
            ngayNhanViec = new SimpleDateFormat("dd/MM/yyyy").parse(ngay);
        } catch (Exception e) {
            ngayNhanViec = new Date();
        }
        phongKhoaBan = new PhongKhoaBan();
        phongKhoaBan.nhap();
    }

    public void xuat() {
        super.xuat();
        System.out.println("Luong: " + luong);
        System.out.println("Ngay nhan viec: " + new SimpleDateFormat("dd/MM/yyyy").format(ngayNhanViec));
        phongKhoaBan.xuat();
    }
}
