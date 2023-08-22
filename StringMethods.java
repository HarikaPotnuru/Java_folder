public class StringMethods
{
public static void main(String[]args)
{
String name="   harika";
System.out.println(name.length());
System.out.println(name.toLowerCase());
System.out.println(name.toUpperCase());
System.out.println(name.trim());
System.out.println(name.substring(3));
System.out.println(name.replace(' ','_'));
System.out.println(name.startsWith("ha"));
System.out.println(name.endsWith("ka"));
System.out.println(name.charAt(2));
System.out.println(name.indexOf("ri"));
System.out.println(name.indexOf('r',2));
System.out.println(name.lastIndexOf("a"));
System.out.println(name.lastIndexOf("i",2));
System.out.println(name.equals("harika"));
System.out.println(name.equalsIgnoreCase("harika"));
}
}