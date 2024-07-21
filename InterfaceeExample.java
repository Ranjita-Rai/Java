

package practice.practice2;
interface calculate{
    void sum(int a,int b);
    void subtract(int a,int b);
    void multiply(int a, int b);
}
class display implements calculate {
    int sum;
    int diff;
    int multiply;
    @Override
    public void sum(int a, int b){
        sum=a+b;
        System.out.println("sum: "+sum);
    }
    @Override
    public void subtract(int a, int b){
        if(a>b){
            diff=a-b;
        }else{
            diff=b-a;
            System.out.println("difference: "+diff);
        }
    }
    @Override
    public void multiply(int a, int b){
        multiply=a*b;
        System.out.println("Multiplication: "+multiply);
    }
    
} 
public class InterfaceeExample {
    public static void main(String[] args){
        display obj= new display();
        obj.sum(5,7);
        obj.subtract(10, 20);
        obj.multiply(12,3);
    }
    
}
