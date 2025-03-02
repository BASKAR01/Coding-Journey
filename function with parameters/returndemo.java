public class returndemo
{ 
    int getsoap(int money)
    {
        int soapprice =15;
        int rem = 20-15;
        return rem;
    }
    public static void main(String[] args) 
    {
        returndemo obj1 = new returndemo();
        int remainder= obj1.getsoap(20);
        System.out.println(remainder); 
    }
}