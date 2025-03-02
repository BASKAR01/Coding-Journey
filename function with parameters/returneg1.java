/*
 * create a function called sum and send two values to it using paramaterized function.
 * return the total value using return keyword.
 */
public class returneg1
{
    int sum(int a,int b)
    {
        int c = a+b;
        return c;
    }
    public static void main(String[] args) 
    {
      returneg1 obj1 = new returneg1();
      int sum = obj1.sum(20,40);
      System.out.println(sum);
    }
}