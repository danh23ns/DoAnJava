/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loggin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class db {
    public static Connection mycon(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "danhhotboi");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
        
        return con;
    }
}
