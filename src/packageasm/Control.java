package packageasm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Control extends NhanVien {
    static Scanner sc = new Scanner(System.in);
    public static ArrayList<NhanVien> nhanvien = new ArrayList<NhanVien>();

    // ================Nhập Thông Tin==============
    public void nhapThongTin() {
        do {
            System.out.print(">> Nhap ma nhan vien: ");
            String msnv = sc.nextLine();

            System.out.print(">> Nhap ten nhan vien: ");
            String name = sc.nextLine();
            Double luong = 0.0;
            do {
                try {
                    System.out.print(">> Nhap luong nhan vien: ");
                    luong = Double.parseDouble(sc.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.print("Vui long nhap lai!\n");
                }
            } while (true);
            int chuc = 0;
            do {
                int temp = 0;
                do {
                    try {
                        System.out.print(">> Nhap chuc vu: \n(1) Truong Phong\n(2) Tiep Thi\n(3) Hanh Chinh\n>> ");
                        chuc = Integer.parseInt(sc.nextLine());
                        break;
                    } catch (Exception e) {
                        System.out.print("Vui long nhap lai!\n");
                    }
                } while (true);

                switch (chuc) {
                    case 1:
                        Double luongtrachnhiem = 0.0;
                        do {
                            try {
                                System.out.print(">> Nhap luong trach nhiem: ");
                                luongtrachnhiem = Double.parseDouble(sc.nextLine());
                                break;
                            } catch (Exception e) {
                                System.out.print("Vui long nhap lai!\n");
                            }
                        } while (true);
                        NhanVien nvtp = new TruongPhong(msnv, name, luong, "Truong Phong", luongtrachnhiem);
                        nhanvien.add(nvtp);
                        break;
                    case 2:
                        Double doanhso = 0.0;
                        do {

                            try {
                                System.out.print(">> Nhap doanh so tiep thi: ");
                                doanhso = Double.parseDouble(sc.nextLine());
                                break;
                            } catch (Exception e) {
                                System.out.print("Vui long nhap lai!\n");
                            }
                        } while (true);
                        NhanVien nvtt = new TiepThi(msnv, name, luong, "Tiep Thi", doanhso);
                        nhanvien.add(nvtt);
                        break;
                    case 3:
                        NhanVien nvhc = new NhanVien(msnv, name, luong, "Hanh Chinh");
                        nhanvien.add(nvhc);
                        break;
                    default:
                        System.out.println("Khong hop le! Nhap lai");
                        temp++;
                        break;
                }
                if (temp == 0) {
                    break;
                }
            } while (true);
            System.out.print(">> Ban muon nhap tiep C/K: ");
            String x = sc.nextLine();
            if (x.equalsIgnoreCase("K")) {
                break;
            }
        } while (true);
    }
    // ================Xuất Thông Tin==============

    public void xuatThongTin() {
        int temp = 1;
        for (NhanVien item : nhanvien) {
            System.out.println("========== THONG TIN NHAN VIEN THU " + temp + " ==========");
            item.Xuat();
            temp++;
        }
    }

    /* =========== TIM NHAN VIEN THEO MA ==================== */
    public void TimNhanVien() {
        int temp = 0;
        System.out.print(">> Nhap ma nhan vien can tim: ");
        String timma = sc.nextLine();

        for (NhanVien item : nhanvien) {
            if (FindNhanVien(item, timma) == true) {
                temp++;
            }
        }
        if (temp == 0) {
            System.out.println(">> KHONG TIM THAY MA NHAN VIEN NAY!");
        }
    }
    /* ================== XOA NHAN VIEN ==================== */

    public void XoaNhanVien() {
        int temp = 0;
        int temp1 = 0;
        System.out.print(">> Nhap ma nhan vien can xoa: ");
        String timma = sc.nextLine();

        for (NhanVien item : nhanvien) {
            if (item.getManv().equalsIgnoreCase(timma)) {
                nhanvien.remove(temp);
                System.out.println(">> Da tim thay! Tien hanh xoa <<");
                temp1++;
                break;
            }
            temp++;
        }
        if (temp1 == 0) {
            System.out.println(">> KHONG TIM THAY MA NHAN VIEN NAY <<");
        }
    }

    /* ================== CAP NHAT NHAN VIEN ==================== */

    public void CapNhatNhanVien() {
        System.out.print(">> Nhap ma nhan vien can cap nhat: ");
        String timma = sc.nextLine();
        int flag = 0;
        for (NhanVien item : nhanvien) {
            if (item.getManv().equalsIgnoreCase(timma)) {
                System.out.println(">>> DA TIM THAY!! TIEN HANH CAP NHAT");
                System.out.print(">> Nhap ma nhan vien: ");
                String msnv = sc.nextLine();

                System.out.print(">> Nhap ten nhan vien: ");
                String name = sc.nextLine();
                Double luong = 0.0;
                do {
                    try {
                        System.out.print(">> Nhap luong nhan vien: ");
                        luong = Double.parseDouble(sc.nextLine());
                        break;
                    } catch (Exception e) {
                        System.out.print("Vui long nhap lai!\n");
                    }
                } while (true);
                int chuc = 0;
                do {
                    int temp = 0;
                    do {
                        try {
                            System.out.print(">> Nhap chuc vu: \n(1) Truong Phong\n(2) Tiep Thi\n(3) Hanh Chinh\n>> ");
                            chuc = Integer.parseInt(sc.nextLine());
                            break;
                        } catch (Exception e) {
                            System.out.print("Vui long nhap lai!\n");
                        }
                    } while (true);

                    switch (chuc) {
                        case 1:
                            Double luongtrachnhiem = 0.0;
                            do {
                                try {
                                    System.out.print(">> Nhap luong trach nhiem: ");
                                    luongtrachnhiem = Double.parseDouble(sc.nextLine());
                                    break;
                                } catch (Exception e) {
                                    System.out.print("Vui long nhap lai!\n");
                                }
                            } while (true);
                            NhanVien nvtp = new TruongPhong(msnv, name, luong, "Truong Phong", luongtrachnhiem);
                            nhanvien.set(flag, nvtp);
                            break;
                        case 2:
                            Double doanhso = 0.0;
                            do {

                                try {
                                    System.out.print(">> Nhap doanh so tiep thi: ");
                                    doanhso = Double.parseDouble(sc.nextLine());
                                    break;
                                } catch (Exception e) {
                                    System.out.print("Vui long nhap lai!\n");
                                }
                            } while (true);
                            NhanVien nvtt = new TiepThi(msnv, name, luong, "Tiep Thi", doanhso);
                            nhanvien.set(flag, nvtt);
                            break;
                        case 3:
                            NhanVien nvhc = new NhanVien(msnv, name, luong, "Hanh Chinh");
                            nhanvien.set(flag, nvhc);
                            break;
                        default:
                            System.out.println("Khong hop le! Nhap lai");
                            temp++;
                            break;
                    }
                    if (temp == 0) {
                        break;
                    }
                } while (true);

            }
            flag++;
        }
    }

    /* ================== TIM NHAN VIEN THEO KHOANG LUONG ==================== */
    public void TimNVTheoLuong() {
        int temp = 1,temp1=0;
        System.out.print(">> Nhap khoang luong toi thieu: ");
        Double min = Double.parseDouble(sc.nextLine());

        System.out.print(">> Nhap khoang luong toi da: ");
        Double max = Double.parseDouble(sc.nextLine());

        for (NhanVien item : nhanvien) {
            if (item.getLuong() >= min && item.getLuong() <= max) {
                temp1++;
                System.out.println("========== THONG TIN NHAN VIEN THU " + temp + " ==========");
                item.Xuat();
                temp++;
            }
        }
        if(temp1 == 0 ){
            System.out.println(">>> KHONG TIM THAY NHAN VIEN PHU HOP! <<<");
        }
    }

    /* ================== SAP XEP THEO HO VA TEN ==================== */
    public void SapXepTheoHOTEN() {
        Comparator<NhanVien> comp = new Comparator<NhanVien>() {

            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o1.getHoten().compareTo(o2.getHoten());
            }

        };

        Collections.sort(nhanvien, comp);
        int temp = 1;
        for (NhanVien item : nhanvien) {
            System.out.println("========== THONG TIN NHAN VIEN THU " + temp + " ==========");
            item.Xuat();
            temp++;
        }

    }
    /* ================== SAP XEP THEO THU NHAP ==================== */

    public void SapXepTheoTHUNHAP() {
        Comparator<NhanVien> comp = new Comparator<NhanVien>() {

            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o2.getThuNhap().compareTo(o1.getThuNhap());
            }

        };

        Collections.sort(nhanvien, comp);
        int temp = 1;
        for (NhanVien item : nhanvien) {
            System.out.println("========== THONG TIN NHAN VIEN THU " + temp + " ==========");
            item.Xuat();
            temp++;
        }
    }
    /* ================== SAP XEP THEO HO VA TEN ==================== */

    public void ThuNhapCaoNhat() {
        Comparator<NhanVien> comp = new Comparator<NhanVien>() {

            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o2.getThuNhap().compareTo(o1.getThuNhap());
            }

        };
        //
        Collections.sort(nhanvien, comp);
        int temp = 1;
        for (NhanVien item : nhanvien) {
            System.out.println("========== THONG TIN NHAN VIEN THU " + temp + " ==========");
            item.Xuat();
            temp++;
            if (temp == 6) {
                break;
            }
        }
    }

}
