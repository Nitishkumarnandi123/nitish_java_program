class student
{
string name;
int roll;

student(string name,int roll)
{
this.name=name;
this.roll=roll;
}
public static void main(String args[])
{
Student s1=new Student("ram", 100);
Student s2=new Student("nitish",101);
Student s3=new Student("ram",100);
Student s4=s1;
System.out.println(s1.equals(s2));
System.out.println(s1.equals(s3));
System.out.println(s1.equals(s4));
}
}

