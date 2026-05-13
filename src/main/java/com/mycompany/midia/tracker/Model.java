
package com.mycompany.midia.tracker;

/**
 *
 * @author guil_dev
 */
public class Model {
    
     protected String Nome;
     protected String Tipo;
     protected String Genero;
     protected int Ano;
     protected String Status;
     protected double Nota;
     protected String Comentario;
     
     public String getNome(){
         return Nome;
     }
     public void setNome(String Nome){
         this.Nome = Nome;
     }
     
     public String getTipo(){
         return Tipo;
     }
     public void setTipo(String Tipo){
         this.Tipo = Tipo;
     }
     
     public String getGenero(){
         return Genero;
     }
     public void setGenero(String Genero){
         this.Genero = Genero;
     }
     
     public int getAno(){
         return Ano;
     }
     public void setAno(int Ano){
         this.Ano = Ano;
     }
     
     public String getStatus(){
         return Status;
     }
     public void setStatus(String Status){
         this.Status = Status;
     }
     
     public Double getNota(){
         return Nota;
     }
     public void setNota(Double Nota){
         this.Nota = Nota;
     }
     
     public String getComentario(){
         return Comentario;
     }
     public void setComentario(String Comentario){
         this.Comentario = Comentario;
     }
     
     
     @Override
     public String toString(){
         return "";
     }
}
