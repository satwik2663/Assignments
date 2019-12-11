package collections;
import java.util.Scanner;
public class Collections {
    
    public static void main(String aa[]) 
    {
       Scanner scan = new Scanner(System.in);
       int i = 0;
       int j = 0;
       int k =0;
       String S1;
       String S = new String("Guys i need a bottle");
       S1=S;
       S1 = S1.concat(" ");
       while(i<S1.length())
       {
           if(S1.charAt(i) == ' ')
           {
               System.out.println("\n\nWORD : " + k);
               k++;
               while(j<i)
               {    
                   System.out.print(S1.charAt(j));
                   j++;
               }
           }
           
           i++;
           
       }
    }
}


