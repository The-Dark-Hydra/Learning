import java.util.Scanner;

public class mmm {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        System.out.print("enter a name:");
        String name = scan.nextLine();

        System.out.print("what is your gender(M/F):");
        String gen = scan.nextLine();

        System.out.print("what is " +name+ " age?:");
        int age = scan.nextInt();

        System.out.print("what is "+name+" CGPA?:");
        double gpa = scan.nextDouble();

//        System.out.println("what is "+name+" grade?:");
//        char grade = scan.nextShort();

        System.out.print("is "+name+" handsome(true/fasle):");
        boolean handsome = scan.nextBoolean();

        System.out.println("Hello "+name);
        System.out.println("you are a "+gen);
        System.out.println(name+" age is "+age);
        System.out.println(name+" CGPA is "+gpa);
//        System.out.println(name+" garde is "+grade);

        if( handsome == true){
            System.out.println(name+" is handsome");
        }
        else{
            System.out.println(name+" is ugly");
        }
        scan.close();


    }
}
