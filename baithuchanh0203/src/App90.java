import java.util.Scanner;

public class App90 {
    public static void main(String[] args) throws Exception{
        String chuoi;
        char kytu;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap 1 chuoi bat ky:");
        chuoi = sc.nextLine();
        System.out.println("cac ky tu trong chuoi la: ");
        for(int i = 0; i< chuoi.length(); i++){
            kytu = chuoi.charAt(i);
            System.out.println(kytu);

        }
    }
}