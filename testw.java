class Student{
}
class customer{
}
class testw
{
public static void main(String args[])throws Exception
{
Object o=Class.forName(args[0]).newInstance();
System.out.println("Object Created for:"+o.getClass().getName());
}
}

