import java.util.Scanner;
public class App5
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so nguyen= ");
        int n = scanner.nextInt();

        int check = find_perfect_num(n);
     
        if( check == 1 ) System.out.println(n + " la so hoan thien" ) ;
        else System.out.println(n+ " khong phai la so hoan thien" ) ;
    }
    private static int find_perfect_num(int n){
        

        int flag = 0, total=0;
        
           
        for (int i=1;i<n; i++){
             if (n % i == 0) total+=i;
        }
       
        if (total == n & n!=0) flag = 1;

        return flag;
    }
 
}