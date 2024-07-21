
package practice.practice2;

import java.io.*;
public class FileReaderDemo {
    public static void main(String[] args) throws IOException{
        FileReader fr=new FileReader("C:/Users/user/Desktop/java/java practical/hello bca 3rd.txt.txt");
        BufferedReader br=new BufferedReader(fr);
        String s;
        while ((s=br.readLine())!=null){
            System.out.println(s);
        }
        fr.close();
    }
}

//hello bca 3rd file ma hello world pahilai lekhiyeko thiyo thats why output ma hello world aayo
//feri tyo file open garda tyo erase vaisakeko hunxa.


/////yo chai file reader ko example ho