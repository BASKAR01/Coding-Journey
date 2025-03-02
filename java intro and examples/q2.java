/*
 * Get input for variable:Nme,Age and Address.Print it
 */
import java.util.Scanner;

class q2 {
   

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      String var2 = var1.nextLine();
      int var3 = var1.nextInt();
      var1.nextLine();
      String var4 = var1.nextLine();
      System.out.println("My name is " + var2);
      System.out.println("My age is " + var3);
      System.out.println("My Address is " + var4);
   }
}

