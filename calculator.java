import java.util.Scanner;
public class Calculator
{
public static void calculator(double first,double second,char operator)
{
double result;
switch(operator)
{
case '+' :
result= first+second;
break;
case '-' :
result=first-second;
break;
case '*' :
result=first*second;
break;
case '/' :
result=first/second;
break;
default:
System.out.println("error! operator is not correct");
return;
}
System.out.println(first+" "+" "+second+" "+result);
}
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
System.out.println("enter the first number:");
double first=sc.nextdouble();
System.out.print("enter the second number:");
double second=sc.nextdouble();
System.out.println("enter an operator(+,-,*,/)");
char operator =sc.next().CharAt(0);
calculator (first,second,operator);
}
}
