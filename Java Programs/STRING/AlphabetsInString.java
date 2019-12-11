package collections;
import java.util.*;

public class Input {
    public void ABC()
    {
        Integer[] arr = new Integer[5];
        Integer[] b = new Integer[5];
        int l = arr.length;
        int k =0;
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i< l;i++)
        {
            System.out.println("enter the array : " + i);
            arr[i] = scan.nextInt();
                    
        }
        for(int i = 0; i< l;i++)
        {
            for(int j =i+1;j<l;j++)
            {
                if(arr[i]== arr[j])
                {
                    arr[j] = null;
                    
                }
                    
            }
        }
        
        for(int i = 0; i< l;i++)
        {
            
            if(arr[i] == null)
            {
                break;
            }
            else
            {
                b[k] = arr[i];
                k++;
            }
        }
        int le = k;
        System.out.println(" The elements in the list are : ");
        for(int i = 0; i< le;i++)
        {
            System.out.println(b[i]);
        }
        
    
    }
    }
