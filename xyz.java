class xyz
{
void print(int n)
{
for(int i=1;i<=5;i++)
}
System.out.println(n*i);
try
{
Thread.sleep(400);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
}
class abc extends Thread
{
xyz x1;
abc (xyz x1)
{
this.x1=x1;
}
public void run()
{
x1.print(5);
}
}
class pqr extends Thread{
xyz x1;
pqr (xyz x1)
{
this.x1=x1;
}
public void run()
{
x1.print(100);
}
}
class test{
public static void main(String []args)
{
xyz x2=new xyz();
abc a2=new abc(x2);
pqr q1=new pqr(x2);
a2.start()
q1.start()
}
}