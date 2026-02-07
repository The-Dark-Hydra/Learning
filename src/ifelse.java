import java.util.Scanner;
public class ifelse {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        int age;

        System.out.print("Enter your age: ");
        age=scan.nextInt();

        if(age>=65){
            System.out.println("jahnavi is a hag");
        }
        else if(age==0){
            System.out.println("jahnavi is just born");
        }
        else if(age<0){
            System.out.println("jahnavi is not born yet");
        }
        else if(age<18){
            System.out.println("jahnavi is child");
        }
        else{
            System.out.println("jahnavi is a Adult");
        }

        System.out.println();

        scan.close();
    }
}
