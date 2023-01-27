import java.util.Scanner;
public class Calc {
public static void main(String args[]) {
	int a,b,res;
	char operator;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter arithmetic expression[operand1 operator operand2");
	a=input.nextInt();
	operator=input.next().charAt(0);
	b=input.nextInt();
	switch(operator)
	{
	case'+':res=a+b;
		   System.out.println(a+"+"+b+"="+res);
		   break;
	case'-':res=a-b;
	   System.out.println(a+"-"+b+"="+res);
	   break;
	case'*':res=a+b;
	   System.out.println(a+"*"+b+"="+res);
	   break;  
	case'/':res=a+b;
	   System.out.println(a+"/"+b+"="+res);
	   break;   
	case'%':res=a+b;
	   System.out.println(a+"%"+b+"="+res);
	   break;
	   default:System.out.println("invalid operator");
	   break;
	}
	
			
}
}
