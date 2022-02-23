import java.util.Scanner;

public class App2 {
   public static void main(String[] args)
   {
      float a, b, c;
      System.out.println("Nhập vào 3 số:");
      Scanner sc = new Scanner(System.in);

      a = sc.nextFloat();
      b = sc.nextFloat();
      c = sc.nextFloat();

      if ((a + b > c) || (a + c > b) || (b + c > a)) {
        System.out.println("Đây là tam giác !");
    }
    if ((a == b) || (b == c) || (c == a)) {
        System.out.println("Đây là tam giác cân !");
    } else if ((a == b) && (b == c) && (c == a)) {
        System.out.println("Đây là tam giác đều !");
    } else if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == b * b + a * a)) {
        System.out.println("Đây là tam giác vuông !");
    } else {
        System.out.println("Đây không phải tam giác");
    }
}
}