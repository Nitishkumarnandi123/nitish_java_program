import java.util.*;
public class LotteryDrawing
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.print("how many numbers do you need to draw ?");
int k=sc.nextInt();
System.out.print("what is the highest number you can draw ?");
int k=sc.nextInt();
int[] numbers =new int[n];
for(int i=0;i<numbers.length;i++)
numbers[i]=i+1;
int[] result=new int[k];
for(int i=0;i<result.length;i++)
{
int r= (int) (math.random()*n);
result[i]=numbers[r];
numbers[r]=numbers(n-1);
n--;
}
Arrays.sort(result);
System.out.println("put the following combination. it'll make you rich!");
for(int r:result)
System.out.println(r);
}
}



