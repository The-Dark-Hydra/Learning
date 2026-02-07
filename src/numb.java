import java.util.Scanner;

public class numb {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the numbers you wanna print: ");
        int n = scan.nextInt();

        for(int i=0;i<n+1;i++){
            System.out.println(i);
        }
    }
}
