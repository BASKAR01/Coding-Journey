import java.util.Random;
class whileloopdemo2
{
    public static void main(String[] args) 
    {
     //generate a random number until the number generated random number is 5
     Random rand = new Random();
     int newnum = rand.nextInt(11);
     System.out.println(newnum);  
    }
}
