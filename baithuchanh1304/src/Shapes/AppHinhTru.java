package Shapes;
import java.util.Scanner;
public class AppHinhTru extends AppHinhTron{
    public float chieucao;
    //Hàm tạo
    public AppHinhTru() {
        ten = "Hinh Trụ";
    }
    public void nhapChieuCao(){
        nhapBanKinh();
        System.out.println("Chiều Cao: ");
        Scanner scanner = new Scanner(System.in);
        chieucao = scanner.nextFloat();
}
public void tinhTheTich(){
    tinhDienTich();
    System.out.println("Thể Tích: "  + DienTich*chieucao);
}
  @Override
  public void xuatthongtin(){
      System.out.println("Đây là hình Trụ");
  }
}