import java.util.Scanner;
public class Incometax
{
public static void main(String[]args)
{
double tax;
System.out.println("enter the salary");
Scanner sc=new Scanner(System.in);
int sal=sc.nextInt();
if(sal>200000 && sal<=500000)
{
 tax=sal*0.5;
 System.out.println("income tax is:"+tax);
}
else if(sal>500000 && sal<+1000000)
{
 tax=sal*0.20;
 System.out.println("income tax is:"+tax);
}
else
{
 tax=sal*0.30;
 System.out.println("income tax is:"+tax);
}
}
}