import java.util.*;

class Vig{
    String pt;
    String key;
    public Vig(String pt,String key){
        this.pt=pt;
        this.key=key;
    }
    public void lengthCheck(){
        if(pt.length()>key.length()){
           // System.out.println(pt);
            //System.out.println(key);
            int m=pt.length();
            int n=key.length();
            int i=key.length();
            int j=0;
            while(i<m){
                key+=key.charAt(j%n);
                j++;
                i++;
            }
            
            System.out.println(pt);
            System.out.println(key);
            ciphertext();
        }
    }
    public void ciphertext(){
        String ct="";
        for(int i = 0 ;i < pt.length(); i++)
        {

            int val = (pt.charAt(i) + key.charAt(i) - 'a' ) ;
            if(val>122)
            val= ((val-'a') %26)+'a';
            ct += (char)(val);

        }
        System.out.println("Plaintext is :"+pt);
        System.out.println("Ciphertext is:"+ct);
    }
}


public class viginire {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the plaintext :");
        String pt=sc.next();
        System.out.print("Enter the key :");
        String key=sc.next();
        Vig obj=new Vig(pt,key);
        obj.lengthCheck();
    }
}
