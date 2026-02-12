import java.util.Scanner;

public class arrayoh {
    public static void main(String[] args) {

        //to initialise an array we put [] before any data type of our choice
        //the scanner fn takes inputs using the same syntax as the normal data type


        int[] a = new int[5];
        //this is used to declare the size of an array
        int i;
        int j;
        int len = a.length;
        //this is used to get the length of the array
        Scanner scan = new Scanner(System.in);


        for (i = 0; i < len; i++) {
            System.out.print("enter the " + i + " element of array: ");

            a[i] = scan.nextInt();
            //here we can use i to traverse through the array
        }

        for (j = len - 1; j < len + 1; --j) {
            System.out.println(a[j]);

        }

        for (i = 0; i < len; i++) {
            System.out.println("the entered elemts are: " + a[i]);
        }
        scan.close();
    }
}
