package bai2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<LopHocPhan> dsLopHocPhan = new ArrayList<>();


        // Hiển thị menu
        while (true) {
            System.out.println("Chọn chức năng:");
            System.out.println("1. Nhập thông tin");
            System.out.println("2. Xuất thông tin");
            System.out.println("0. Thoát");

            // Nhập lựa chọn
            int choice = sc.nextInt();

           
            switch (choice) {
            case 1:          
                System.out.println("Nhap thong tin lop hoc phan:");
                System.out.print("Tong so sinh vien: ");
                int tongSoSV = sc.nextInt();
                sc.nextLine();
                System.out.print("Ma LHP: ");
                String maLHP = sc.nextLine();
                System.out.print("Ten LHP: ");
                String tenLHP = sc.nextLine();
                System.out.print("Ten giang vien: ");
                String tenGV = sc.nextLine();
                System.out.print("Thong tin buoi hoc: ");
                String thongTinLopHoc = sc.nextLine();            
                // Nhập danh sách sinh viên
             // Nhập danh sách sinh viên
                SinhVien[] dsSV = new SinhVien[tongSoSV];
                for (int i = 0; i < tongSoSV; i++) {
                    System.out.println("Nhap tong tin sinh vien thu " + (i+1) + ":");
                    System.out.print("Ma sinh vien: ");
                    String maSV = sc.nextLine();
                    System.out.print("Ho ten sinh vien: ");
                    String hoTenSV = sc.nextLine();
                    dsSV[i] = new SinhVien(maSV, hoTenSV);
                }

                // Tạo đối tượng lớp học phần và thêm vào danh sách lớp học phần
                LopHocPhan lopHocPhan = new LopHocPhan();
                lopHocPhan.setDsSinhVien(dsSV);
                lopHocPhan.setMaLHP(maLHP);
                lopHocPhan.setTenLHP(tenLHP);
                lopHocPhan.setTenGV(tenGV);
                lopHocPhan.setThongTinLopHoc(thongTinLopHoc);
                dsLopHocPhan.add(lopHocPhan);

                System.out.println("Da them thong tin lop hoc phan vao danh sach.");

                break;

            case 2:
                	System.out.println("Danh sach lop hoc phan:");
                	for (LopHocPhan lhp : dsLopHocPhan) {
                	    System.out.print(lhp);
                	    System.out.println();
                	}
                    break;
                case 0:
                    System.out.println("Chương trình đã thoát");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
            }
        }
    }
}
