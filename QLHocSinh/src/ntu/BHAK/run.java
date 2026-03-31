package ntu.BHAK;
import java.util.ArrayList;
import java.util.Scanner;
public class run {

	public static void main(String[] args) {
		// 2.a: Tạo mới 2 học sinh, hard-code data
		HocSinh hs1 = new HocSinh();
		String tenHS1="Bùi Huỳnh Anh Kiệt";
		hs1.setTenHS(tenHS1);
		short tuoiHS1 = 14;
		hs1.setTuoiHS(tuoiHS1);
		String lopHS1 ="8A-12";
		hs1.setLopHS(lopHS1);
		HocSinh hs2 = new HocSinh("Trần Thị Tưới", (short)12, "6C");
		//In ra màn hình
		System.out.print(hs1.toString());
		System.out.println("\nTên của HS 2 là: "+ hs2.getTenHS() );
		System.out.println("Tuổi của HS 2 là: "+ hs2.getTuoiHS() );
		System.out.println("Lớp của HS 2 là: "+ hs2.getLopHS() );
		//nhập data từ bàn phím
		Scanner banPhim = new Scanner(System.in);
		// Nhập data cho học sinh thứ 3
		HocSinh hs3 = new HocSinh();
		//Hỏi user nhập vào tên
		System.out.printf("Mời nhập tên của học sinh thứ 3: ");//In ra HD và đợi
		String tenHS3 = banPhim.nextLine();
		//>>Gói vào biến hs3
		hs3.setTenHS(tenHS3);
		
		System.out.printf("Mời nhập tên của học sinh thứ 3: ");//In ra HD và đợi
		short tuoiHS3 = banPhim.nextShort();
		//>>Gói vào biến hs3
		hs3.setTuoiHS(tuoiHS3);
		
		System.out.printf("Mời nhập lớp của học sinh thứ 3: ");//In ra HD và đợi
		String LopHS3 = banPhim.nextLine();
		//>>Gói vào biến hs3
		hs3.setLopHS(LopHS3);
		
		//In HS ra mhinh
		System.out.print(hs3.toString());
		
		//Nhập dsach N học sinh
		ArrayList<HocSinh> dsHocSinh = new ArrayList<HocSinh>();
		//Nhập N
		int N=3; //Sinh viên code nhập N từ bàn phím
		
		for(int i=0;i<N;i++) {
			// Nhập data cho học sinh thứ 3
			HocSinh hsi = new HocSinh();
			//Hỏi user nhập vào tên
			System.out.printf("Mời nhập tên của học sinh thứ : "+i);//In ra HD và đợi
			String tenHSi = banPhim.nextLine();
			hsi.setTenHS(tenHSi);
			
			System.out.printf("Mời nhập tên của học sinh thứ : "+i);//In ra HD và đợi
			short tuoiHSi = banPhim.nextShort();
			hsi.setTuoiHS(tuoiHSi);
			
			System.out.printf("Mời nhập lớp của học sinh thứ : "+i);//In ra HD và đợi
			String LopHSi = banPhim.nextLine();
			hsi.setLopHS(LopHSi);
			//Đưa vào DS
			dsHocSinh.add(hsi);
		}
		//In ra
		for(int i=0;i<N;i++) {
			System.out.println(dsHocSinh.get(i).toString());
		}
		
		//Bổ sung thêm
		HocSinh hsThem = new HocSinh();
		//Nhập từ bphim
		//....
		//
		
		//Thêm vào ds
		dsHocSinh.add(hsThem);
		//Xuất ra
		//In ra
		for(int i=0;i<N;i++) {
			System.out.println(dsHocSinh.get(i).toString());
		}
		//5a.
		//Tìm Hs tên hoa
		for(int i=0;i<N;i++) {
			HocSinh hsTim = dsHocSinh.get(i);
			if(hsTim.getTenHS()=="Hoa") {
				dsHocSinh.remove(dsTim);
				break;
			}
		}
		//In ra
				for(int i=0;i<N;i++) {
					System.out.println(dsHocSinh.get(i).toString());
				}
	}

}
