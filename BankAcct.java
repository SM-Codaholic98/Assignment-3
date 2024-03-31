import java.util.*;
public class BankAcct{
    class Interest{
        Scanner sc = new Scanner(System.in);
        double p, r, t, si;

        void func01(){
            System.out.print("Enter the principal amount : ");
            p =sc.nextDouble();
            System.out.print("Enter the rate of interest : ");
            r = sc.nextDouble();
            System.out.print("Enter the time period : ");
            t = sc.nextDouble();
            si = (p * r * t)/100;
            System.out.printf("Simple Interest = %.2f", si);
        }

        void func02(double p, double r, double t){
            this.p = p; this.r = r; this.t = t;
            si = (this.p * this.r * this.t)/100;
            System.out.println("Simple Interest = " + si);
        }

        Interest(){
            System.out.print("Enter the principal amount : ");
            p =sc.nextDouble();
            System.out.print("Enter the rate of interest : ");
            r = sc.nextDouble();
            System.out.print("Enter the time period : ");
            t = sc.nextDouble();
            si = (p * r * t)/100;
            System.out.printf("Simple Interest = %.2f", si);
        }
    }
    public static void main(String[] args){
        Interest i = new BankAcct().new Interest();
        System.out.println();
        System.out.println();
        i.func01();
        System.out.println();
        System.out.println();
        i.func02(5000, 2.75, 3);
    }    
}