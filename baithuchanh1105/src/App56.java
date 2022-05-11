import java.util.HashSet;
import java.util.Scanner;

public class App56 {
    public static  void main(String[] args)  {
        String name;
        HashSet<String> hashSetInteger = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        hashSetInteger.add("Wilson");
        hashSetInteger.add("nike");
        hashSetInteger.add("Volvo");
        hashSetInteger.add("kia");
        hashSetInteger.add("lenovo");
        hashSetInteger.add("lenovo");

        System.out.println("Các phân tử trog hashSetInteger: ");
        System.out.println (hashSetInteger);
        System.out.println("nhập phân tử xóa ");

        name = scanner.nextLine();
        if (!hashSetInteger.contains(name)) {
            hashSetInteger.remove(name);
            System.out.println("xóa ok");
            System.out.println("Các phân tử con lai hashSetInteger:");
            System.out.println("hashSeti");
        } else { 
            System.out.println("xóa no ok");
        }
        }
        
    }
        
    
}