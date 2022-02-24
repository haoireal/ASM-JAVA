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

    public Double getDoanhso() {
        return doanhso;
    }

    public void setDoanhso() {
        System.out.println(">> Cap nhat doanh so: ");
        do {
            try {
                System.out.print(">> Nhap doanh so tiep thi: ");
                this.doanhso = Double.parseDouble(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.print("Vui long nhap lai!\n");
            }
        } while (true);

        System.out.println("\t>>> CAP NHAT THANH CONG <<<");
    }

    public Double getHuehong() {
        return huehong;
    }

    public void setHuehong(Double huehong) {
        this.huehong = huehong;
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
