class P
{
int x=888;
}
class C extends P
{
int x=999;
}
class Test
{
public static void main(String args[])
{
P p= new P();
System.out.println(p.x);
C c= new C();
System.out.println(c.x);
P p1= new C();
System.out.println(p1.x);
}
}