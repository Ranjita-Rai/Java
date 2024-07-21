/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.practice2;
public class ThrowsKeyword {
    static void demo()throws ArithmeticException, NullPointerException{
        int a=10/5;
        System.out.println("Result: "+a);
        String s=null;
        System.out.println(s.toLowerCase());
    }
  public static void main(String[] args){
      try{
          demo();
      } 
      catch(Exception e){
          System.out.println(e);
      }
      System.out.println("rest of the code");
  }  
}
