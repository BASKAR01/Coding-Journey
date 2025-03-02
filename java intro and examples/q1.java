/*
 * Get input for variable:Name and Age. print it
 */
import java.util.Scanner;
class q1{
    public static void main(String[]args)
    {
        Scanner scan =new Scanner(System.in);
        String Name=scan.nextLine();
        int age= scan.nextInt();
        System.out.println("My name is "+Name);
        System.out.println("My Age is "+age);
    }
}