import java.util.*;

public class PanagramProgram
{
	public static void main(String args[])
	{
		int flag=0;
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int [] arr=new int[26];
		for(int i=0;i<str.length();i++)
		{
			arr[str.charAt(i)-'a']++;
		}
		for(int i=0;i<26;i++)
		{
			if(arr[i] != 1)
			{
				flag=1;
				System.out.println("Not pangram");
				break;
			}
		}
		if(flag==0)
		System.out.println("Pangram");

	}

}