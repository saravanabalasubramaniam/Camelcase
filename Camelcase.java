import java.io.*;
import java.util.*;
public class Camelcase
{  
  public static void main(String args[])
  {
	Scanner input=new Scanner(System.in);
	String str=input.nextLine();
	String str1=str.toLowerCase();
	char ch[]=str1.toCharArray();
	ch[0]=Character.toUpperCase(ch[0]);
	for(int i=1;i<str.length();i++)
	{
		if(ch[i]==' ')
		{
			ch[i+1]=Character.toUpperCase(ch[i+1]);
		}
	}
	String a=new String(ch);
	System.out.println(a);
  }
}
