package thigk2.BuiHuynhAnhKiet;

public class QLSV {
	private String maSV;
	private String hoTen;
	private int namSinh;
	private double diemTB;
	
	public void SinhVien() {
		
	}

	public void SinhVien(String maSV, String hoTen, int namSinh, double diemTB) {
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.diemTB = diemTB;
	}

	public int tinhTuoi() {
		return 2026 - namSinh;
	}

	@Override
	public String toString() {
		String s = "";
		s = s + "Ma SV: " + maSV;
		s = s + "\nHo ten: " + hoTen;
		s = s + "\nNam sinh: " + namSinh;
		s = s + "\nDiem TB: " + diemTB;
		return s;
	}

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public double getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}
}