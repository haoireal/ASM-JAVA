package packageasm;

import java.util.Scanner;

/**
 *
 * @author kenip
 */
public class mainasm {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Control nhanvien = new Control();
        int menu = 0;
        while (true) {
            System.out.printf("\t\t\t\t|____________________________________________|\n");
            System.out.printf("\t\t\t\t|__________________| MENU |__________________|\n");
            System.out.printf("\t\t\t\t| 1. Nhap danh sach nhan vien                |\n");
            System.out.printf("\t\t\t\t| 2. Xuat danh sach nhan vien                |\n");
            System.out.printf("\t\t\t\t| 3. Tim va hien thi nhan vien theo ma       |");
            System.out.printf("\t\t|---------------------------|\n");
            System.out.printf("\t\t\t\t| 4. Xoa nhan vien theo ma                   |");
            System.out.printf("\t\t|  PS20626  PHAM GIA HAO    |\n");
            System.out.printf("\t\t\t\t| 5. Cap nhat thong tin nhan vien theo ma    |");
            System.out.printf("\t\t| MOB1014 Lap Trinh Java 1  |\n");
            System.out.printf("\t\t\t\t| 6. Tim cac nhan vien theo khoang luong     |");
            System.out.printf("\t\t|___________________________|\n");
            System.out.printf("\t\t\t\t| 7. Sap xep nhan vien theo ho va ten        |\n");
            System.out.printf("\t\t\t\t| 8. Sap xep nhan vien theo thu nhap         |\n");
            System.out.printf("\t\t\t\t| 9. Xuat 5 nhan vien co thu nhap cao nhat   |\n");
            System.out.printf("\t\t\t\t|  >> Nhap [ 0 ]  de ngung chuong trinh <<   |\n");
            System.out.printf("\t\t\t\t|____________________________________________|\n\n");
            System.out.print("\t\t\t\t>> Your choice: ");
            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 0:
                    System.exit(0);
                case 1:
                    nhanvien.nhapThongTin();
                    break;
                case 2:
                    nhanvien.xuatThongTin();
                    break;
                case 3:
                    nhanvien.TimNhanVien();
                    break;
                case 4:
                    nhanvien.XoaNhanVien();
                    break;
                case 5:
                    nhanvien.CapNhatNhanVien();
                    break;
                case 6:
                    nhanvien.TimNVTheoLuong();
                    break;
                case 7:
                    nhanvien.SapXepTheoHOTEN();
                    break;
                case 8:
                    nhanvien.SapXepTheoTHUNHAP();
                    break;
                case 9:
                    nhanvien.ThuNhapCaoNhat();
                    break;

                default:
                    System.out.println("\t\t\t\t>> LUA CHON KHONG HOP LE! <<");
                    break;

            }
        }
    }
}
