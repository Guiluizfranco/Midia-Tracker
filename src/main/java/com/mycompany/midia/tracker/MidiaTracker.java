package com.mycompany.midia.tracker;

import java.util.Scanner;

public class MidiaTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean loopMenu = true;
        Service service = new Service();
        
        Conexão_BancoDados conn = new Conexão_BancoDados();
        conn.Connection(); //testar conexão
        
        System.out.println("\n-----Bem vindo-----");
        
        while(loopMenu){
        
        System.out.println("\nDigite a opção que deseja:");
        System.out.println("\n| Cadastrar | Excluir | Listar | Buscar | Sair |");
        String optionMenu = sc.nextLine().toLowerCase();
        
        switch(optionMenu){
            
            case "cadastrar":
                
                boolean loopOptionYN_Cadastrar = true;
                boolean loopRegister = true;
                
                while(loopRegister){
                   
                   try{ 
                    System.out.println("\nDigite o nome da mídia:");
                    String NomeMidia = sc.nextLine();
                    
                    System.out.println("\nDigite o tipo de mídia:");
                    String TipoMidia = sc.nextLine();
                    
                    System.out.println("\nDigite o genero da mídia:");
                    String GeneroMidia = sc.nextLine();
                    
                    System.out.println("\nDigite o ano de lançamento:");
                    String AnoMidia_String = sc.nextLine();
                    
                    int AnoMidia = Integer.parseInt(AnoMidia_String);
                    
                    System.out.println("\nDigite o status (assistido, concluído, abandonado, planejado...) de mídia:");
                    String StatusMidia = sc.nextLine();
                    
                    System.out.println("\nDigite a sua nota da mídia:");
                    String NotaMidia_String = sc.nextLine();
                    
                    double NotaMidia = Double.parseDouble(NotaMidia_String);
                    
                    System.out.println("\nDigite um comentário:");
                    String ComentarioMidia = sc.nextLine();
                    
                    service.SalvarObjeto(NomeMidia, TipoMidia, GeneroMidia, AnoMidia, StatusMidia, NotaMidia, ComentarioMidia);
                    
                    System.out.println(service.CadastrarMidia(TipoMidia));
                   
                    while(loopOptionYN_Cadastrar){
                      
                      System.out.println("\nDeseja continuar cadastrando?");
                      String optionYN = sc.nextLine().toLowerCase();

                      if(optionYN.equals("não")){
                        
                          loopRegister = false;
                          loopOptionYN_Cadastrar = false;
                    
                      }else if(optionYN.equals("sim")){
                        
                        loopOptionYN_Cadastrar = false;
                        
                      }else{
                         
                          System.out.println("Digita uma opção válida");
                          
                      }
                      
                    }
   
                    }catch(NumberFormatException e){
                       System.out.println("Digite um valor válido");         
                    
                    }
                    
                }
                
                break;
            
            case "excluir":
               
               boolean loopExcluir = true;
               boolean loopOptionYN_Excluir = true;
                
               while(loopExcluir){
                   
                   System.out.println("Digite a midia que deseja excluir:");
                
                   String NomeExclusão = sc.nextLine();
                
                   System.out.println(service.ExcluirMidia(NomeExclusão));
                   
                   while(loopOptionYN_Excluir){
                      
                      System.out.println("\nDeseja continuar excluindo?");
                      String optionYN = sc.nextLine().toLowerCase();

                      if(optionYN.equals("não")){
                        
                          loopExcluir = false;
                          loopOptionYN_Excluir = false;
                    
                      }else if(optionYN.equals("sim")){
                        
                        loopOptionYN_Excluir = false;
                        
                      }else{
                         
                          System.out.println("Digita uma opção válida");
                          
                      }
                      
                    }
                   
               } 
                
                
                break;
            
            case "listar":
                
                System.out.println("Funcionalidade em andamento");
                
                break;
                
            case "buscar":
                
                System.out.println("Digite o nome da midia que deseja buscar: ");
                String NomeBuscar = sc.nextLine();
                
                
                
            case "sair":
                
                loopMenu = false;
                break;
                
            default:
                System.out.println("Digite uma opção válida");
          }
        }
    }
}
