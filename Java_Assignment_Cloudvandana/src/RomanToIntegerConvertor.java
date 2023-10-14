import java.util.*;
public class RomanToIntegerConvertor{
	public static void main(String args[]) {
		
		//HERE EW TAKING INPUT STRING WHERE WE WNAT TO CONVERT IT INTO THE RESPECTIVE INTEGER
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int value=0;
		//here we check that if there is only one charactor in the string then directly convert it into respective integer
		if(str.length() == 1) {
			if(str == "V") {
				value+=5;
			}
			else if(str == "I") {
				value+=1;
			}
			else if(str == "X") {
				value+=10;
			}
			else if(str == "L") {
				value+=50;
			}
			else if(str == "C") {
				value+=100;
			}
			else if(str == "D") {
				value+=500;
			}
			else if(str == "M") {
				value+=1000;
			}
			
		}
		
		//here we actual convert the string of roman number more than one character into respective integer
		else {
			
			int i=Integer.MAX_VALUE;
			int j=Integer.MAX_VALUE;
			for(int k=0;k<str.length();k++)
			{
				char ch = str.charAt(k);
				//here we take initial value 
				if(k==0) {
					if(ch=='I') {
						value+=1;
						j=i;
						i=1;
					}
					else if(ch=='V') {
						value+=5;
						j=i;
						i=5;
					}
					else if(ch=='X') {
						value+=10;
						j=i;
						i=10;
					}
					else if(ch=='L') {
						value+=50;
						j=i;
						i=50;
					}
					else if(ch=='C') {
						value+=100;
						j=i;
						i=100;
					}
					else if(ch=='D') {
						value+=500;
						j=i;
						i=500;
					}
					else if(ch=='M') {
						value+=1000;
						j=i;
						i=1000;
					}
				}
				else {
					if(ch=='I') {
						value+=1;
						j=i;
						i=1;
					}
					else if(ch == 'V') {
						value+=5;
						j=i;
						i=5;
					}
					else if(ch == 'X') {
						value+=10;
						j=i;
						i=10;
					}
					else if(ch=='L') {
						value+=50;
						j=i;
						i=50;
					}
					else if(ch=='C') {
						value+=100;
						j=i;
						i=100;
					}
					else if(ch=='D') {
						value+=500;
						j=i;
						i=500;
					}
					else if(ch=='M') {
						value+=1000;
						j=i;
						i=1000;
					}
					if(j<i) {
						value-=2*j;
					}
					
				}
			}
			
		}
		
		System.out.println(value);
	}
}