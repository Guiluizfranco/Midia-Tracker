/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.midia.tracker;
import java.sql.*;
import java.sql.SQLException;

public class Service {
    
    Model model = new Model();
    
    Conexão_BancoDados conn = new Conexão_BancoDados();
    
    public Model SalvarObjeto(String Nome, String Tipo, String Genero, int Ano, String Status, Double Nota, String Comentario){
        
        model.setNome(Nome);
        model.setTipo(Tipo);
        model.setGenero(Genero);
        model.setAno(Ano);
        model.setStatus(Status);
        model.setNota(Nota);
        model.setComentario(Comentario);
        
        return model;
        
    }
    
    public String CadastrarMidia(String TipoCadastrado){
        
        String validacao = "O(A) "+ TipoCadastrado.toLowerCase() +" foi cadastrado(a) com sucesso";
        
        String sql = "INSERT INTO Midia (Nome, Tipo, Genero, Ano, Status, Nota, Comentario) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?)";

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

        }catch(SQLException e){
            
             validacao = "Não foi possível cadastrar a mídia. Erro:  "+e.getMessage();
             
        }
        
        return validacao;

    }
    
    public String ExcluirMidia(String NomeExclusão){
        
        String validacao = "O(A) "+ NomeExclusão.toLowerCase() + " foi excluido(a) com sucesso";
        
        String sql = "DELETE FROM Midia WHERE Nome = ?";
        
        Connection con = conn.Connection();
        
        try{
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, NomeExclusão);
            
            stmt.executeUpdate();
            
        }catch(SQLException e){
            
            validacao = "Não foi possível excluir o(a) " + NomeExclusão + ". Erro:  " + e.getMessage();              
        }
        
        return validacao;
        
    }
}
