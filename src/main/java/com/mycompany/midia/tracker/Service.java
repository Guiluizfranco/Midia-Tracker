/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.midia.tracker;
import java.sql.*;
import java.sql.SQLException;

public class Service {
    
    Model model = new Model();
    
    public void SalvarObjeto(String Nome, String Tipo, String Genero, int Ano, String Status, Double Nota, String Comentario){
        
        model.setNome(Nome);
        model.setTipo(Tipo);
        model.setGenero(Genero);
        model.setAno(Ano);
        model.setStatus(Status);
        model.setNota(Nota);
        model.setComentario(Comentario);
        
    }
    
    public void CadastrarMidia(){

        String sql = "INSERT INTO Midia (Nome, Tipo, Genero, Ano, Status, Nota, Comentario) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        
        
        Conexão_BancoDados conn = new Conexão_BancoDados();
        
        try{
            
           Connection con = conn.Connection();

           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setString(1, model.getNome());
           stmt.setString(2, model.getTipo());
           stmt.setString(3, model.getGenero());
           stmt.setInt(4, model.getAno());
           stmt.setString(5, model.getStatus());
           stmt.setDouble(6, model.getNota());
           stmt.setString(7, model.getComentario());
           
           stmt.executeUpdate();
           
           System.out.print("Midia cadastrada com sucesso!");
            
        }catch(SQLException e){
            
            System.out.println("Não foi possível cadastrar a mídia." + e.getMessage());
            
        }    

    }
}
