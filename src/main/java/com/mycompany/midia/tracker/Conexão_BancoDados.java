
package com.mycompany.midia.tracker;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Conexão_BancoDados {
    
    public Connection Connection(){
      
      String url = "jdbc:mysql://localhost:3306/Midias";
      String usuario = "root";
      String senha = "SUA SENHA";
      
      Connection conn = null;
      
        try{
    
        conn = DriverManager.getConnection(url, usuario, senha);
        
        System.out.println("Conexão realizada com sucesso");
        
         }catch(SQLException e){
          
              System.out.println("Falha na conexão com banco dados"+ e.getMessage());
         } 
      
        return conn;
    }
    
}
