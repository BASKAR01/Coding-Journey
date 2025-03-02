//Get a input from user, for the variable called RCB.
//if rcb==win print("ee sala cup namdhey")
//if rcb == loose print("cup illa")
import java.util.Scanner;
class ifelseq5
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        String RCB = scan.nextLine();
        if(RCB.equals("WIN"))
        {
            System.out.println("Ee sala cup Namdhey");
        }
        else
        {
            System.out.println("Cup illa");

        }
    }
}
