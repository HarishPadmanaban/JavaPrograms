import java.util.*;
public class Palindrome{
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String s=sc.next();
        String sl=s.toLowerCase();
        StringBuffer str=new StringBuffer(sl);
       StringBuffer r=str.reverse();
        if(sl.equals(r.toString()))
        {
            System.out.println("The given string is palindrome.");
        }
        else{
            System.out.println("The given string is not palindrome.");
        }
    }
}
