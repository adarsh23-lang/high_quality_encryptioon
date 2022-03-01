import java.util.Scanner;
class first_sky
{
public static int count(String s)
{
int n;
int k=(int)(Math.pow(10,countlegit(s)));
int count=0;String x="";;
for(int i=0;i<countlegit(s);i++)
{
n=Character.getNumericValue(s.charAt(i));
count=count+(n*k);
k/=10;
}
count/=10;
return count;
}
public static int countlegit(String s)
{
int count=0;
for(int i=0;i<s.length();i++)
{
if(s.charAt(i)>='0' && s.charAt(i)<='9')
{
count++;
}
}
return count;
}
public static void main(String [] args)
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter the string with sky value");
String s=sc.next();
System.out.println(count(s));
System.out.println(countlegit(s));
}
}
