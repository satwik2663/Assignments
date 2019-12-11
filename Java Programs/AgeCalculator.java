package satPackage;

package satPackage;

import java.util.Scanner;
import java.util.*;
public class satClass {

	
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the date of birth");
		System.out.println("Enter Month");
		int dobm = s1.nextInt();
		System.out.println("Enter Date");
		int dobd = s1.nextInt();
		System.out.println("Enter Year");
		int doby = s1.nextInt();
		System.out.println("Enter the date of Today");
		System.out.println("Enter Month");
		int dotm = s1.nextInt();
		System.out.println("Enter Date");
		int dotd = s1.nextInt();
		System.out.println("Enter Year");
		int doty = s1.nextInt();
		
		CalculatorMMDDYYYY yc = new CalculatorMMDDYYYY();
		yc.Year(doty,doby);
		yc.Month(doty,doby,dobm,dotm);
		yc.day(dobd,dobm,doby,dotd,dotm,doty);
		
	}
public class CalculatorMMDDYYYY {
	 
	//FINDING THE NUMBER OF YEARS
	public void Year(int a, int b) 
	{
		int yp = a-b;
		System.out.println("The number of years passed is: " + yp)	;
	}
	
	//FINDING THE NUMBER OF MONTHS
	public void Month(int c, int d, int e,int f) //doty,doby,dobm,dotm 
	{
		int mp = (((c-d)-1)*12) + f + (12-e);
		System.out.println("The number of months passed is: " + mp)	;
	}
	
	//FINDING THE NUMBER OF DAYS
	public void day(int p,int q,int r,int s,int t,int u) //dobd,dobm,doby,dotd,dotm,doty 
	{
		int al[] = {0,31,29,31,30,31,30,31,31,30,31,30,31};
		int day = 0;
			for(int i = (r+1);i<=(u-1);i++) {
				if(i%4 == 0)
				{
					day = day + 366;
				}
				else
				{
					day= day+365;
				}
			}
			
			if(r%4==0) {
				switch(q) {
				case 1: day= day+(366-p);break;
				case 2: day= day+(366-(al[1]+p));break;
				case 3: day= day+(366-(al[1]+al[2]+p));break;
				case 4: day= day+(366-(al[1]+al[2]+al[3]+p));break;
				case 5: day= day+(366-(al[1]+al[2]+al[3]+al[4]+p));break;
				case 6: day= day+(366-(al[1]+al[2]+al[3]+al[4]+al[5]+p));break;
				case 7: day= day+(366-(al[1]+al[2]+al[3]+al[4]+al[5]+al[6]+p));break;
				case 8: day= day+(366-(al[1]+al[2]+al[3]+al[4]+al[5]+al[6]+al[7]+p));break;
				case 9: day= day+(366-(al[1]+al[2]+al[3]+al[4]+al[5]+al[6]+al[7]+al[8]+p));break;
				case 10:day= day+(366-(al[1]+al[2]+al[3]+al[4]+al[5]+al[6]+al[7]+al[8]+al[9]+p));break;
				case 11:day= day+(366-(al[1]+al[2]+al[3]+al[4]+al[5]+al[6]+al[7]+al[8]+al[9]+al[10]+p));break;
				case 12:day= day+(366-(al[1]+al[2]+al[3]+al[4]+al[5]+al[6]+al[7]+al[8]+al[9]+al[10]+p));break;
			}
			}
				else{
				switch(q) {
				case 1: day= day+(365-p);break;
				case 2: day= day+(365-(al[1]+p));break;
				case 3: day= day+(365-(al[1]+al[2]+p));break;
				case 4: day= day+(365-(al[1]+al[2]+al[3]+p));break;
				case 5: day= day+(365-(al[1]+al[2]+al[3]+al[4]+p));break;
				case 6: day= day+(365-(al[1]+al[2]+al[3]+al[4]+al[5]+p));break;
				case 7: day= day+(365-(al[1]+al[2]+al[3]+al[4]+al[5]+al[6]+p));break;
				case 8: day= day+(365-(al[1]+al[2]+al[3]+al[4]+al[5]+al[6]+al[7]+p));break;
				case 9: day= day+(365-(al[1]+al[2]+al[3]+al[4]+al[5]+al[6]+al[7]+al[8]+p));break;
				case 10:day= day+(365-(al[1]+al[2]+al[3]+al[4]+al[5]+al[6]+al[7]+al[8]+al[9]+p));break;
				case 11:day= day+(365-(al[1]+al[2]+al[3]+al[4]+al[5]+al[6]+al[7]+al[8]+al[9]+al[10]+p));break;
				case 12:day= day+(365-(al[1]+al[2]+al[3]+al[4]+al[5]+al[6]+al[7]+al[8]+al[9]+al[10]+p));break;
				}
			}
			if(u%4==0) {
				switch(t) {
				case 1: day= day+s;break;
				case 2: day= day+al[1]+s;break;
				case 3: day= day+al[1]+al[2]+s;break;
				case 4: day= day+al[1]+al[2]+al[3]+s;break;
				case 5: day= day+al[1]+al[2]+al[3]+al[4]+s;break;
				case 6: day= day+al[1]+al[2]+al[3]+al[4]+al[5]+s;break;
				case 7: day= day+al[1]+al[2]+al[3]+al[4]+al[5]+al[6]+s;break;
				case 8: day= day+al[1]+al[2]+al[3]+al[4]+al[5]+al[6]+al[7]+s;break;
				case 9: day= day+al[1]+al[2]+al[3]+al[4]+al[5]+al[6]+al[7]+al[8]+s;break;
				case 10: day= day+al[1]+al[2]+al[3]+al[4]+al[5]+al[6]+al[7]+al[8]+al[9]+s;break;
				case 11: day= day+al[1]+al[2]+al[3]+al[4]+al[5]+al[6]+al[7]+al[8]+al[9]+al[10]+s;break;
				case 12: day= day+al[1]+al[2]+al[3]+al[4]+al[5]+al[6]+al[7]+al[8]+al[9]+al[10]+s;break;
			}
			}
				else{
				switch(t) {
				case 1: day=(day+s)-1;break;
				case 2: day= day+((al[1]+s)-1);break;
				case 3: day= day+((al[1]+al[2]+s)-1);break;
				case 4: day= day+((al[1]+al[2]+al[3]+s)-1);break;
				case 5: day= day+((al[1]+al[2]+al[3]+al[4]+s)-1);break;
				case 6: day= day+((al[1]+al[2]+al[3]+al[4]+al[5]+s)-1);break;
				case 7: day= day+((al[1]+al[2]+al[3]+al[4]+al[5]+al[6]+s)-1);break;
				case 8: day= day+((al[1]+al[2]+al[3]+al[4]+al[5]+al[6]+al[7]+s)-1);break;
				case 9: day= day+((al[1]+al[2]+al[3]+al[4]+al[5]+al[6]+al[7]+al[8]+s)-1);break;
				case 10:day= day+((al[1]+al[2]+al[3]+al[4]+al[5]+al[6]+al[7]+al[8]+al[9]+s)-1);break;
				case 11:day= day+((al[1]+al[2]+al[3]+al[4]+al[5]+al[6]+al[7]+al[8]+al[9]+al[10]+s)-1);break;
				case 12:day= day+((al[1]+al[2]+al[3]+al[4]+al[5]+al[6]+al[7]+al[8]+al[9]+al[10]+s)-1);break;
				}
			}
			System.out.println("The number of days passed is: " + day)	;
	}
}
