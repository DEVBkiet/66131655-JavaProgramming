package thigk2.BuiHuynhAnhKiet;
//Đọc dữ liệu số nguyên từ file (BufferedReader)
//Lưu các số vào ArrayList
//In danh sách ra màn hình
//Kiểm tra xem số X có tồn tại trong danh sách không (duyệt list)
//In kết quả: có hoặc không
import java.io.*;
import java.util.ArrayList;

public class Cau3_File {

	public static void main(String[] args) throws Exception {
		ArrayList<Integer> ds = new ArrayList<Integer>();
		//Đọc data từ file so.txt
		BufferedReader br = new BufferedReader(new FileReader("so.txt"));
		String line;
		
		while ((line = br.readLine()) != null) {
			int so = Integer.parseInt(line);
			ds.add(so);
		}
		br.close();
		
		System.out.println("Danh sach so:");
		for (Integer x : ds) {
			System.out.print(x + " ");
		}
		//Kiem tra X co la ky tu cuoi cua MSSV 66131655 ko
		int X = 5; 
		
		boolean timThay = false;
		for (Integer x : ds) {
			if (x == X) {
				timThay = true;
				break;
			}
		}
		//In ra ket qua tim kiem
		System.out.println("\n\nKiem tra X = " + X);
		if (timThay) {
			System.out.println("Co ton tai trong danh sach");
		} else {
			System.out.println("Khong ton tai");
		}
	}
}
