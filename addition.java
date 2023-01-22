import java.util.Scanner;
public class addition
{
public static void main(String args[])
{
Scanner input= new Scanner(System.in);
int number1;
int number2;
int sum;
System.out.print("enter the 1st integer");
number1=input.nextInt();
System.out.print("enter the 2nd integer");
number2=input.nextInt();
sum=number1+number2;
System.out.printf("the sum is %d%n",sum);
}
}
