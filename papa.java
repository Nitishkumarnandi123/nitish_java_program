class papa
{
public void m1(String s)
{
System.out.println("string version");
}
public void m1(Object o)
{
System.out.println("object version");
}
public static void main(String args[])
{
Papa p= new Papa();
p.m1(new object());
p.m1("nitish");
p.m1(null);
}
}

