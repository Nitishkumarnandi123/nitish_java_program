import java.util.Scanner;
class krishna2
{
void addition(int x, int y)
{
c=x+y;
}
public static void main(String args[])
{
int a,b;
Scanner sc= new Scanner(System.in);
System.out.println("enter the 1st integer");
int a= sc.nextInt();
System.out.println("entre the 2nd integer");
int b= sc.nextInt();
krishna2 r =new add();
r.addition(a,b);
System.out.println("addition of two no is:"+r.c);
}
}
