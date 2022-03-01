import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
class high_qualtiy_encryption
{
public static void decrypt(int n,ArrayList<String> list)
{
first_sky obj3  = new first_sky();
String s="";
System.out.println("Decrypted :");
for(int y=0;y<n-1;y++)
{
s=s+(char)(obj3.count(list.get(y)));
for(int i=(list.get(y).length()-1);i>=(obj3.countlegit(list.get(y)));i--)
{
s=s+(char)((int)(list.get(y).charAt(i))-4);
}
System.out.print(s+" ");
s="";
}
}
public static String encrypt(int n,ArrayList<String> list)
{
String s="";String output="";
//System.out.println("Encrypted :");
for(int y=0;y<n-1;y++)
{
s=s+(int)(list.get(y).charAt(0));
for(int i=(list.get(y).length()-1);i>=1;i--)
{
s=s+(char) ( (int) (list.get(y).charAt(i))+4);
}
output+=s+" ";
//System.out.print(s+" ");
s="";
}
return output;
}
public static void main(String [] args)
{
File f;
String q="",Z="",s="";
ArrayList<String> pop = new ArrayList<String>();
ArrayList<String> pop2 = new ArrayList<String>();
Scanner sc = new Scanner(System.in);
no_spaces obj2 = new no_spaces();
//try{
//System.out.print("Enter the file_path : ");
//String path=sc.next();
//f = new File(path);
//Scanner read = new Scanner(f);
//while(read.hasNextLine()){
//s=s+read.nextLine();
//}
//s=s+" ";
//s="I am Abhinav prakash";
System.out.print("Enter a string : ");
s=sc.nextLine();
s=s+" ";
count_words_in_line obj =new count_words_in_line();
int n =obj.count_words(s);
int u=obj2.no_space(s);
for(int i=0;i<s.length();i++)
{
if((int)s.charAt(i)==32)
{
pop.add(q);
q="";
continue;
}
else
{
q=q+s.charAt(i);
}
}
//System.out.println(s);
System.out.println(encrypt(n,pop));
//File f2 = new File(f.getAbsolutePath()+"encrypt.txt");
//FileWriter w = new FileWriter(f2);
//w.write(encrypt(n,pop));
//w.close();
//}
//catch(IOException e){
//System.out.println("An error occured ");
//}
//System.out.println(encrypt(n,pop));
//System.out.println();
}
}

