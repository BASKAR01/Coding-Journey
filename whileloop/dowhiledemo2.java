/*
 * example
 * get input for variable a.input should be greater than 10;
 * 
 * if input is not greater than 10 ask the user to re enter until he types the right input
 */
import java.util.Scanner;
class dowhiledemo2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int count =0;
        do{
            System.out.println("Enter the number > 10:");
            count =scan.nextInt();
        }
        while(count<10);
    }
}