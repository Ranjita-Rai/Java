
package javaapplication;

//import java.sql.*;
//import java.util.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//xml file, jdbc driver (jar file) is required.
//to connect with database import package
//java.sql.*;
//steps to connect with database
//1. create a object of Connection
//2. initialize JDBC driver using 
//Class.forName(); it throws ClassNotFoundException
//if driver (jar file) is not found
//3. create a connection with database using
//DriverManager.getConnection("protocol//server:port/database",
//"username","password") and assign to reference
// of Connection
//4. write query. if query is wrong it throws
//sql exception
//5. to check and execute query create Statement object
//Statement st = conn.CreateStatement();
//6. execute query using object of statement
//7. close the connection
class JDBCPractise
{
    Connection conn;
  //  Scanner sc = new Scanner(System.in);
    public void setConn(){
        //1. initialize a driver
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            //2.create database and make connection
            String url="jdbc:mysql://localhost:3306/database2";
             //protocol    server   port    db name
                   String uname="root";
                   String pass="";
              conn=DriverManager.getConnection(url,uname,pass);
               if(conn!=null){
                System.out.println("database connected");
               }
                 //creating table tbl_reg
   Statement st = conn.createStatement();//to execute query
   //write proper query
   String tblQuery="create table tableName("
           + "id int primary key,username varchar(50),"
           + "password varchar(50),repassword varchar(50),"
           + "gender varchar(50),course varchar(50),"
           + "country varchar(50))";
   //executing query
   st.execute(tblQuery); 
            System.out.println("table created");
        }
        catch(ClassNotFoundException c){
            System.out.println(c);
        }catch(SQLException s){
            System.out.println(s);
        }
    }
    public void insertData(){
      try{
  Class.forName("com.mysql.cj.jdbc.Driver");
  String url="jdbc:mysql://localhost:3306/database2";
  String uname="root";
  String pass="";
  conn = DriverManager.getConnection(url,uname,pass);
  //inserting data in database table
  Statement st = conn.createStatement();
  
  String insQuery="insert into tableName"
  + "values(1,'ram','abc','abc','male','bca','nepal')";
  //for multiple data insertion
//  "Insert into tableName values "
//    + "(1, 'raju', 'xyz', 'xyz', 'male', 'bca', 'nepal'),"
//    + "(2, 'bina', 'cde', 'cde', 'female', 'bca', 'nepal'),"
//    + "(3, 'mina', 'pqr', 'pqr', 'female', 'bca', 'India');";

  int res = st.executeUpdate(insQuery);
  if(res>0){
     System.out.println("data inserted");
 }  
 
      }catch(ClassNotFoundException c){
          System.out.println(c);
      }catch(SQLException s){
          System.out.println(s);
      }
    }

    public void displayData(){
        try{
  Class.forName("com.mysql.cj.jdbc.Driver");
  String url="jdbc:mysql://localhost:3306/database2";
  String uname="root";
  String pass="";
  conn = DriverManager.getConnection(url,uname,pass); 
  //fetching data from database
  String disQuery="select * from tableName";
  //display record of person whose id is 1
String disQuery1 ="select * from tableName where id=1";
//display record of person who is from nepal
  String disQuery2="select * from tableName where country='nepal'";
  PreparedStatement ps = conn.prepareStatement(disQuery);
  ResultSet rs = ps.executeQuery();
  while(rs.next()){
      int disId = rs.getInt("id");
      String disUname=rs.getString("username");
      String disPass = rs.getString("password");
      String disRepass=rs.getString("repassword");
      String disGender=rs.getString("gender");
      String disCourse=rs.getString("course");
      String disCountry=rs.getString("country");
      System.out.println("----------");
       System.out.println("id is "+disId+" username is "+
        disUname+" password is "+disPass+" repass is "+
        disRepass+" gender is "+disGender+" course is "+
        disCourse+" country is "+disCountry);
      System.out.println("----------------------");
  }
        }catch(ClassNotFoundException c){
            System.out.println(c);
        }catch(SQLException s){
            System.out.println(s);
        }
    }
    public void updateData(){
    
    try{
  Class.forName("com.mysql.cj.jdbc.Driver");
  String url="jdbc:mysql://localhost:3306/database2";
  String uname="root";
  String pass="";
  conn = DriverManager.getConnection(url,uname,pass); 
  //update name to rama, gender to female and course
  //to csit of person whose id is 1
String updateQuery="update tableName set "
        + "username='rama',gender='female',"
        + "course='csit' where id=1";
PreparedStatement ps = conn.prepareStatement(updateQuery);
int res = ps.executeUpdate();
if(res>0){
    System.out.println("data updated");
}
        
    }catch(ClassNotFoundException c){
        System.out.println(c);
    }catch(SQLException s){
        System.out.println(s);
    }
}
        
        
 public void deleteData(){
     //delete record of person whose id is 1
     try{
  Class.forName("com.mysql.cj.jdbc.Driver");
  String url="jdbc:mysql://localhost:3306/database2";
  String uname="root";
  String pass="";
  conn = DriverManager.getConnection(url,uname,pass);  
  String delQuery="delete from tableName where id=1";
  PreparedStatement ps = 
          conn.prepareStatement(delQuery);
  int res = ps.executeUpdate();
  if(res>0){
      System.out.println("data deleted");
  }
     }catch(ClassNotFoundException c){
         System.out.println(c);
     }catch(SQLException s){
         System.out.println(s);
     }
    }
}

public class JavaApplication {

    public static void main(String[] args) {

        JDBCPractise j1 = new JDBCPractise();
        j1.setConn();
        j1.insertData();
        j1.displayData();
        j1.updateData();
        j1.deleteData();
        j1.displayData();
    }
    
}
