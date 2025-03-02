import java.util.Scanner;
class ifelsedemo4
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        if(num1==num2){
            System.out.println("Both the numbers are equal");

        }
        else{
            System.out.println("not equal");
        }
    }
}
