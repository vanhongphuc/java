import Shapes.HinhTron;

public class App71 {
    public static void main(String[]agrs){
        
        HinhTron hinhTron = new HinhTron();
        
        hinhTron.setBanKinh(10);
        
        float ChuVi = hinhTron.tinhChuVi();
        float DienTich =hinhTron.tinhDienTich();
        System.out.println("Chu vi hinh tron:" + ChuVi +"Va Dien tich"+DienTich);
    }
    
}