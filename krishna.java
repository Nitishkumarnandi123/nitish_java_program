class krishna
{
static int get(int a,int b)
{
int i=a/b;
return i;
}
static int display(int a,int b)
{
int result=0;
try
{
result=get(a,b);
}
catch(NumberFormatException ex)
{
System.out.println("exception is occured");
}
return result;
}
public static void main(String[]args)
{
int a=1;
int b=0;
try
{
int i=display(a,b);
}
catch(ArithmeticException ex)
{
System.out.println(ex.getmessage());
}
}
}


























}