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
            // now that ive able to understand how to use j index from back i have to understand how to break the code hits negative numbs
            if(j==0){
                break;
            }
            //so we can simply use if to check if j is 0 then break the loop i was trying to do this but somehow it didnt work then i tried while
           // which ofc wouldnt work
        }

        for (i = 0; i < len; i++) {
            System.out.println("the entered elemts are: " + a[i]);
        }
        scan.close();
    }
}
