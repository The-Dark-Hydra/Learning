import java.util.Scanner;

public class shop {

    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        String food;
        double price;
        int quantity;


        System.out.print("enter the item you want to purchase: ");
         food = scan.nextLine();

        System.out.print("enter the price you want to purchase for: ");
        price = scan.nextDouble();

        System.out.print("enter the quantity you want to purchase: ");
        quantity = scan.nextInt();

        price*=quantity;

        System.out.println("the food item you want to purchase is: "+food);
        System.out.println("the total price is: "+price);

        scan.close();
    }

}
