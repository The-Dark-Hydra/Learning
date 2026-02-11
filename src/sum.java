import java.util.Scanner;

public class sum {

    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the numbers you want to add: ");
        int n = scan.nextInt();
        int mkl = 0;

        for(int i = 0 ; i<n+1 ; i++){

            mkl = mkl + i;
        }
        System.out.print(mkl);




    }
}
