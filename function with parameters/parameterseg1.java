/*
 * exercise:
 * create a function called sum, send two numbers from main functions and add these numbers using  function and print it.
 * like wise create function like sub,mul,div
 */
public class parameterseg1
{
    void sum(int num1,int num2)
    {
        System.out.println(num1+num2);
    }
    void sub(int num1,int num2)
    {
        System.out.println(num1 -num2);
    }
    void mul(int num1, int num2)
    {
        System.out.println(num1 * num2);
    }
    void div(int num1, int num2)
    {
        System.out.println(num1 / num2);
    }
    public static void main(String[] args) 
    {
      parameterseg1 obj1 = new parameterseg1();
      obj1.sum(15,25); 
      obj1.sub(50,25);
      obj1.mul(7,5);
      obj1.div(50,5);
    }
}