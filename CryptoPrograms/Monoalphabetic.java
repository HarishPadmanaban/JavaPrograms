import java.util.*;
public class Monoalphabetic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        String pt = "helloworld";
        String ct = "";
        for(int i = 0 ;i < pt.length(); i++)
        {
            int val = (pt.charAt(i) - 'a' + key) % 26;
            ct += (char)(val + 'a');

        }
        System.out.println("Plaintext is :"+pt);
        System.out.println("Ciphertext is:"+ct);
    }
}
