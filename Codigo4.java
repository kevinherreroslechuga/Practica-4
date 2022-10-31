package com.generation;

/*programa para jugar piedra,papel o tijeras 
 * pidinedo en el escaner un string
 * que luego se compara en un if 
 * para el empate y elige al ganador
 *  en un comando switch con las 
 *  tres pricnipales conbinaciones 
 *  ingresando su seleccion cada jugador.
*/
import java.util.*; // importe para usar las clases.

public class Codigo4 {
	
	public static void main(String[] args) {//agregue el public static void 
	  
		System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		Scanner s = new Scanner(System.in);// agregue el system.in
	    String j1 = s.nextLine();
	    
	    System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");// cambia por jugador 2
	    Scanner s2 = new Scanner(System.in);// agregue todos los system.in
	    String j2 = s2.nextLine(); //modifique a s2
	    
	    
	    if (j1.equals( j2)) {//elimine parentesis y cambio a .equals para poder comparar strings
	      System.out.println("Empate");
	    } else {
	      int g = 2;
	      switch (j1) 
	      {
	        case "piedra": 
	          if (j2.equals("tijeras")) {// cambie a .equals 
	            g--;
	            
	          }
	        break;//agregue el break

	        case "papel":
	          if (j2.equals("piedra")) {//cambie a .equals
	            g--;
	          }
	        break;//agregue el break
	        
	        case "tijeras":
	          if (j2.equals("papel")) {
	            g--;
	          }
	          break;
	          
	        default: 
	      }
	    
	      System.out.println("Gana el jugador " + g);
	      
	    }
}  //agregue otra llave para cerrar
}
