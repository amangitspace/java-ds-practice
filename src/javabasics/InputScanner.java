import java.util.Scanner;
public class InputScanner {
    public static void main(String[] args) {

        System.out.println("Enter Name,Age and Salary :");
        Scanner scan = new Scanner(System.in);
        String Name = scan.nextLine();
        int Age = scan.nextInt();
        float Salary = scan.nextFloat();


        System.out.println("Your name :"+Name);
        System.out.println("Your Age :"+Age);
        System.out.println("Your Salary :"+Salary);


    }
}
