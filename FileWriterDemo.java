
package practice.practice2;
import java.io.FileWriter;
public class FileWriterDemo {
    public static void main(String[] args){
        try{
            FileWriter fw=new FileWriter("C:/Users/user/Desktop/java/java practical/hello java.txt");
            fw.write("Hello Ranjita");
            fw.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("content write success..");
    }
}
//pahila file ma empy hunxa paxi hello ranjita aauxa.