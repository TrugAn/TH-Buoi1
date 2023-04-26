package lab1;

public class QuanLy extends lab1 {
	ArrayList<lab1> danhSach = new ArrayList<lab1>();
	
	public QuanLy() {
}
public QuanLy (ArrayList<lab1> danhSach){
	super();
	this.danhSach = danhSach;
}
public void themDanhSachXe (lab1 lab1) {
	danhSach.add(lab1);
}
public void inDanhSach() {
	for (lab1 lab1: danhSach) {
		System.out.println("lab1");
	}
	}
}