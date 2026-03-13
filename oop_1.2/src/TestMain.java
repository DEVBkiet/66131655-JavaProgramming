
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Kiểm tra các hàm tạo và phương thức toString()
		Circledifferent c1 = new Circledifferent(1.1);
	      System.out.println(c1);    // toString() 
	      Circledifferent c2 = new Circledifferent(); // hàm tạo mặc định
	      System.out.println(c2);

	      // Kiểm thử phương thức thiết lập và lấy giá trị
	      c1.setRadius(2.2);
	      System.out.println(c1);       // toString()
	      System.out.println("bán kính là: " + c1.getRadius());

	      // Kiểm tra getArea() và getCircumference()
	      System.out.printf("Diện tích là: %.2f%n", c1.getArea());
	      System.out.printf("chu vi là: %.2f%n", c1.getCircumference());
	   
	}

}
