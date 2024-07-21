
package practice.practice2;
import java.util.Scanner;
public class PalindromeNum {
    public static void main(String[] args){
        int n,num,digit,rev=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number: ");
        n=scan.nextInt();
        num=n;
        while(n>0){
            digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        if (num==rev){
            System.out.println("The given number "+num+" is a palindrome number");
        }else{
            System.out.println("The given number "+num+" is not a palindrome number");

        }
    }
}
