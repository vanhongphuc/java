import java.util.Scanner;
public class AppBai9 {
    public static void main(String[] args) {
        String chuoi;
        int soKyTuInHoa = 0, soKyTuInThuong = 0, soChuSo = 0;
        Scanner sc = new Scanner(System.in);
    
            System.out.println("Nhap vao 1 chuoi bat ki: ");
            chuoi = sc.nextLine();
        for (int i = 0; i < chuoi.length(); i++) {
            if (Character.isUpperCase(chuoi.charAt(i))) {
                soKyTuInHoa++;
            } 
            if (Character.isLowerCase(chuoi.charAt(i))) {
                soKyTuInThuong++;
            } 
            if (Character.isDigit(chuoi.charAt(i))) {
                soChuSo++;
            }
        }
        System.out.println("Trong chuoi " + chuoi + " co " + soKyTuInHoa + " ky tu in hoa," + " co " + soKyTuInThuong + " ky tu in thuong" + " va co " + soChuSo + " so.");
        sc.close();
    }
}