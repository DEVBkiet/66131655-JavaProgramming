
public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//tạo 1 đối tượng circle tên c1
		
		Circle c1 = new Circle ();
		
		//gọi các phương thức công khai trên thể hiện c1
		
		System.out.println("Hình tròn 1 có bán kính là: "
		+ c1.getRadius() + " và diện tích của " + c1.getArea());
	
	    // Khai báo một thể hiện của lớp circle có tên là c2.
	    // Khởi tạo thể hiện c2 bằng cách gọi hàm tạo thứ hai
	    // với bán kính và màu sắc mặc định đã cho.
	
		Circle c2 = new Circle(2.0);
		
		// Gọi các phương thức công khai trên thể hiện c2, thông qua toán tử dấu chấm.
	   
		System.out.println("Hình tròn 2 có bán kính là: "
	    + c2.getRadius() + " và diện tích của " + c2.getArea());
	
		Circle c3 = new Circle();
		System.out.println("Hình tròn 3 có màu sắc là: " + c3.getColor());
	
		Circle c4 = new Circle();
		c4.setRadius(5.5);
		System.out.println("Hình tròn 4 có bán kính là: " + c4.getRadius());
		c4.setColor("xanh lá cây"); 
		System.out.println("Hình tròn 4 có màu sắc là: " + c4.getColor());
	
		//gọi tường minh
		
		Circle c5 = new Circle(5.5);
		System.out.println(c5.toString());
	
		//gọi ngầm định
		
		Circle c6 = new Circle(6.6);
		System.out.println(c6);              // println() gọi toString() ngầm định, giống như trên 
		System.out.println("Toán tử '+' cũng gọi toString(): " + c6);   // '+' cũng gọi toString()
	}

}
