/*
 * count the number of odd number from 1 to 10
 */
class forloopccq4
{
    public static void main(String[] args) {
        int oddcount=0;
        for(int i=1;i<=10;i=i+1)
        {
            //print only odd numbers
            if(i%2==0)
            {
               //System.out.println("Odd numbers:"+i);
            }
            else{
                oddcount=oddcount+1;
            }
        }
        System.out.println(oddcount);
    }
}