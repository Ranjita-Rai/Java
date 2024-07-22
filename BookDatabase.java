//JDBC Crud operation 
package javaapplication;

import java.sql.*;
class JDBCPractice
{
    Connection conn;
  //  Scanner sc = new Scanner(System.in);
    public void setConn(){
        //1. initialize a driver
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            //2.create database and make connection
            String url="jdbc:mysql://localhost:3306/library";
                      // protocol    server   port   db name
                   String uname="root";
                   String pass="";
              conn=DriverManager.getConnection(url,uname,pass);
               if(conn!=null){
                System.out.println("database connected");
               }
                  Statement st = conn.createStatement();//to execute query
   //write proper query
   String tblQuery="create table tableName("
           + "BookId int primary key,BookTitle varchar(30),"
           + "Author varchar(20),Genre varchar(20))";
   //executing query
   st.execute(tblQuery); 
            System.out.println("table created");

        }catch(ClassNotFoundException c){
            System.out.println(c);
        }catch(SQLException s){
            System.out.println(s);
        }
 }
    public void insertData(){
      try{
  Class.forName("com.mysql.cj.jdbc.Driver");
  String url="jdbc:mysql://localhost:3306/library";
  String uname="root";
  String pass="";
  conn = DriverManager.getConnection(url,uname,pass);
  //inserting data in database table
  Statement st = conn.createStatement();
  
  String insQuery = "Insert into book values "
    + "(1, 'A', 'XY', 'fiction'),"
    + "(2, 'B', 'YZ', 'Non-fiction'),"
    + "(3, 'C', 'AB', 'fiction'),"
    + "(4, 'D', 'PQ', 'Non-fiction'),"
    + "(5, 'E', 'RS', 'Non-fiction'),"
    + "(6, 'F', 'UV', 'fiction'),"
    + "(7, 'G', 'WX', 'fiction'),"
    + "(8, 'H', 'DE', 'Non-fiction'),"
    + "(9, 'I', 'GH', 'Non-fiction'),"
    + "(10, 'J', 'MN', 'fiction');";


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
  String url="jdbc:mysql://localhost:3306/library";
  String uname="root";
  String pass="";
  conn = DriverManager.getConnection(url,uname,pass); 
  //fetching data from database
//display record of a book whose genre is fictiom
  String disQuery="select * from book where Genre='fiction'";
  PreparedStatement ps = conn.prepareStatement(disQuery);
  ResultSet rs = ps.executeQuery();
  while(rs.next()){
      int disId = rs.getInt("BookId");
      String disBookTitle=rs.getString("BookTitle");
      String disAuthor = rs.getString("Author");
      String disGenre=rs.getString("Genre");
      
       System.out.println("id is "+disId+" BookTitle is "+
        disBookTitle+" Author is "+disAuthor+" Genre is "+
        disGenre);
      System.out.println(" ");
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
  String url="jdbc:mysql://localhost:3306/library";
  String uname="root";
  String pass="";
  conn = DriverManager.getConnection(url,uname,pass); 
  //updating the booktitle,author,and genre where id=5
String updateQuery="update book set "
        + "BookTitle='P',Author='ST',"
        + "Genre='Fiction' where id=5";
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
  String url="jdbc:mysql://localhost:3306/library";
  String uname="root";
  String pass="";
  conn = DriverManager.getConnection(url,uname,pass);  
  String delQuery="delete from book where BookId= 1";
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
public class BookDatabase {
    public static void main(String[] args){
        JDBCPractice obj = new JDBCPractice();
       obj.setConn();
       obj.insertData();
        obj.displayData();
        obj.updateData();
        obj.deleteData();

    }
}
