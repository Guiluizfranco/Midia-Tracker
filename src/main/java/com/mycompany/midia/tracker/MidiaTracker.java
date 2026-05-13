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
        System.out.println("\n| Cadastrar | Excluir | Listar | Sair |");
        String optionMenu = sc.nextLine().toLowerCase();
        
        switch(optionMenu){
            
            case "cadastrar":
                
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
                    
                    service.CadastrarMidia();
                    
                    System.out.println("\nDeseja continuar cadastrando?");
                    String optionYN = sc.nextLine().toLowerCase();

                    if(optionYN.equals("não")){
                        loopRegister = false;
                    }
   
                    }catch(NumberFormatException e){
                       System.out.println("Insira um valor válido");         
                    }
                    
                }
                
                break;
            
            case "excluir":
                
                System.out.println("2");
                
                break;
            
            case "listar":
                
                System.out.println("3");
                
                break;
                
            case "sair":
                
                loopMenu = false;
                break;
                
            default:
                System.out.println("Digite uma opção válida");
          }
        }
    }
}
