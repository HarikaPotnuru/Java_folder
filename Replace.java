public class Replace
{
public static void main(String[]args)
{
String letter="dear <|name|>,thanks a lot";
String abc=letter.replace("<|name|>","harika");
System.out.println(abc);
}
} 