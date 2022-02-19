package packageasm;
import java.text.DecimalFormat;
public class TiepThi extends NhanVien {
    static DecimalFormat numf = new DecimalFormat("#,###");
    Double doanhso, huehong = 0.0;

    @Override
    public Double getThuNhap() {
        return (super.getLuong() + this.getHueHong() - (super.getThueTN(super.getLuong() + this.getHueHong())));
    }

    TiepThi() {

    }

    TiepThi(String manv, String hoten, Double luong, String chucvu, Double doanhso) {
        super(manv, hoten, luong, chucvu);
        this.doanhso = doanhso;
    }

    public Double getHueHong() {
        return this.huehong = this.doanhso * 0.08;
    }

    @Override
    public void Xuat() {
        super.Xuat(); 
        System.out.println(
                ">> Doanh so: " + numf.format(this.doanhso) + " VND" +
                        "\n>> Hue hong ( 8% ): " + numf.format(this.getHueHong()) + " VND" +
                        "\n>> Thu nhap: " + numf.format(this.getThuNhap()) + " VND");
    }

}
