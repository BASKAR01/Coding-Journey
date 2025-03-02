/*Get input for 3 integer variables: a,b and c. Now multiply all variables and store it in d.Now add all variables and store it in e. Now divide d by e.*/
import java.util.Scanner;
class q3{
    public static void main(String[] args)
     {
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        int d=a*b*c;
        int e=a+b+c;
        System.out.println(d/e);
    }
}