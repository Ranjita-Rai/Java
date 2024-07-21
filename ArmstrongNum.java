
//Program to test number is armstrong or not
package practice.practice2;
import java.util.Scanner;
public class ArmstrongNum {
    public static void main(String[] args){
        
         int d,num,n,sum=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter any three digit integer to test for armstrong number or not: ");
         n=scan.nextInt();
         num=n;

        while(n!=0){
            d=n%10;
            sum=sum+(d*d*d);
            n=n/10;
        }
        if (num==sum){
            System.out.println("The given number "+num+" is armstrong number");
        }else{
            System.out.println("The given number: "+num+" is not armstrong number");
        }
    }
}
