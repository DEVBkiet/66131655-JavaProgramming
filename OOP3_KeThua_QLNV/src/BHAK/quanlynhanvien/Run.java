package BHAK.quanlynhanvien;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test lớp nhân viên
		NhanVien nv1 = new NhanVien ("001", "Nguyễn Ngọc Xuân Ánh", 5000000);
		nv1.hienThiThongTin();
		System.out.println (nv1.toString());
		
		NhanVienVanPhong nvVanPhong1 = new NhanVienVanPhong ("002", "Xuân Ánh đẹp gái nò", 5000000, 3, 200000);
		System.out.println (nvVanPhong1.toString());
//		nvVanPhong1.hienThiThongTin();
	}

}
