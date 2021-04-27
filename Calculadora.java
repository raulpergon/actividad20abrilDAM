public class Calculadora {
        
    
        
    public static  void suma(int n1, int n2) {
        int res = n1 + n2;
        System.out.println("Solucion==> "+n1+" + "+n2+" = "+res);
    }
        
    public static  void resta(int n1, int n2) {
        int res = n1 - n2;
        System.out.println("Solucion==> "+n1+" - "+n2+" = "+res);    }
        
    public static void multiplicar(int n1, int n2) {
        int res = n1 * n2;
        System.out.println("Solucion==> "+n1+" * "+n2+" = "+res); 
    }
        
    public static void dividir(float n1, float n2) {
    	float res = n1 / n2;
        System.out.println("Solucion==> "+n1+" / "+n2+" = "+res);    
        }
    
    
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

	public static void main(String[] args) {
    	
    	Scanner scan = new Scanner (System.in);
    	int accion=0;
    	
    	do {
    	System.out.println("Introduzca el primer num: ");
    	int a = scan.nextInt();
    	
    
    	System.out.println("Introduzca el segundo num: ");
    	int b = scan.nextInt();
    	
    	
    	do {
    		
    	System.out.println("===CALCULADORA===");
    	System.out.println("(1) Suma");
    	System.out.println("(2) Resta");
    	System.out.println("(3) Multiplicación");
    	System.out.println("(4) División");
    	System.out.println("(5) Salir");
    	
    	System.out.println("\nElige una de las opciones: ");
    	accion =  scan.nextInt();
        
        switch (accion) 
        {
            case 1:  suma(a,b);
                     break;
            case 2:  resta(a,b);
                     break;
            case 3:  multiplicar(a,b);
            		 break;
            case 4:  dividir(a,b);
            		 break;
            case 5:  Salir();
            		 break;
            default: System.out.println("Escribe un numero del 1 al 5 \n");
            		 break;
        }
      
		}while(accion < 1 || accion > 5 );
    	
    	
    	}while(Salir()==false );
    }
    	
}