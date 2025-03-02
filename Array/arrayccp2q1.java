/*
 * get input for 5 numbers using array and for loop
 */
import java.util.Scanner;
class arrayccp2q1
{
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] marks =new int[5];
    for(int i=0;i<=4;i=i+1)
    {
    marks[i] = scan.nextInt(); 
    }
    for(int i=0;i<=4;i=i+1)
    {
        System.out.println(marks[i]);
    }
    //System.out.println(marks[0]);
    //System.out.println(marks[1]);
    //System.out.println(marks[2]);
    //System.out.println(marks[3]);
    //System.out.println(marks[4]);
}
}
