import java.util.Scanner;
class sunil{
public static void main(String args[]){
int year=2020;
Scanner input= new Scanner(System.in);
System.out.print("enter a year");
year= input.nextInt();
System.out.println(year%4==0&& year%100!=0||year%400==0)?printf("\n leap year"):printf("\n not leap year");
}
}