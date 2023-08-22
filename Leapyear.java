import java.util.Scanner;
public class Leapyear
{
public static void main(String[]args)
{
System.out.println("enter the year");
Scanner sc=new Scanner(System.in);
int y=sc.nextInt();
if(y%100==0 && y%400==0 || y%100!=0 && y%4==0)
{
 System.out.println("leap year");
}
else
{
 System.out.println("not a leap year");
}
}
}