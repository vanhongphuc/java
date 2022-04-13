package Shapes;
import java.util.Scanner;
public class AppHinhVuong extends AppHinhChuNhat {
    //hàm tạo
    public AppHinhVuong(){
        ten ="Hình Vuông";
    }
    public void nhapCanh(){
        System.out.println("Cạnh: ");
        Scanner scanner = new Scanner(System.in);
        dai= rong = scanner.nextFloat();
    }
}