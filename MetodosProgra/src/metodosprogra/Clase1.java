/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodosprogra;
 

/**
 *
 * @author Yosmeri C. Cruz
 */
public class Clase1 {
    Scanner serie = new Scanner (System.in);
    

 
     public int factorial(int numero){
      int Factorial = 1;
      while(numero !=0){
          Factorial*=numero;
          numero --; 
    } System.out.print("\n el factorial es:"+  Factorial); 
     return 0;
     }
     
     
     
     
     public int tablamul (int numero1){
     
     for (int i=1; i <=10; i++){
      System.out.println(numero1+"*"+i+"="+(numero1*i));
     }
     return numero1;
     }
     
         
         
        
         
    }
     
 

    

