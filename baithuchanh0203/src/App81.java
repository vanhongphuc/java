import java.util.Scanner;
public class App81 {
    public static void main(String[]args) throws Exception{
        //khai bao dong vc static void main(String[] args) throws Exception {a cot cua matran
        int m, n;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Nhap so dong:"); m =sc.nextInt();
        System.out.println("Nhap so cot: "); n =sc.nextInt();
        //khai bao ma tran MANH co m dong n cot
        int MANH[][] = new int [m][n];
        System.out.println("Nhap cac ptu cua ma tran:");
        for(int  i= 0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print("MANH[ " + i + " ] [ " + j + " ] = ");
                MANH[i][j] = sc.nextInt();
            }
        }
        //tim phan tu lon nhat
        int max = MANH[0][0];
for (int i = 0; i < m; i++) {
    for (int j = 0; j < n; j++) {
       if (max < MANH[i][j]){
           max = MANH[i][j];
         } 
    }     
}
 System.out.println("Phan tu lon nhat trong ma tran:  = " + max);
 sc.close();
    }
}

