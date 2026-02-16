
public class tinhluong {

	public static void main(String[] args) {
		
		//khai báo số giờ làm 150h, lương 17 000/h
		
		int time = 150;
		int money = 17000;
		double total = 0;
		
		//tính lương
		
		if (time<40)
			total = (double) time * money;
		else 
			total = (double) money * 40 + money * (time - 40) * 1.5;
		
		//in lương
		
		System.out.println ("- Tổng lương của ban la: " + total);

	}

}
