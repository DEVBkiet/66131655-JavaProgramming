package thigk2.BuiHuynhAnhKiet;

import java.util.Scanner;
// Nhập chiều cao và cân nặng
// Tính BMI = cân nặng / (chiều cao * chiều cao)
// In ra BMI
// Dùng if-else để phân loại: gầy, bình thường, thừa cân, béo phì
public class tinhBMI {
	public static void main(String[] args) {
        // BMI = cân nặng (kg) / (chiều cao (m) * chiều cao (m))
        Scanner bp = new Scanner(System.in);
        double weight;    // kg
        double height;    // m
        //Hoi nguoi dung ve thong tin chieu cao, can nang
        System.out.println("Moi nhap vao chieu cao: ");
        height = bp.nextDouble();
        System.out.println("Moi nhap vao can nang: ");
        weight = bp.nextDouble();
        
        double bmi = weight / (height * height);
        //Xuất ra mh chỉ số bmi,chiều cao, cân nặng
        
        System.out.println("Cân nặng: " + weight + " kg");
        System.out.println("Chiều cao: " + height + " m");
        System.out.println("Chỉ số BMI: " + bmi);
        
        // Tình trạng cơ thể tương ứng
        if (bmi < 18.5) {
            System.out.println("Phân loại: Thiếu cân");
        } else if (bmi < 25) {
            System.out.println("Phân loại: Bình thường");
        } else if (bmi < 30) {
            System.out.println("Phân loại: Thừa cân");
        } else {
            System.out.println("Phân loại: Béo phì");
        }
    }
}

