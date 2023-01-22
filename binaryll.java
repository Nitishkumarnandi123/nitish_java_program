import java.io.*;
public class binaryll{
public static void main(String args[])
{
int num,i=0,j,k;
int a[] = new int[20];
int b[] = new int[20];
BufferedReader br = new BufferedReader
(new InputStreamReaader(System.in));
System.out.println("Enter the any number");
num= Integer.parseInt(br.readLine());
while(num>0)
{
a[i]= num%2;
i++;
num= num/2;
}
k=i-1;
System.out.println("\n\n");
for(j=0;j<i;j++)
{
b[j]= a[k];
System.out.println("the number is"+ b[j]);
k--;
}
}
}