/*
 * question
 * create a class called addition
 * this class should have 2 variables
 * a=10
 * b=20
 * create a function called sum which should add a & b and print the total output
 * call the sum function from main method
 */
public class functionq1
{
    int a =10;
    int b =20;
    void sum()
    {
        System.out.println(a+b);
    }
    public static void main(String[] args) 
    {

        functionq1 obj1 = new functionq1();
        obj1.sum();     
    }
}