package satPackage;

import java.util.Scanner;
import java.util.*;
public class satClass {

	
	public static void main(String[] args) {
		
		
		LLnionintersection LL = new LLnionintersection();
		LL.Input();
		LL.intersection();
		LL.union();
		
		
	}}
	
public class LLnionintersection {

		 int i = 0;
		 int j = 0;
		 int k = 0;
		 int flag = 0;
		 int array[] = new int[10];
		 int array1[] = new int[10];
		 int sizeA;
		 int sizeA1;
		Scanner s2 = new Scanner(System.in);
		List al = new ArrayList();
		ArrayList al2 = new ArrayList();
		//INPUT FROM USER
		public void Input() {
			System.out.println("Enter the size for the first array(max 10)");
			sizeA = s2.nextInt();
			System.out.println("Enter the elements for the first array");
			for(int i=0;i<sizeA;i++)
			{
				System.out.println("Enter element: " + i);
				array[i] = s2.nextInt();
			}
			System.out.println("Enter the size for the Second array(max 10)");
			sizeA1 = s2.nextInt();
			System.out.println("Enter the elements for the Second array");
			for(int i=0;i<sizeA1;i++)
			{
				System.out.println("Enter element : " + i);
				array1[i] = s2.nextInt();
			}
		}
		
		//INTERSECTION
		public void intersection() {
			
		 System.out.println("INTERSECTION");
			for(i = 0; i<sizeA;i++) 
			{
				for(j=0;j<sizeA1;j++)
				{
					if (array[i] == array1[j])
					{
					al2.add(array[i]);
					break;
					}					
				}
			}
			System.out.println(al2);
		}
		
		//UNION
		public void union(){
						
			System.out.println("UNION");
			for(i=0;i<sizeA;i++)
			{
				al.add(array[i]);
			}
			
			
			for(i=0;i<sizeA1;i++)
			{
				for(j=0;j<sizeA;j++)
				{
					if(array1[i] != array[j])
					{ 
					flag = 1;
					}
					else
					{
						flag = 0; 
						break;
					}
				}
				
				if(flag == 1)
				{	
					al.add(array1[i]);
					
				}
			}
			
				System.out.println(al);
			
		}


	}
