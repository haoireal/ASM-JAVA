package packageasm;
import java.text.DecimalFormat;
public class TruongPhong extends NhanVien {
    static DecimalFormat numf = new DecimalFormat("#,###");
    Double trachnhiem;

    @Override
    public Double getThuNhap() {
        return (super.getLuong() + this.trachnhiem) - super.getThueTN(super.getLuong() + this.trachnhiem);
    }

    TruongPhong() {

    }
    public Double getTrachnhiem() {
        return trachnhiem;
    }

    public void setTrachnhiem() {
        System.out.println(">> Cap nhat luong trach nhiem: ");
        do {
            try {
                System.out.print(">> Nhap luong trach nhiem: ");
                this.trachnhiem = Double.parseDouble(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.print("Vui long nhap lai!\n");
            }
        } while (true);
        System.out.println("\t>>> CAP NHAT THANH CONG <<<");
    }
    
    TruongPhong(String manv, String hoten, Double luong, String chucvu, Double trachnhiem) {
        super(manv, hoten, luong, chucvu);
        this.trachnhiem = trachnhiem;
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println(">> Trach nhiem: " + numf.format(this.trachnhiem) + " VND" +
                "\n>> Thu nhap: " + numf.format(this.getThuNhap()) + " VND");
    }

}
