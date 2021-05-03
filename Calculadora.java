import java.util.Scanner;

public class Calculadora {
        
	/**
	 * Método en el que se calcula la suma de los dos números pasados como parámetros
	 * @param n1 	Primer número introducido por el usuario
	 * @param n2 	Segundo número introducido por el usuario
	 */
    public static  void suma(int n1, int n2) {
        int res = n1 + n2;
        System.out.println("Solucion==> "+n1+" + "+n2+" = "+res);
    }
        
    
    /**
     * Método en el que se calcula la resta de los dos números pasados como parámetros 
     * @param n1	Primer número introducido por el usuario
     * @param n2 	Segundo número introducido por el usuario
     */
    public static  void resta(int n1, int n2) {
        int res = n1 - n2;
        System.out.println("Solucion==> "+n1+" - "+n2+" = "+res);    
    }
    
        
    /**
     * Método en el que se calcula la multiplicación de los dos números pasados como parámetros 
     * @param n1 	Primer número introducido por el usuario
     * @param n2 	Segundo número introducido por el usuario
     */
    public static void multiplicar(int n1, int n2) {
        int res = n1 * n2;
        System.out.println("Solucion==> "+n1+" * "+n2+" = "+res); 
    }
        
    
    /**
     * Método en el que se calcula la división de los dos números pasados como parámetros 
     * @param n1 	Primer número introducido por el usuario
     * @param n2 	Segundo número introducido por el usuario
     */
    public static void dividir(float n1, float n2) {
    	float res = n1 / n2;
        System.out.println("Solucion==> "+n1+" / "+n2+" = "+res);    
    }
    
    
    /**
     * Método en el que se pregunta al usuario si desea salir de la aplicación
     * @return	Retorna un boolean que representa la respuesta introducida 
     */
	public static boolean Salir() {
		Scanner respuesta = new Scanner (System.in);
		System.out.println("Desea salir??(s/n):");
		String salir =  respuesta.nextLine();
		if (salir.equalsIgnoreCase("s")) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
	/**
	 * Método en el que se piden los dos números con los que se van a realizar la/las operaciones deseadas
	 * @return ArrayList en el que están guardados los dos números introducidos por el usuario
	 */
	public static int[] pedirDatos() {
		Scanner scan = new Scanner (System.in);
		
		int [] numeros = new int[2];
		
		System.out.println("Introduzca el primer num: ");
    	int a = scan.nextInt();
    	numeros[0] = a;
    	
    	System.out.println("Introduzca el segundo num: ");
    	int b = scan.nextInt();
    	numeros[1] = b;
    	
    	return numeros;
	}
	
	
	/**
	 * Método en el que se muentra el menú de la calculadora. Las operaciones que se pueden realizar
	 * @param numeros	ArrayList en el que están guardados los números con los que se va a operar
	 */
	public static void menu(int[] numeros) {
		Scanner scan = new Scanner (System.in);
		
		int accion=0;
		
    	System.out.println("===CALCULADORA===");
    	System.out.println("(1) Suma");
    	System.out.println("(2) Resta");
    	System.out.println("(3) Multiplicación");
    	System.out.println("(4) División");
    	System.out.println("(5) Salir");
    	
    	System.out.println("\nElige una de las opciones: ");
    	accion =  scan.nextInt();
        
        switch (accion) {
            case 1:  suma(numeros[0],numeros[1]);
                     break;
            case 2:  resta(numeros[0],numeros[1]);
                     break;
            case 3:  multiplicar(numeros[0],numeros[1]);
            		 break;
            case 4:  dividir(numeros[0],numeros[1]);
            		 break;
            case 5:  Salir();
            		 break;
            default: System.out.println("Escribe un numero del 1 al 5 \n");
            		 break;
        }
	}
	
	

	/**
	 * Método main de la clase
	 * Se piden los datos necesarios para desarrollar correctamente la actividad de la aplucación
	 * @param args
	 */
	public static void main(String[] args) {
    	
    	Scanner scan = new Scanner (System.in);
    	
    	int [] numeros = new int[2];
    	
    	int accion=0;
    	
    	do {
    		numeros = pedirDatos();
    		menu(numeros);
    	}while(Salir()==false );
    }
    	
}