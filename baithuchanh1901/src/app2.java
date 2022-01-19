import java.util.Scanner;

public class app2 {
    public static void main(String[] args) {
        double a1,b1,c1,a2,b2,c2;

    Scanner m = new Scanner(System.in);
    System.out.print("Nhap he so a1 : ");
    a1 = m.nextDouble();
    System.out.print("Nhap he so b1 : ");
    b1 = m.nextDouble();
    System.out.print("Nhap he so c1 : ");
    c1 = m.nextDouble();
    System.out.print("Nhap he so a2 : ");
    a2 = m.nextDouble();
    System.out.print("Nhap he so b2 ; ");
    b2 = m.nextDouble();
    System.out.print("Nhap he so c2 : ");
    c2 = m.nextDouble();

    double dd= a1*b2 - b1*a2;
    double dx= c1*b2 - b1*c2; 
    double dy= a1*c2 - a2*c1;

    if(dd==0)
      if(dx==0 && dy==0)
      {
        System.out.println("He vo so nghiem !!!");
      }
      else System.out.println("He vo nghiem !!!");
    else
      System.out.println("He co nghiem duy nhat" + " x=" + (dx/dd) + " va y= " +(dy/dd));
    }
}