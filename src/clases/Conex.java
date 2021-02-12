/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sonny
 */
public class Conex {
     
    private Connection con;
    
    public static Connection getConnection(){
        String url="";
        String server = "localhost";
        String insSql = "";
        Connection con = null;
        //puerto="1433"; // puerto de SQL Server
        String puerto="3306"; // puert de mysql
        String bd="bdavicola";
        //user="sa";  // usuario de SqlServer
        String user="root";  // usuario de MySql
        //pwd = "joelfc61";  //password de Mysql
        String pwd = "joelfc61";  // password de SqlServer
        //driver="com.microsoft.sqlserver.jdbc.SQLServerDriver"; // Driver de SqlServer
        String driver="com.mysql.jdbc.Driver";  //Driver de mysql
    
        if(insSql.trim().length() ==0){
          //url ="jdbc:sqlserver://" +server +";databaseName="+bd;   77  connectionString de SqlServer
           url = "jdbc:mysql://"+server+"/" +bd;            // ConnectionString de Mysql
        }else{
            //url ="jdbc:sqlserver://" +server +"\\"+insSql+":" +puerto +";databaseName="+bd;
             url="jdbc:mysql://"+server+"/" +bd;
        }
     
       // System.out.println(url);
        
        try {
            Class.forName(driver);
              con = DriverManager.getConnection(url,user,pwd);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error a: " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Error b: " + ex.getMessage());
        }
        
            return con;
        }  
}
