/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.practice2;
public class ThrowKeyword {
    public void display(int a){
    if (a<40){
    try{
        throw new ArithmeticException ("Your mark is less than passing mark");
        
    }
    catch(ArithmeticException e){
       System.out.println("Your mark is "+a);
       throw e;
    }           
  }
}
    public static void main(String[] args){
        int mark=20;
        ThrowKeyword obj=new ThrowKeyword();
        try{
            obj.display(mark);
        }catch(ArithmeticException e){
            System.out.println("error recaughted: "+e.getMessage());
        }
    }
  }
    