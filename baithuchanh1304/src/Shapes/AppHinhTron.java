package Shapes;
import java.util.Scanner;
public class AppHinhTron extends AppHinhHoc{
    public float bankinh;
    // hàm tạo
    public AppHinhTron(){
        super();
        ten = " Hình Tròn";
    }
    public void nhapBanKinh(){
        System.out.println("Bán Kính: ");
        Scanner scanner =new Scanner(System.in);
        bankinh = scanner.nextFloat();
    }
    public void tinhChuVi(){
        ChuVi= 2*PI*bankinh;
    }
    public void tinhDienTich(){
        DienTich= PI*bankinh*bankinh;
    }
    public void xuatthongtin(){
        System.out.println("Đây là hình tròn");
    }

 
}