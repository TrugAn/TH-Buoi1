package bai2;

public class Sinhvien extends class LopHocPhan{
	private String maSV;
	private String hoTen;

	public Sinhvien() {
		
	}
	public Sinhvien (String maSV, String hoTen) {
		this.maSV = maSV;
		this.hoTen = hoTen;
	}
	public void setmaSV (String maSV) {
		this.maSV = maSV;
	}
	public void sethoTen (String hoTen) {
		this.hoTen = hoTen;
	}
	public String getmaSV () {
		return maSV;
	}
	public String gethoTen () {
		return hoTen;
	}
	public void Nhap() {
		Scanner ta = new Scanner (System.in);
		System.out.println("Nhập Mã Sinh vien: ");
		maSV = ta.nextline();
		System.out.println("Nhập Họ và Tên: ");
		hoTen = ta.nextline();
	}
	public void Xuat () {
		System.out.println("Mã Sinh viên: + getmaSV");
		System.out.println("Họ và Tên: + gethoTen");
	}
	@Override
	public String toString() {
		return "SinhVien [MaSv=" + maSV + ", Hoten=" + hoTen + "]";
	}
	

}
