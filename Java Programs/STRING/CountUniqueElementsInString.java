package collections;
import java.util.*;

public class Input {
    Scanner scan  = new Scanner(System.in);
    public void ABC()
    {   
        int len1 = 0;
        System.out.println("Enter the string");
        String S = scan.nextLine();
        len1 = S.length();
        
        Character[] arr = new Character[len1];
        Character[] b = new Character[len1];
        int k =0;
        int find = 0;
        Scanner scan = new Scanner(System.in);
        
        for(int i = 0; i< len1;i++)
        {
            arr[i] = S.charAt(i);        
        }
       
        
        for(int i = 0; i< len1;i++)
        {
            for(int j =i+1;j<len1;j++)
            {
                if(arr[i]== arr[j])
                {
                    arr[j] = null;
                    
                }                    
            }
           
        }
        
        for(int i = 0; i< len1;i++)
        {
            
            if(arr[i] == null)
            {
                
            }
            else
            {
                b[k] = arr[i];
                k++;
            }
            
        }
        
        int le = k;
        System.out.println("\nThe elements in the list are : \n");
        for(int i = 0; i< le;i++)
        {
            System.out.print(b[i] + " ");
        }
        
        for (int i=0;i<le;i++)
        {
            for(int j=0;j<len1;j++)
            {
                if(b[i] == S.charAt(j))
                {
                    find++;
                }
            }
            System.out.println("\nNumber of : " + b[i] + " : " + find);
            find=0;
        }
        
    
    }
    }
    
