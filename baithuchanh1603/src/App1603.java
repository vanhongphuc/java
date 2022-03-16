package main;
import java.util.Scanner;

import VD.GiaiPhuongTrinhBac2;
import VD.Person;
import VD.SinhVien;
public class App1603 {
  public static void  main(String args[]){
    Person ps = new Person();
    SinhVien sv = new SinhVien();
    GiaiPhuongTrinhBac2 ptb2 = new GiaiPhuongTrinhBac2();
    ps.NhapThongTin();
    ps.InThongTin();
    System.out.println();
    sv.NhapThongTin();
    sv.InThongTin();
    System.out.println();
    ptb2.NhapCacHeSo();
    ptb2.GiaiPhuongTrinh();
  }
}