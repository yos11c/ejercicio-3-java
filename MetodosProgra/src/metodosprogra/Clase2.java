/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodosprogra;


/**
 *
 * @author Yosmeri C. Cruz
 */
public class Clase2 {
    
 public int dia(int dia){
     
    switch (dia){
        case 1:
             System.out.print("Hoy es domingo, hoy no se trabaja");
            break;
            case 2:
             System.out.print("Hoy es lunes,se trabaja");
               break;
               case 3:
             System.out.print("Hoy es martes, se trabaja");
              break;
               case 4:
            System.out.print("Hoy es miercoles,se trabaja");
              break;
               case 5:
             System.out.print("Hoy es jueves,se trabaja");
              break;
               case 6:
             System.out.print("Hoy es viernes, se trabaja");
              break;
            case 7:
             System.out.print("Hoy es sabado , hoy no se trabaja");
            
            default: System.out.println("SALIENDO...");
            
    }
        return dia;
 }
    }

     

    
    
