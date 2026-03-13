
public class hcn {
	
	//khai báo
	
	private float dai;
	private float rong;
		
	public hcn() {
		dai = 1.0f;
		rong = 1.0f;
	}
	
	public hcn(float dai, float rong) {
		this.dai = dai;
		this.rong = rong;
	}
	
	float getDai (){
		return dai;
	}
	
	void setDai (float daiM) {
		dai = daiM;
	}
	
	float getRong () {
		return rong;
	}
	
	void setRong (float rongM) {
		rong = rongM;
	}
	
	double getArea () {
		return dai * rong;
	}
	
	double getPerimeter () {
		return (dai + rong) * 2;
	}
	 
	//toString
	
	public String toString () {
		String s = "Hình chữ nhật[chiều dài = " + dai + ", chiều rộng = " + rong + "]";
		return s;
	}
	
}
