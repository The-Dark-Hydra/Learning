import java.util.Scanner;

public class swtch {
    public static void main(String[]args){


        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int cs = scan.nextInt();

        switch(cs){

            case 1 :
                System.out.println("You've selected one");
                break;

            case 2 :
                System.out.println("You've selected two");
                break;

            case 3:
                System.out.println("You've selected three");
                break;

            default:
                System.out.println("wrong input");
        }

        scan.close();
    }

}
