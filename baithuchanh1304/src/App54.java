import Shapes.AppHinhChuNhat;
import Shapes.AppHinhTron;
import Shapes.AppHinhTru;
import Shapes.AppHinhVuong;
public class App54 {
    public static void main(String[] args){
        
        AppHinhTron hinhTron = new AppHinhTron();
        hinhTron.xuatTen();
        hinhTron.nhapBanKinh();
        hinhTron.tinhChuVi();
        hinhTron.tinhDienTich();
  
        AppHinhTru hinhTru = new AppHinhTru();
        hinhTru.xuatTen();
        hinhTru.nhapChieuCao();
        hinhTru.tinhTheTich();
        
        AppHinhChuNhat hinhChuNhat = new AppHinhChuNhat();
        hinhChuNhat.xuatTen();
        hinhChuNhat.nhapChieuDai();
        hinhChuNhat.nhapChieuRong();
        hinhChuNhat.tinhChuVi();
        hinhChuNhat.tinhDienTich();
        hinhChuNhat.inChuVi();
        hinhChuNhat.inDienTich();
     
        AppHinhVuong hinhVuong = new AppHinhVuong();
        hinhVuong.xuatTen();
        hinhVuong.nhapCanh();
        hinhVuong.tinhChuVi();
        hinhVuong.tinhDienTich();
        hinhVuong.inChuVi();
        hinhVuong.inDienTich();
    }