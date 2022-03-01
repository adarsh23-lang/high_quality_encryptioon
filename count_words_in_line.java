import  java.util.Scanner;
class count_words_in_line
{
public static int count_words(String s)
{
int count=1;
for(int i=0;i<s.length();i++)
{
if(((int)s.charAt(i))==32)
{
count++;
continue;
}
}
return count;
}
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the line");
String s =sc.nextLine();
//System.out.println((char)32+"am");
System.out.println(count_words(s));
}
}
