public abstract class MatHang{
    protected String maMH,tenMH;
    protected double giaMH;
    public MatHang(String maMH, String tenMH, double giaMH){ 
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.giaMH = giaMH;
    }
    public double tinhGiaBan( int soLuong){
        return this.giaMH*soLuong;
    }
    public abstract double tinhKhuyenMai(int soLuong);
    public double tinhTongGiaBan(int soLuong){
        return this.tinhGiaBan(soLuong) - this.tinhKhuyenMai(soLuong);
    }
}