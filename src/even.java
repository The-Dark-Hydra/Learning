import java.util.Scanner;
public class even {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        //we will try to see if a number is even or not the logic is n%2==0 then even else odd
        int n;

        System.out.print("Enter the number:");
        n =scan.nextInt();

        // before coming to know about augmented assigment operator my logic was n=n%2
        n%=2;

        if(n==0){
            System.out.println("the given number is EVEN");
        }
        else{
            System.out.println("the given number is ODD");
        }

        scan.close();
    }
}
