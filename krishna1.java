import java.util.Scanner;
class krishna1{
int perimeter(int l,int b)
{
int p=2*(l+b);
return p;
}
int area(int l, int b)
{
int p=perimeter(l,b);
System.out.println("perimeter:"+p);
int a=(l*b);
return a;
}
int volume(int l,int b,int h)
{
int a=area(l,b);
System.out.println("area is:"+a);
int v=l*b*h;
return v;
}
public static void main(String args[])
{
Scanner s= new Scanner(System.in);
System.out.println("Enter the length,breath and height");
int l= s.nextInt();
int b= s.nextInt();
int h= s.nextInt();
krishna1 a1= new krishna1();
int v=a1.volume(l,b,h);
System.out.println("volume is"+v);
}
}

