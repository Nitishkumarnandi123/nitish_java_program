Import java.util.Random;
class Randomtest
{
public static void main(String args[])
{
Random r= newRandom();
int random= r.newInt(10)+1;
System.out.println("Random number from 1 to 10 are:"+random);
}
}