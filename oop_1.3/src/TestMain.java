
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Kiểm tra các hàm tạo và phương thức toString() 
	      // Bạn cần thêm ký tự 'f' hoặc 'F' vào cuối một giá trị float
	      hcn r1 = new hcn(1.2f, 3.4f);
	      System.out.println(r1);   // toString() 
	      hcn r2 = new hcn();   // hàm tạo mặc định
	      System.out.println(r2);

	      // Kiểm thử các phương thức thiết lập và lấy giá trị
	      r1.setDai(5.6f);
	      r1.setRong(7.8f);
	      System.out.println(r1);   // toString()
	      System.out.println("Chiều dài là: " + r1.getDai());
	      System.out.println("Chiều rộng là: " + r1.getRong());

	      // Kiểm tra getArea() và getPerimeter()
	      System.out.printf("Diện tích là: %.2f%n", r1.getArea());
	      System.out.printf("chu vi là: %.2f%n", r1.getPerimeter());
	   
	}

}
