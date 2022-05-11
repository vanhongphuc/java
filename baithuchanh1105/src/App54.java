import java.util.HashSet;
import java.util.Scanner;

public class App54 {
    public static  void main(String[] args) throws Exception {
        int number;
        HashSet<Integer> hashSetInteger = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        hashSetInteger.add(0);
        hashSetInteger.add(3);
        hashSetInteger.add(1);
        hashSetInteger.add(4);
        hashSetInteger.add(2);
        hashSetInteger.add(8);

        System.out.println("Các phân tử trog hashSetInteger: ");
        System.out.println (hashSetInteger);
        System.out.println("Elements in hashSetInteger: ");

        if (!hashSetInteger.contains(number)) {
            hashSetInteger.add(number);
            System.out.println("Added successfully!");
            System.out.println("Các phân tử trog hashSetInteger sau khi thêm!");
            System.out.println("hashSeti");
        
        }    else {
            System.out.println("Element * + number + * already exists!");
        }
    }
        
    }
      
}