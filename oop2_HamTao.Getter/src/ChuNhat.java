
public class ChuNhat {
	//khai báo
	private double dai;
	private double rong;
	
	public ChuNhat() {
		dai = 10;
		rong = 5;
	}
	
	public ChuNhat(double dai, double rong) {
		this.dai = dai;
		this.rong = rong;
	}
//	public ChuNhat (double daiM, double rongM) {
//	dai = daiM; 
//	rong = roongM;
//  }
	 
	double getDai (){
		return dai;
	}
	
	double getRong () {
		return rong;
	}
	
	void setDai (double daiM) {
		dai = daiM;
	}
	
	void setRong (double rongM) {
		rong = rongM;
	}
	//cac phuong thuc khac
	public String toString() {
		//tom tat thong tin cua doi tuong -> 1 chuoi
		String s = "Hinh nay, co chieu dai = ";
		s = s+dai;
		s = s + " va chieu rong = " + rong;
		return s;
	}
}
