import java.util.*;
public class GradeCalculator{
    public static void main(String[] args) throws Exception {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the number of sujects:");
     int n=sc.nextInt();
     int [] arr=new int[n];
     for(int i=0;i<n;i++)
     {
        System.out.print("Enter the mark of Subject"+(i+1)+":");
        arr[i]=sc.nextInt();
     }
    int tot=0;
    for(int i=0;i<n;i++)
    {
        tot=tot+arr[i];
    }
    double avg=tot/n;
    System.out.println("The average mark of the student :"+avg);
    }
}