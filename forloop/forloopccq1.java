/*
 * get input for variable a and b and print the number from a to b
 * input 5,10
 * output 5,6,7,8,9,10
 */
import java.util.Scanner;
 class forloopccq1
{
    public static void main(String[] args)
    {
        //for 1 to 5
        /*
         * for(int i=1;i<=5;i=i+1)
         * {
         * System.out.println(i);
         * }
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Number 1:");
        int a = scan.nextInt();
        System.out.println("Number 2:");
        int b = scan.nextInt();

        for(int i=a;i<=b;i=i+1)
        {
            System.out.println(i);
        }
    }
}