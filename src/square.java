import java.util.Scanner;
public class square {
    public static void main(String[]args){

        double side = 0;
        double area = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("enter the length of the side of the square:");
        side = scan.nextDouble();

        area=side*side;

        System.out.print("The area of the square is: "+area+"cm");

        scan.close();

    }
}
