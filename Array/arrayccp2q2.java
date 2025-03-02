//print 10 Numbers from an array using for loop
import java.util.Scanner;
class arrayccp2q2
{
    public static void main(String[] args)
     {
        Scanner scan = new Scanner(System.in);
        int numbers[] = new int[10];
        {
        for(int i=0;i<=9;i=i+1)
        numbers[i]=scan.nextInt();
        }
        
        for(int i=0;i<=9;i=i+1)
        {
            System.out.println(numbers[i]);
        }
    }
}