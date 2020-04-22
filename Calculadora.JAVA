package calculadora;

import java.util.Scanner; 

public class Calculadora { 
 
    public static void main(String[] args) {
    Integer a;             
    	 Integer b;             
    	 Integer opcion;             
    	 Integer resultado;
    }



	private Integer resultado;

	

		public Integer iniciarCalculadora(Integer a, Integer b, Integer opcion) {
    		System.out.println("Ingrese su operación /n 1 para sumar /n 2 para restar /n 3 para multiplicar /n 4 para dividir");             
    		Scanner teclado = null;
			opcion = teclado.nextInt();             
     
    		switch (opcion) {
    		case 1:
    			this.resultado=a+b;
    			break;
    		case 2:
    			resultado=a-b;
    			break;
    		case 3:
    			resultado=a*b;
    			break;
    		case 4:
    			resultado=a/b;
    			break;
    		default:
    			System.out.println("No es una operación válida");
    		}
    		

    		    System.out.println("El resultado es " + resultado.toString());  
    	return this.resultado;	    
    }
		public Integer dividir (Integer a, Integer b) {
			System.out.println("Ingrese el primer numero");             
        	Scanner teclado = null;
			a = teclado.nextInt();             
        	System.out.println("Ingrese el segundo numero");            
        	b = teclado.nextInt();
        	Integer resultado= a/b;
     
		
		return this.resultado;
		}
		
		public Integer multiplicar (Integer a, Integer b) {
			System.out.println("Ingrese el primer numero");             
        	Scanner teclado = null;
			a = teclado.nextInt();             
        	System.out.println("Ingrese el segundo numero");            
        	b = teclado.nextInt();
        	Integer resultado= a*b;
     
		
		return this.resultado;
		}
		
		public Integer sumar (Integer a, Integer b) {
			System.out.println("Ingrese el primer numero");             
        	Scanner teclado = null;
			a = teclado.nextInt();             
        	System.out.println("Ingrese el segundo numero");            
        	b = teclado.nextInt();
        	Integer resultado= a+b;
     
		
		return this.resultado;
		}
		
		public Integer restar (Integer a, Integer b) {
			System.out.println("Ingrese el primer numero");             
        	Scanner teclado = null;
			a = teclado.nextInt();             
        	System.out.println("Ingrese el segundo numero");            
        	b = teclado.nextInt();
        	Integer resultado= a-b;
     
		
		return this.resultado;
		}
	