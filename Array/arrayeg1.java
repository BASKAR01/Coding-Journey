/*
 * create an integer array, get input for 5 numbers and print their sum or total.
 */
import java.util.Scanner;
class arrayeg1
{
    public static void main(String[] args) {
        int[] score= new int[5];
        Scanner scan = new Scanner(System.in);
        score[0]= scan.nextInt();
        score[1]= scan.nextInt();
        score[2]= scan.nextInt();
        score[3]= scan.nextInt();
        score[4]= scan.nextInt();
        System.out.println(score[0]+score[1]+score[2]+score[3]+score[4]);
    }
}