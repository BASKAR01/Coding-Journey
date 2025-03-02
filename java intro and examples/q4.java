/*
 * Get Input for 3 variables: Name,Score,Department. Let the user enter the score for 100 Marks, you convert it for 10 and print it.
 */
import java.util.Scanner;
class q4
{
    public static void main(String[] args)
     {
        Scanner scan = new Scanner(System.in);
        String Name =scan.nextLine();
        double Score = scan.nextDouble();
        scan.nextLine();
        String Department =scan.nextLine();
        System.out.println("My Name is "+Name);
        System.out.println("My Score is "+Score/10+"/10");
        System.out.println("My Department is "+Department);


    }
}