/*
 * question
 * create a class called garden
 * 
 * this class should have 2 variable
 * apple_price =20
 * apple_count=5
 * 
 * create a function called total_money which should multiply count with price and display the total amount
 */
public class functionq2
{
    int apple_price =20;
    int apple_count=5;

    void total_money()
    {
       System.out.println(apple_price*apple_count);
    }
    public static void main(String[] args)
    {
        functionq2 obj1 = new functionq2();
        obj1.total_money();
    }
}
