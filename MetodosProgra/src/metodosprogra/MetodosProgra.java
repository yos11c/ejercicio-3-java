/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodosprogra;

/**
 *
 * @author Yosmeri C. Cruz
 */
public class MetodosProgra {
    static  Scanner Scanner=new Scanner (System.in);

    
   
    public static void main(String[] args) {
       int opcion=0;
        do  {
            
     
    System.out.print("\n *****Bienvenido, eliga una opcion: ******");
    System.out.print("\n****1. factorial ****");
    System.out.print("\n ****2. tabla de multiplicar****");
    System.out.print("\n ****3. pares e impares***");
    System.out.print("\n ****4. dia de la semana****");

     System.out.print("\n Eliga una opcion ");
       opcion=Scanner.nextInt();
        Clase1 metodo;
           metodo = new Clase1();
       Clase2 objetoDos = new Clase2();
      
       
      switch(opcion){
               
         case 1 : 
             System.out.print("Ingrese un numero");
             int numer = Scanner.nextInt();
            System.out.println ( metodo.factorial(numer));
            break ;
          
         case 2 :
            System.out.print ("Ingrese un numero");
            int golpe = Scanner.nextInt();
            System.out.println (metodo.tablamul(golpe));
            break;
            
        
          case 4 :
                  System.out.print("Ingrese un dia");
                  int uno= Scanner.nextInt();
                  System.out.print(""+objetoDos.dia(uno));
    
     break;  
     
         }      } while (opcion !=5);


    
 }
      }
    

