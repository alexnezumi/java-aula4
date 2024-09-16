
package main;

import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
      Scanner grava = new Scanner(System.in);
      int valor = 0;
      int resp=0;
      System.out.println("A.Quem declarou a republica do Brasil? \n "
              + "1) Marechal Deodoro  \n " + "2) Jair Messias \n " + "3) Marechal Peixoto \n" + " 4) Dom Pedro II ");
      valor = grava.nextInt();
      
      if (valor==1){
       
      resp++;
      }
       System.out.println("B.Em que ano Joana D`arc morreu ?  \n "
              + "1) 1478  \n " + "2) 1435 \n " + "3) 1500 \n" + " 4) 1431 ");
      valor = grava.nextInt();
      
      if (valor==4){
      resp++;
      }
       System.out.println("C.Qual foi a principal causa da Segunda Guerra Mundial? \n "
              + "1) A crise econômica de 1929  \n " + "2) Invasão da Polônia pela Alemanha \n " + "3) A revolução Russa \n" + " 4) O tratado de Versalhes");
      valor = grava.nextInt();
      
      if (valor==2){
      resp++;
      }
       System.out.println("D.Qual tratado encerrou a primeira Guerra Mundial? \n "
              + "1) Tratado de Versalhes  \n " + "2) Tratado de Tordesilhas \n " + "3) Tratado de París \n" + " 4) Tratado de Utrecht ");
      valor = grava.nextInt();
      
      if (valor==1){
      resp++;
      }
       System.out.println("E. Qual império foi responsável pela construção da cidade de Machu Picchu? \n "
              + "1) Olmeca  \n " + "2) Inca \n " + "3) Maia \n" + " 4) Asteca ");
      valor = grava.nextInt();
      
      if (valor==2){
      resp++;
      }
       System.out.println("F.Em que ano ocorreu a guerra dos 100 anos? \n "
              + "1) 1066-1166  \n " + "2) 1215-1315 \n " + "3) 1337-1453 \n" + " 4) 1492-1592 ");
      valor = grava.nextInt();
      
      if (valor==3){
      resp++;
      }
       System.out.println("G.Qual foi o primeiro país a abolir a escravidão? \n "
              + "1) EUA  \n " + "2) Brasil \n " + "3) Reino Unido \n" + " 4) Haiti ");
      valor = grava.nextInt();
      
      if (valor==4){
      resp++;
      }
       System.out.println("H.Qual país foi pioneiro nas grandes navegações no século XV? \n "
              + "1) França\n " + "2) Portugal \n " + "3) Espanha \n" + " 4) Inglaterra ");
      valor = grava.nextInt();
      
      if (valor==2){
      resp++;
      }
       System.out.println("I.Qual líder Egípvio foi conhecido por tentar introduzir o monoteísmo no Egito antigo? \n "
              + "1) Ramsés II  \n " + "2) Tutancâmon \n " + "3) Akhenaton \n" + " 4) Cleópatra ");
      valor = grava.nextInt();
      
      if (valor==3){
      resp++;
      }
       System.out.println("J.Em que ano acabou a Segunda Guerra Mundial? \n "
              + "1) 1937  \n " + "2) 1940 \n " + "3) 1949 \n" + " 4) 1945 ");
      valor = grava.nextInt();
      
      if (valor==4){
      resp++;
      }
      
    if (resp <= 3){ 
    System.out.println("Precisa estudar mais, não sabe sobre o assunto");
    }else if (resp >= 4 && resp <=6 ){
        System.out.println(resp);
      System.out.println("Pontuação boa mas precisa melhorar")  ; 
    }else if (resp >= 7 && resp <=9 ){
        System.out.println(resp);
      System.out.println("Quase gabaritou , parabéns!1")  ;
    }else{
        System.out.println(resp);
        System.out.println("Você tem dominio sobre o assunto!!!");
       
    }
    }

    }