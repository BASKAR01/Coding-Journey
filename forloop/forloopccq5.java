/*
 * print the number which are divisible by both 3 and 5 range 1 to 100
 */
class forloopccq5
{
    public static void main(String[]args)
    {
     for(int i=1;i<=100;i=i+1)
     {
        if(i%3==0 && i%5==0)
        {
            System.out.println("the divisible numbers of 3 and 5 are:"+i);
        }
     }        
    }
}