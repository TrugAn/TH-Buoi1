package lab1;

public class Xe {
	public String Tenchuxe;
	public String Loaixe;
	public double Dungtich;
	public float Thuephainop;
	public float Trigia;

	public Xe() {
	}

	public Xe(String Tenchuxe, String Loaixe, double Dungtich, float Thuephainop, float Trigia) {
		this.Tenchuxe = Tenchuxe;
		this.Loaixe = Loaixe;
		this.Dungtich = Dungtich;
		this.Thuephainop = Thuephainop;
		this.Trigia = Trigia;
	}

	public void setTenchuxe(String Tenchuxe) {
		this.Tenchuxe = Tenchuxe;
	}

	public void setLoaixe(String Loaixe) {
		this.Loaixe = Loaixe;
	}

	public void setDungtich(double Dungtich) {
		this.Dungtich = Dungtich;
	}

	public void setThuephainop(float Thuephainop) {
		this.Thuephainop = Thuephainop;
	}

	public void setTrigia(float Trigia) {
		this.Trigia = Trigia;
	}

	public String getTenchuxe() {
		return Tenchuxe;
	}

	public String getLoaixe() {
		return Loaixe;
	}
	public double getDungtich() {

		if (Dungtich < 100) {
			return Thuephainop = Thuephainop * 0.01;
		} else {
			if (Dungtich > 200) {
				return Thuephainop = Thuephainop * 0.05;
			} else {
				if (Dungtich >= 100 && Dungtich <= 200) {
					return Thuephainop = Thuephainop * 0.03;
				}
			}
		}
	}

	public float getThuephainop() {
		return Thuephainop;
	}

	public float getTrigia() {
		return Trigia;
	}
	public void Nhap() {
		Scanner sc= new Scanner (System.in);
		System.out.println("Nhập vào tên chủ xe: ");
		Tenchuxe = sc.nextline();
		System.out.println("Nhập loại xe: ");
		Loaixe = sc.nextline();
		System.out.println("Nhập Dung tích: ");
		Dungtich = sc.nextline();
		System.out.println("Nhập Trị giá: ");
		Trigia = sc.nextline();
		System.out.println("Nhập Thuế phài nộp: ");
		Thuephainop = sc.nextline();
	}

	public void Xuat() {
		System.out.println("Tên chủ xe:  + getTenchuxe()");
		System.out.println("Loại xe:  + getLoaixe()");
		System.out.println("Dung tích:  + getDungtich()");
		System.out.println("Trị giá:  + getTrigia()");
		System.out.println("Thuế phải nộp:  + getThuephainop()");
	}

}
