package collections;
import java.util.*;

public class Input {
    Scanner scan  = new Scanner(System.in);
    
    public void inputMethod()
    {   
       String S1,S2;
       int len1, len2,flag = 0;
       System.out.print("Enter string one : ");
       S1 = scan.nextLine();
       System.out.print("Enter string two : ");
       S2 = scan.nextLine();
       len1 = S1.length();
       len2 = S2.length();
       if(len1 == len2)
       {
           for(int i=0;i<len1;i++)
           {
               if(S1.charAt(i) == S2.charAt(i))
               {
                   flag = 1;
                   System.out.println("S1 is : " + S1.charAt(i));
               }
               else
               {
                   flag = 0;
               }
               if(flag == 0)
               {   System.out.println("Not equal");
                   break;
               }
               System.out.println("i : " +i);
           }
           if(flag == 1)
           {
               System.out.println("equal");
           }
       }
       else
       {
           System.out.println("Not equal");
       }
    }
}

    
    


	


      
      
    

   
