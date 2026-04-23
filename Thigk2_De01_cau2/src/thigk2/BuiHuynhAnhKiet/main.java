package thigk2.BuiHuynhAnhKiet;


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
	}
}