import java.util.Scanner;

public class polyalphabetic {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pt = "cold";
        String at = "week";
        String ct = "";
        for(int i = 0 ;i < pt.length(); i++)
        {
            int val = (pt.charAt(i) + at.charAt(i) - 'a' ) % 26;
            ct += (char)(val + 'a');

        }
        System.out.println("Plaintext is :"+pt);
        System.out.println("Ciphertext is:"+ct);
    }
}
