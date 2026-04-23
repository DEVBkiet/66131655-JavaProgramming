package thigk2.BuiHuynhAnhKiet;
//Tạo lớp SinhVien gồm: maSV, hoTen, namSinh, diemTB + constructor + getter/setter
//Trong main: dùng ArrayList lưu danh sách sinh viên
//Hard-code sẵn 3 sinh viên, in danh sách
//Nhập thêm 1 sinh viên từ bàn phím, thêm vào list
//In lại danh sách sau khi thêm
//Duyệt list, in các sinh viên có tuổi > 20 (tính theo năm hiện tại 2026-năm sinh)

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		ArrayList<QLSV> ds = new ArrayList<QLSV>();
		
		QLSV sv1 = new QLSV();
		sv1.setMaSV("SV01");
		sv1.setHoTen("Bui Huynh Anh Kiet");
		sv1.setNamSinh(2006);
		sv1.setDiemTB(10.0);
		
		QLSV sv2 = new QLSV();
		sv2.setMaSV("SV02");
		sv2.setHoTen("Tran Thuy Ngoc Tuyen");
		sv2.setNamSinh(2005);
		sv2.setDiemTB(8.5);
		QLSV sv3 = new QLSV();
		sv3.setMaSV("SV03");
		sv3.setHoTen("Nguyen Van A");
		sv3.setNamSinh(2007);
		sv3.setDiemTB(2.5);
		
		ds.add(sv1);
		ds.add(sv2);
		ds.add(sv3);
		
		System.out.println("Danh sach ban dau:");
		for (QLSV sv : ds) {
			System.out.println(sv);
			System.out.println("-----");
		}
	Scanner sc = new Scanner(System.in);
	
	QLSV svMoi = new QLSV();
	
	System.out.print("Nhap ma SV: ");
	svMoi.setMaSV(sc.nextLine());
	
	System.out.print("Nhap ho ten: ");
	svMoi.setHoTen(sc.nextLine());
	
	System.out.print("Nhap nam sinh: ");
	svMoi.setNamSinh(sc.nextInt());
	
	System.out.print("Nhap diem TB: ");
	svMoi.setDiemTB(sc.nextDouble());
	
	ds.add(svMoi);
	
	System.out.println("\nDanh sach sau khi them:");
	for (QLSV sv : ds) {
		System.out.println(sv);
		System.out.println("-----");
	}
	
	System.out.println("\nSinh vien lon hon 20 tuoi:");
	for (QLSV sv : ds) {
		if (sv.tinhTuoi() > 20) {
			System.out.println(sv);
			System.out.println("-----");
		}
	}
}
}