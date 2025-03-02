public class laptop
{
    String name =" ";
    String processor =" ";
    int ram = 0;
    int price = 0;

    public static void main(String[] args)
    {
        laptop lap1 = new laptop();

        lap1.name ="hp";
        lap1.processor="AMD";
        lap1.ram = 8;
        lap1.price =40000;

        laptop lap2 = new laptop();
        lap2.name="Dell";
        lap2.processor="Intel";
        lap2.ram=8;
        lap2.price=50000;
        System.out.println(lap2.name);

        laptop lap3 = new laptop();
        lap3.price = 15000;
        System.out.println(lap3.price);
    }
}