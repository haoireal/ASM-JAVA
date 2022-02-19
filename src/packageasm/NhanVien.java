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

    private String manv, hoten,chucvu;
    private Double luong;

    

    public NhanVien() {
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

    public void setManv(String manv) {
        this.manv = manv;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
    
    public Double getThuNhap(){
        return this.luong - getThueTN(luong);
    }
  
//==============Tính Thuế=============
    public double getThueTN(double luong) {
        if (luong <= 9000000) {
            return 0;
        } else if (luong <= 15000000) {
            return (luong - 9000000) * 0.1;
        } else {
            return ((luong - 15000000) * 0.12) + (6000000 * 0.1);
        }

    }
    
    public void Xuat(){
        System.out.println(">> Ma NV: " + this.manv +
         "\n>> Ho ten: " + this.hoten +
         "\n>> Luong: "+ numf.format(this.luong) + " VND" +
         "\n>> Chuc vu: " + this.chucvu + 
         "\n>> Thue thu nhap: "+numf.format(this.getThueTN(luong)) + " VND");
    }    

    public Boolean FindNhanVien(NhanVien nv,String timma){
        if(nv.getManv().equalsIgnoreCase(timma)){
            nv.Xuat();
            return true;
        }else{
            return false;
        }
    }
    public Boolean UpNhanVien(NhanVien nv,String timma){
        if(nv.getManv().equalsIgnoreCase(timma)){
            return true;
        } else {
            return false;
        }
    }
}
