
import java.util.Scanner;

class arrayccp2q32
{
    public static void main(String[] args) 
    {
        System.out.println("Enter table number:");
        Scanner scan = new Scanner(System.in);
        int table = scan.nextInt();
        for(int i=1;i<=10;i=i+1)
        {
            System.out.println(i+"*"+table+"="+i*table);
        }
        
    }
}