import java.util.Scanner;
public class Excercise
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your S1 marks:");
int S1=sc.nextInt();
System.out.println("Enter your S2 marks:");
int S2=sc.nextInt();
System.out.println("Enter your S3 marks:");
int S3=sc.nextInt();
System.out.println("Enter your S4 marks:");
int S4=sc.nextInt();
System.out.println("Enter your S5 marks:");
int S5=sc.nextInt();
float percentage=((S1+S2+S3+S4+S5)/500.0f)*100;
System.out.println("percentage is:"+percentage);
}
}
