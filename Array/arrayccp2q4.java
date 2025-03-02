/*
 * get input for size on array
 * get input for each element in an array
 * find and print middle element  in an array.
 */
 import java.util.Scanner;
 class arrayccp2q4
 {
    public static void main(String[] args)
    {
        //Get input for size of an array
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size =scan.nextInt();
        //declare an array of the given size
        int[] marks = new int[size];
        //get input for each element in the array
        System.out.println("enter"+size+"elements:");

        for (int i=0;i<=size-1;i=i+1)
        {
            marks[i]=scan.nextInt();
        }
        //find and print the middle element
        int middleIndex =size/2;
        //calculate the middle index
        if(size%2==0)
        {
            System.out.println("Middle elements are:"+marks[middleIndex-1]+"and"+marks[middleIndex]);
        }
        else
        {
            System.out.println("middle element is:"+marks[middleIndex]);
        }
    }
 }