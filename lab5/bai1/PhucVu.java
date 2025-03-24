package lab5.bai1;

 class PhucVu extends NhanVien{
     public PhucVu() {}

     public PhucVu(String maNhanVien, String tenNhanVien, String trinhDo, double luongCoBan){
         super(maNhanVien, tenNhanVien,trinhDo, luongCoBan);
     }

     @Override
     public double tinhLuong(){
         return luongCoBan;
     }
}
