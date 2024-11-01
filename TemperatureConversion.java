import java.util.*; 
class Temp{
    public void FtoC(double f)
    {
        double res=(f-32)*5/9;
        System.out.println("The temperature in Celcius:"+res+"");
    }
    public void CtoF(double c)
    {
        double res=(c*9/5)+32;
        System.out.println("The temperature in Fahrenhiet:"+res);
    }
}
public class TemperatureConversion{
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        Temp obj=new Temp();
        int opt,it;
        do{
            System.out.println("***********TEMPERATURE CONVERSION****************");
            System.out.println("Enter the Conversion method");
            System.out.println("1.Fahrenheit to Celcius");
            System.out.println("2.Celcius to Fahrenheit");
            System.out.print("Enter the option:");
            opt=sc.nextInt();
            switch (opt) {
                case 1:
                    System.out.print("Enter the Temperture interms of Fahrenheit:");
                    double fah=sc.nextDouble();
                    System.out.print("Enter the measurement units(C/F):");
                    char st=sc.next().charAt(0);
                    if(st =='F'){
                    obj.FtoC(fah);     }  
                    else
                    System.out.println("Enter the valid measurements.");             
                    break;
                case 2:
                    System.out.print("Enter the Temperture interms of Celcius:");
                    double cel=sc.nextDouble();
                    System.out.print("Enter the measurement units(C/F):");
                    char sr=sc.next().charAt(0);
                    if(sr =='C'){
                    obj.CtoF(cel);}
                    else
                    System.out.println("Enter the valid measurements.");
                    break;
                default:
                    break;
            }
        System.out.print("Do you want to continue(1/0):");
        it=sc.nextInt();
        }while(it==1);
    }
}
