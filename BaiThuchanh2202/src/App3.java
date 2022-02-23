import java.util.Scanner;
public class App3
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so nguyen= ");
        int n = scanner.nextInt();

        int check = isprime(n);
     
        if( check == 1 ) System.out.println((int)n + " la so nguyen to" ) ;
        else System.out.println(n+ " khong phai la so nguyen to" ) ;
    }
    private static int isprime(int n){
      
        int flag = 1;

        if (n <2) return flag = 0; 
        
       
        int i = 2;
        while(i <n){
            if( n%i==0 ) {
                flag = 0;
                break; 
            }
            i++;
        }

        return flag;
    }

}
