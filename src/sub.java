import java.util.Scanner;

public class sub {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number you want tables for: ");
        int n = scan.nextInt();

        for(int i =0 ; i <=10 ; i++){

            int tab = n*i;

            System.out.println(n+"*"+i+"="+tab);

        }
        scan.close();
    }
}
