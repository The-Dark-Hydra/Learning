import java.util.Scanner;
public class madlibs {
    public static void main(String[]args){
        // in this i will create a game called mad libs
        Scanner scan=new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter an Adjective:");
        adjective1 = scan.nextLine();
        System.out.print("Enter a Noun:");
        noun1=scan.nextLine();
        System.out.print("Enter an Adjective:");
        adjective2=scan.nextLine();
        System.out.print("Enter a Verb:");
        verb1=scan.nextLine();
        System.out.print("Enter an Adjective:");
        adjective3 = scan.nextLine();

        System.out.println("Today i went to a "+adjective1+" restaurant");
        System.out.println("and i met with "+noun1);
        System.out.println("and together we ate "+adjective2+" food");
        System.out.println("then we "+verb1+" for sometime");
        System.out.println("the day was "+adjective3);

        scan.close();
    }
}
