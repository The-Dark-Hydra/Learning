import java.util.Scanner;

public class dowhyle {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        int i =0;

        System.out.print("Enter an input: ");
        int n = scan.nextInt();

        do{
            System.out.println("Kalyan is randa");
            i++;

        }while(i<n);
    //so i understood that for logic statements updating  it should be kept inside do condition and not in or outside of while
    scan.close();

    }
}
