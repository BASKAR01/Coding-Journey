/*
 * create a function called getname(), which should return your name,
 * create a function called getphone() which should return you the phone number
 * create a function called getaddress() which should return you the address
 */
public class returneg2
{
    String getname()
    {
        return "BASKAR";
    }
    long getphone()
    {
        return 9876543210L;
    }
    String getaddress()
    {
        return "TRL";
    }
    public static void main(String[] args) 
    {
        returneg2 obj1 = new returneg2();
        String myname = obj1.getname(); 
        System.out.println(myname);
        long myphonenumber = obj1.getphone();
        System.out.println(myphonenumber);
        String myaddress = obj1.getaddress();
        System.out.println(myaddress);

    }
}