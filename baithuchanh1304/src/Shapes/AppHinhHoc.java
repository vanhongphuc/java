package Shapes;


public class AppHinhHoc {
    public final float PI =3.14f; 
    public String ten;
    public float ChuVi;
    public float DienTich;
    public float TheTich;

    public void xuatTen(){
        System.out.println("\n\n======= "+ ten + " ======= ");
    }    
    public void inChuVi(){
        System.out.println("Chu Vi: " + ChuVi  );
    }
    public void inDienTich(){
        System.out.println("Dien Tich: "+DienTich);
    }
    public void inTheTich(){
        System.out.println("The Tich: "+TheTich);
    }
    public static int dem = 0;
    public AppHinhHoc(){
        dem++;
    }
}