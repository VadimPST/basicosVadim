package Basicos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		numericos();  // Llamada al método

	}
	
	
	public static void numericos() {

        //Estos son los tipos básicos
        byte elMasPeque;
        short chiquitin;
        int entero;
        long duplicaEntero;
        float grande;
        double doble;

        //Ejemplos de asignación de valores a las variables de tipos básicos
        entero = 10;
        doble = 5.6;
        //mas detalle
        //Mostrar en pantalla el contendido de las variables de tipos básicos.
        System.err.print("Valor entero ");
        System.out.println(entero);
        System.out.print("Valor doble ");
        System.out.println(doble);
    }

}
