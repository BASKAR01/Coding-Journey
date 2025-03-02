import java.util.Scanner;
class ifelseq6
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        String Roshna =scan.nextLine();
        if(Roshna.equals("dead"))
        {
            System.out.println("Baskar meets Roshna");
        }
        else{
            System.out.println("Baskar weds Ramya");
        }
    }
}