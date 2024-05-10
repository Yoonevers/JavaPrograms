import java.util.*;
public class Triangle 
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int a,b,c;
    		int r;
    		System.out.println("Enter the values of a,b and c:");
    		a = s.nextInt();
    		b = s.nextInt();
    		c = s.nextInt();
    		if(((a+b)>c) &&((b+c)>a) && ((c+a)>b))
   		{
        		if((a==b)&&(b==c))
       		{ 
             			System.out.println("Equilateral");
        		}
        		else if((a==b)||(b==c)||(c==a)) 
        		{
             			System.out.println("Isosceles");
        		}
        		else
        		{
             			System.out.println"Scalene");
        		}
    		}	
    		else
        		System.out.println("Not a triangle");
	}
}
