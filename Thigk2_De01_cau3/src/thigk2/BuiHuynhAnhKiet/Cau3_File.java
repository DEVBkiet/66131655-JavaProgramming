package thigk2.BuiHuynhAnhKiet;

import java.io.*;
import java.util.ArrayList;

public class Cau3_File {

	public static void main(String[] args) throws Exception {
		ArrayList<Integer> ds = new ArrayList<Integer>();
		
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
		
	}
}
