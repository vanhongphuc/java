package Shapes;
import java.util.Scanner;
public class AppHinhChuNhat extends AppHinhHoc{
    public float dai;
    public float rong;
    public AppHinhChuNhat(){
        super();
    }

public void nhapChieuDai(){
    System.out.println("Nhập Chiều Dài:");
    Scanner scanner = new Scanner(System.in);
    dai = scanner.nextFloat();
}
public void nhapChieuRong(){
    System.out.println("Nhập Chiều Rong:");
    Scanner scanner = new Scanner(System.in);
    rong = scanner.nextFloat();
}
public void tinhChuVi(){
    ChuVi = 2*(dai* rong);
}
public void tinhDienTich(){
    DienTich = dai * rong;
}
}