package Basicos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		numericos();  // Llamada al m�todo

	}
	
	
	public static void numericos() {

        //Estos son los tipos b�sicos
        byte elMasPeque;
        short chiquitin;
        int entero;
        long duplicaEntero;
        float grande;
        double doble;

        //Ejemplos de asignaci�n de valores a las variables de tipos b�sicos
        elMasPeque=2;
        chiquitin=4;
        entero = 10;
        duplicaEntero=20;
        grande=5.80f;
        doble = 5.6;
        //mas detalle
        //Mostrar en pantalla el contendido de las variables de tipos b�sicos.
        System.out.print("Valor byte ");
        System.out.println(elMasPeque);
        System.out.print("Valor short ");
        System.out.println(chiquitin);       
        System.out.print("Valor entero ");
        System.out.println(entero);       
        System.out.print("Valor long ");
        System.out.println(duplicaEntero);        
        System.out.print("Valor float ");
        System.out.println(grande);
        System.out.print("Valor doble ");
        System.out.println(doble);
    }

}
