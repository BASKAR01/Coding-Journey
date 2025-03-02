public class store
{
    void getsoap(int money)
    {
        System.out.println(money);
        System.out.println("Soap Purchased");
    }
    void chocolate(int money)
    {
        System.out.println(money);
        System.out.println("Chocolate Purchased");
    }
    void powder(int money)
    {
        System.out.println(money);
        System.out.println("powder Purchased");
    }
    public static void main(String[] args)
    {
       store obj1 = new store();
       obj1.getsoap(20);
       obj1.chocolate(5);
       obj1.powder(50);
    }
}