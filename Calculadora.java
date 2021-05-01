

import java.util.Scanner;
/**
* @author LuisCasCor
* @version 1.0
* Clase que realiza el funcionamiento de una calculadora con sus operaciones b√°sicas
*/
public class Calculadora {

	
	static int n1=0;
	static int n2=0;
	static int opcion;
	static String respuesta="";
	public static void main(String[] args) {
		
		Menu();
				
	}
	
	public static  void Menu() {
		Scanner sc =new Scanner(System.in);
		
		do {
			System.out.println("Elija una opciÛn \n1) sumar \n2) restar \n3) multiplicar \n4) dividir"); //se muestran por pantalla las opciones disponibles
			Scanner op =new Scanner(System.in);
		    System.out.println("Introduzca un numero");
		    opcion=op.nextInt();
			switch(opcion) {
			case 1: //caso en el que se piden 2 numeros y se realiza la suma
				System.out.println("Introduzca el primer numero");
				n1=sc.nextInt();
				System.out.println("Introduzca el segundo numero");
				n2=sc.nextInt();
		        int suma=n1+n2;
		        System.out.println("La suma de "+n1+"+"+n2+"="+suma);
				break;
			case 2: //caso en el que se piden 2 numeros y se realiza la resta
				System.out.println("Introduzca el primer numero");
				n1=sc.nextInt();
				System.out.println("Introduzca el segundo numero");
				n2=sc.nextInt();
		        int resta=n1-n2;
	        	System.out.println("La resta de "+n1+"-"+n2+"="+resta);
				break;
			case 3: //caso en el que se piden 2 numeros y se realiza la multiplicacion
				System.out.println("Introduzca el primer numero");
				n1=sc.nextInt();
				System.out.println("Introduzca el segundo numero");
				n2=sc.nextInt();
				int multiplicacion=n1*n2;
	        	System.out.println("La multiplicaci√≥n de "+n1+"*"+n2+"="+multiplicacion);
				break;
			case 4: //caso en el que se piden 2 numeros y se realiza la division
				System.out.println("Introduzca el primer numero");
				n1=sc.nextInt();
				System.out.println("Introduzca el segundo numero");
				n2=sc.nextInt();
				if(n2==0) {
	     	    	System.out.println("No se puede dividir entre 0");
	        	}else {
		    	    float division=n1/n2;
			        System.out.println("La division de "+n1+"/"+n2+"="+division);
		        }
			    break;
			default :
				System.out.println("La opci√≥n seleccionada es erronea");
			}
			Salir();
			
			
			
		}while(respuesta.equalsIgnoreCase("s"));
	}
	
	public static void Salir() {
		Scanner sc2 =new Scanner(System.in);
		do {
			System.out.println("Desea realizar otra operaciÛn (S/N)");
			respuesta=sc2.nextLine();
			if(!respuesta.equalsIgnoreCase("s") && !respuesta.equalsIgnoreCase("n")) {
				System.out.println("Error, escriba S o N");
			}
		}while(!respuesta.equalsIgnoreCase("s") && !respuesta.equalsIgnoreCase("n"));
	}
	
}