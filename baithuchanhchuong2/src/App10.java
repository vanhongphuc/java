import java.util.Scanner;
public class AppBai10 {
    public static void main(String[] args) {
        String chuoi;
        char kyTu;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap vao mot chuoi bat ki: ");
            chuoi = sc.nextLine();
        } while (chuoi.length() > 80);

        System.out.println("Nhap vao ki tu can dem so lan xuat hien: ");
        kyTu = sc.next().charAt(0);
        for (int i = 0; i < chuoi.length(); i++) {
            if (kyTu == chuoi.charAt(i)) {
                count++;
            }
        } 
        System.out.println("So lan xuat hien cua ki tu " + kyTu + " trong chuoi " + chuoi + " = " + count);
        sc.close();
    }
}