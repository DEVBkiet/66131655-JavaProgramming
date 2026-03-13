
public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// tao moi doi tuong
		ChuNhat cn1 = new ChuNhat();
		//tao doi tuong cn1, dai=10, rong =5
		ChuNhat cn2 = new ChuNhat(20,15);
		ChuNhat hv = new ChuNhat(20,20);
		//lay dl/thuoc tinh cn1 in ra
		double cn1_dai = cn1.getDai();
		double cn1_rong = cn1.getRong();
		System.out.print("Hinh CN1 co chieu dai la: ");
		System.out.print(cn1_dai);
		System.out.print("\nHinh CN1 co chieu rong la: " + cn1_rong);
		
		//thay doi chieu dai hcn1
		cn1.setDai(50);
		System.out.print("\nSau khi thay doi chieu dai\n");
		cn1_dai = cn1.getDai();
		cn1_rong = cn1.getRong();
		System.out.print("Hinh CN1 co chieu dai la: ");
		System.out.print(cn1_dai);
		System.out.println("\nHinh CN1 co chieu rong la: " + cn1_rong);
		
		//in ra su dung toString
		System.out.print(cn1.toString() );
		

	}
}