
public class Circledifferent {
	//khai báo
	
		private double bk;
		private String color;
		
		//hàm tạo 1 (mặc định)
		
		public Circledifferent() {
			bk = 1.0;
		}
		
		//hàm tạo 2
		
		public Circledifferent(double r) {
			bk = r;
		}
		
		//trả về bán kính
		
		public double getRadius() {
			return bk;
		}
		
		//thiết lập bán kính new
		
		public void setRadius (double newRadius) {
			bk = newRadius;
		}

		//trả về diện tích của đtuong Circle 
		
		public double getArea() {
			return bk * bk * Math.PI;
		}
		
		//chu vi
		
		public double getCircumference() {
			return bk * 2 * Math.PI;
		}
		
		//toString
		
		public String toString() {
		String s =  "Circle [bán kính = " + bk + "]";
		return s;
		}
		
}
