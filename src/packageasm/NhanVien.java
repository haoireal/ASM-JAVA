package packageasm;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author kenip
 */
public class NhanVien {
    static DecimalFormat numf = new DecimalFormat("#,###");
    static Scanner sc = new Scanner(System.in);

    private String manv, hoten, chucvu;
    private Double luong;

    public NhanVien() {
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public NhanVien(String manv, String hoten, double luong, String chucvu) {
        this.manv = manv;
        this.hoten = hoten;
        this.luong = luong;
        this.chucvu = chucvu;
    }

    public String getManv() {
        return manv;
    }

    public String getHoten() {
        return hoten;
    }

    public Double getLuong() {
        return luong;
    }

  

 
    public void setManv() {
        System.out.print(">> Nhap ma nhan vien cap nhat: ");
        this.manv = sc.nextLine();
        System.out.println("\t>>> CAP NHAT THANH CONG <<<");
    }

    public void setHoten() {
        System.out.print(">> Nhap ten nhan vien cap nhat: ");
        this.hoten = sc.nextLine();
        System.out.println("\t>>> CAP NHAT THANH CONG <<<");
    }

    public void setLuong() {
        System.out.println(">> Nhap luong moi cua nhan vien: ");
        this.luong = sc.nextDouble();
        System.out.println("\t>>> CAP NHAT THANH CONG <<<");
    }

    public Double getThuNhap() {
        return this.luong - getThueTN(luong);
    }

    // ==============Tính Thuế=============
    public double getThueTN(double luong) {
        if (luong <= 9000000) {
            return 0;
        } else if (luong <= 15000000) {
            return (luong - 9000000) * 0.1;
        } else {
            return ((luong - 15000000) * 0.12) + (6000000 * 0.1);
        }

    }

    public void Xuat() {
        System.out.println(">> Ma NV: " + this.manv +
                "\n>> Ho ten: " + this.hoten +
                "\n>> Luong: " + numf.format(this.luong) + " VND" +
                "\n>> Chuc vu: " + this.chucvu +
                "\n>> Thue thu nhap: " + numf.format(this.getThueTN(luong)) + " VND");
    }

    public Boolean FindNhanVien(NhanVien nv, String timma) {
        if (nv.getManv().equalsIgnoreCase(timma)) {
            nv.Xuat();
            return true;
        } else {
            return false;
        }
    }

    public Boolean UpNhanVien(NhanVien nv, String timma) {
        if (nv.getManv().equalsIgnoreCase(timma)) {
            return true;
        } else {
            return false;
        }
    }

    /* ================== CAP NHAT HO TEN ==================== */
    public void CapNhatTheoYC() {
        System.out.println("\t\t1. Cap nhat ma nhan vien");
        System.out.println("\t\t2. Cap nhat ten nhan vien");
        System.out.println("\t\t3. Cap nhat luong nhan vien");
        int key = (int) Double.parseDouble(sc.nextLine());
        switch (key) {
            case 1:
                this.setManv();
                break;
            case 2:
                this.setHoten();
                break;
            case 3:
                this.setLuong();
                break;
            default:
                System.out.println("\t>>> KHONG HOP LE! <<<");
                break;
        }
    }
}
