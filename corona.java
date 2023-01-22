import java.util.Scanner;
 public class corona{
int peremeter (int l, int b)
{
int p= 2*(l+b);
return p;
}
int area (int l, int b)
{
int p= peremeter(l,b);
System.out.println("peremeter"+P);
int a=(l*b);
return a;
}
int volume (int l,int b, int h)
{
int a= area(l,b);
System.out.println("volume"+v);
{
int v=(l*b*h);
return v;
}
public static void main(String args[])
{
Scanner s =new Scanner(System.in);
System.out.println("enter the length,breath,height");
int l=S.nextInt();
int b=S.nextInt();
int h=S.nextInt();
xyz a1= new xyz();
int v= a1.volume(l,h,b);
System.out.println("volume is"+v);
}
}
