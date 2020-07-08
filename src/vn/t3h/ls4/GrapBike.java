package vn.t3h.ls4;
 
/**
 * Loaixe grap bike
 */
public class GrapBike extends Grap {
     
    private int soCuocChay;
     
    public GrapBike(String ten, int soCuocChay) {
        this.ten = ten;
        this.soCuocChay = soCuocChay;
    }
    
    @Override
    public String loaiXe() {
        return "Xe máy";
    }
    
    @Override
    public void tinhTien() {
        luong = Configs.LUONG_NHAN_VIEN_THEO_CUOC * soCuocChay;
    }
}
