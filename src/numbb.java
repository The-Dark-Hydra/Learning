import java.util.Scanner;

public class numbb {
    public static void main(String[]args){

        int i = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a no: ");
        int n = scan.nextInt();

        while(i<n){
            System.out.println("test_test");
            i++;
        }
        scan.close();
    }
}
