package vn.t3h.ls4;
 
/**
 * GrapCar
 */
public class GrapCar extends Grap {
     
    private int gioChayThem; // Số giờ chạy thêm
    private int loaiXe; // Loại xe Ford hay Kia
    
    public GrapCar(String ten, int gioChayThem, int loaiXe) {
        super(ten);
        this.gioChayThem = gioChayThem;
        this.loaiXe = loaiXe;
    }
    
    @Override
    public String loaiXe() {
        if (loaiXe == Configs.XE_FORD) {
            return "Ô tô Ford " + (gioChayThem > 0 ? " (có làm thêm giờ)": " (Không làm thêm giờ)");
        } else {
            return "Ô tô Kia " + (gioChayThem > 0 ? " (có làm thêm giờ)":" (Không làm thêm giờ)");
        }
    }
    
    @Override
    public void tinhTien() {
        if (loaiXe == Configs.XE_FORD) {
            luong = Configs.LUONG_NHAN_VIEN_XE_FORD + gioChayThem * Configs.LUONG_LAM_THEM_MOI_GIO;
        } else if (loaiXe == Configs.XE_KIA) {
            luong = Configs.LUONG_NHAN_VIEN_XE_KIA + gioChayThem * Configs.LUONG_LAM_THEM_MOI_GIO;
        }
    }
}
