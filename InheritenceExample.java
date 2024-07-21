
package practice.practice2;

class A{
    public void show(){
        System.out.println("Drawing A");
    
}
}
  class B extends A{
      @Override
      public void show(){
          super.show(); //super keyword used for calling method 
          System.out.println("Drawing B");
      }
    
  }
public class InheritenceExample {
    public static void main(String[] agrs){
        B obj =new B();
        obj.show();
    }
    
}
