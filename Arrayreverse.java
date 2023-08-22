public class Arrayreverse
{
public static void main(String[]args)
{
int[] marks=new int[3];
marks[0]=30;
marks[1]=40;
marks[2]=50;
for(int i=marks.length-1;i>=0;i--)
{
System.out.println(marks[i]);
}
}
}