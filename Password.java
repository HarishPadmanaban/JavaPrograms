import java.util.*;
class Generation{
    public void numberGeneration(int a[],int l)
    {
        Random ra=new Random();
        while(l>0){
        int nnn=ra.nextInt(a.length);
        System.out.print((char)a[nnn]);
        l--;
        }
    }
    public void specialCharacterGeneration(int []a,int l)
    {
        Random ra=new Random();
        while(l>0){
        int nnn=ra.nextInt(a.length);
        System.out.print((char)a[nnn]);
        l--;}
    }
    public void lowerCaseGeneration(int []a,int l)
    {
        Random ra=new Random();
        while(l>0){
        int nnn=ra.nextInt(a.length);
        System.out.print((char)a[nnn]);
        l--;}
    }
    public void upperCaseGeneration(int []a,int l)
    {
        Random ra=new Random();
        while(l>0){
        int nnn=ra.nextInt(a.length);
        System.out.print((char)a[nnn]);
        l--;}
    }
        public void gen(int l)
        {
            Random r=new Random();
       int a[]=new int[l];
       int i=0;
       while(i<l)
       {
         int num=r.nextInt(122);
         if(num>32)
         {
             a[i]=num;
             i++;
         }     
       }
       for(int j=0;j<l;j++)
       {
            System.out.print((char)a[j]);
       }
 }
}
    

public class Password {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Generation obj=new Generation();
        int []lcarray=new int[26];
        int []ucarray=new int[26];
        for(int i=65,j=0;i<91;i++,j++)
        {
            ucarray[j]=i;
        }
        for(int i=97,j=0;i<123;i++,j++)
        {
            lcarray[j]=i;
        }
        int []sparray={33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,58,59,60,61,62,63,64};
        int []numberarray={48,49,50,51,52,53,54,55,56,57};
        System.out.print("Enter length of password:");
        int n=sc.nextInt();
        if(n<8){
        System.out.println("Enter a valid length.");
    System.exit(0);}
        System.out.print("whether it can contain numbers(1/0):");
        int contnumber=sc.nextInt();
        System.out.print("whether it can contain lowercase alphabets(1/0):");
        int contlalpha=sc.nextInt();
        System.out.print("whether it can contain uppercase alphabets(1/0):");
        int contualpha=sc.nextInt();
        System.out.print("whether it can contain special characters(1/0):");
        int contspecialc=sc.nextInt();
        int executed=0;
        System.out.print("The generated password is:");
        if(contnumber==1 && contlalpha==1 && contualpha==1 && contspecialc==1)
        {
            obj.gen(n);
            executed=1;
        }
        if(contnumber==1 && contlalpha==1 && contualpha==1 && executed==0)
        {
            int times=n/3;
            obj.numberGeneration(numberarray, times);
            obj.upperCaseGeneration(ucarray,times);
            obj.lowerCaseGeneration(lcarray,times);
            int f=times*3;
            if(n!=f)
            {
            obj.numberGeneration(numberarray, n-f);
            }
            executed=1;
        }      
        if(contnumber==1 && contlalpha==1 && contspecialc==1 && executed==0)
        {
            int times=n/3;
            obj.numberGeneration(numberarray, times);
            obj.lowerCaseGeneration(lcarray,times);
            obj.specialCharacterGeneration(sparray,times);
            int f=times*3;
            if(n!=f)
            {
            obj.numberGeneration(numberarray, n-f);
            }
            executed=1;
        }
        if(contnumber==1 && contualpha==1 && contspecialc==1 && executed==0)
        {
            int times=n/3;
            obj.numberGeneration(numberarray, times);
            obj.upperCaseGeneration(ucarray,times);
            obj.specialCharacterGeneration(sparray,times);
            int f=times*3;
            if(n!=f)
            {
            obj.numberGeneration(numberarray, n-f);
            }
            executed=1;
        }
        if(contualpha==1 && contlalpha==1 && contspecialc==1 && executed==0)
        {
            int times=n/3;
            obj.lowerCaseGeneration(lcarray,times);
            obj.upperCaseGeneration(ucarray,times);
            obj.specialCharacterGeneration(numberarray,times);
            int f=times*3;
            if(n!=f)
            {
            obj.specialCharacterGeneration(sparray, n-f);
            }
            executed=1;
        }
        if(contnumber==1 && contlalpha==1 && executed==0 )
        {
            int times=n/2;
            obj.numberGeneration(numberarray, times);
            obj.lowerCaseGeneration(lcarray,times);
            int f=times*2;
            if(n!=f)
            {
                obj.numberGeneration(numberarray, n-f);
            }
            executed=1;
        }
        if(contnumber==1 && contualpha==1 && executed==0)
        {
            int times=n/2;
            obj.numberGeneration(numberarray, times);
            obj.upperCaseGeneration(ucarray,times);
            int f=times*2;
            if(n!=f)
            {
                obj.numberGeneration(numberarray, n-f);
            }
            executed=1;
        }
        if(contnumber==1 && contspecialc==1 && executed==0)
        {
            int times=n/2;
            obj.numberGeneration(numberarray, times);
            obj.specialCharacterGeneration(sparray,times);
            int f=times*2;
            if(n!=f)
            {
                obj.numberGeneration(numberarray, n-f);
            }
            executed=1;
            
        }
        if(contlalpha==1 && contualpha==1 && executed==0)
        {
            int times=n/2;
            obj.lowerCaseGeneration(lcarray,times);
            obj.upperCaseGeneration(ucarray,times);
            int f=times*2;
            if(n!=f)
            {
                obj.lowerCaseGeneration(lcarray,n-f);
            }
            executed=1;
        }
        if(contlalpha==1 && contspecialc==1 && executed==0)
        {
            int times=n/2;
            obj.lowerCaseGeneration(lcarray,times);
            obj.specialCharacterGeneration(sparray,times);
            int f=times*2;
            if(n!=f)
            {
                obj.lowerCaseGeneration(lcarray,n-f);
            }
            executed=1;
        }
        if(contualpha==1 && contspecialc==1 && executed==0)
        {
            int times=n/2;
            obj.upperCaseGeneration(ucarray,times);
            obj.specialCharacterGeneration(sparray,times);
            int f=times*2;
            if(n!=f)
            {
                obj.upperCaseGeneration(ucarray,n-f);
            }
            executed=1;
        }
        if(contnumber==1 && executed==0)
        {
            obj.numberGeneration(numberarray, n);
            executed=1;
        }
        if(contlalpha==1 && executed==0)
        {
            obj.lowerCaseGeneration(lcarray,n);
            executed=1;
        }
        if(contualpha==1 && executed==0)
        {
            obj.upperCaseGeneration(ucarray,n);
            executed=1;
        }
        if(contspecialc==1 && executed==0)
        {
            obj.specialCharacterGeneration(sparray, n);
            executed=1;
        }
    }
}

