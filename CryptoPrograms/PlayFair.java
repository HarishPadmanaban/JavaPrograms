import java.util.*;

class Play{
    String pt;
    String key; 
    public Play(String pt, String key){
        this.pt = pt;
        this.key = key;
    }
    public boolean keycheck(){
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<key.length();i++){
            if(hm.containsKey(key.charAt(i)))
            return false;
            else
            hm.put(key.charAt(i), 1);
          
        }
        notinalphabets(hm);
        System.exit(0);
        return true;
    }
    void notinalphabets(HashMap hm){
        char [] keyarr = key.toCharArray();
        char res[]=new char[26-key.length()];
        int j=0;
        int i=97;
        while(i<123) {
            if(!hm.containsKey((char)i)){
            res[j]=(char)i;
            j++;
            }
            i++;
            if(i==105)
            i++;
        }
       // System.out.println(Arrays.toString(keyarr));
        //System.out.println(Arrays.toString(res));
        twoD(keyarr, res);
    }
    void twoD(char[] keyarr,char [] notin){
        char [][] arr = new char[5][5];
        int k=0;
        int l=0;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(k<keyarr.length){
                arr[i][j]=keyarr[k];
                k++;
                }
                else if(l<notin.length){
                arr[i][j]=notin[l];
                l++;
                }
            }
        }
        //for(int i=0;i<5;i++)
       // System.out.println(Arrays.toString(arr[i]));
        playfair(arr);

    }
    public void playfair(char [][] arr){
        String ct = "";
        boolean needfiller=false;
        String newpt="";
        int pos=pt.length();

        for(int i=0;i<pt.length()-1;i+=2)
        {
            if((pt.charAt(i)==pt.charAt(i+1)) || (pt.charAt(i)=='i' && pt.charAt(i+1)=='j') ||  (pt.charAt(i)=='j' && pt.charAt(i+1)=='i'))
            {
                needfiller=true;
                pos=i+1;
                break;
            }
        }
        if(!needfiller && pt.length()%2!=0)
        {
            newpt=pt+'x';
            needfiller=true;
        }
        if(needfiller && pos != pt.length())
        {
            newpt = pt.substring(0,pos)+'x'+pt.substring(pos, pt.length());            
        }

        if(!needfiller)
        newpt=pt;

        //System.out.println(newpt);

        for(int i=0;i<newpt.length()-1;i+=2)
        {
            int [] arr1=findrowcol(arr, newpt.charAt(i));
            int [] arr2=findrowcol(arr, newpt.charAt(i+1));
            if(arr1[1]==arr2[1])
            {
                //int new1=arr1[0]+1;
                //int new2=arr2[0]+1
                //System.out.println(arr1[0]);
                //System.out.println(new1);
                ct+=arr[(arr1[0]+1)%5][arr1[1]];
                ct+=arr[(arr2[0]+1)%5][arr1[1]];
            }
            else if(arr1[0]==arr2[0])
            {
                ct+=arr[arr1[0]][(arr1[1]+1)%5];
                ct+=arr[arr2[0]][(arr2[1]+1)%5];
            }
            else{
            ct+=arr[arr1[0]][arr2[1]];
            ct+=arr[arr2[0]][arr1[1]];
            }
        }
        System.out.println("Cipher text :"+ct);
        //System.out.println(ct);
    }
    int [] findrowcol(char [][] arr, char c)
    {
        int res[]=new int [2];
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(c == 'i')
                c='j';
                if(arr[i][j] == c)
                {
                    res[0]=i;
                    res[1]=j;
                }
            }
        }
        //System.out.println(Arrays.toString(res));
        return res;
    }
}
public class PlayFair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the plaintext :");
        String pt=sc.next();
        System.out.print("Enter the key :");
        String key=sc.next();
        Play obj = new Play(pt,key);
        //System.out.println("vanakkam");
        System.out.println(obj.keycheck());
    }
}
