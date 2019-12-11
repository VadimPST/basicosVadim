package Basicos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		logicos();//llamada al metodo de logicos
 
	}
	
	
	public static void logicos() {
		
		boolean variableLogica; //declaracion
		
		
		variableLogica=true;//asignacion de valor
		
		
		imprimeBoolean(variableLogica);//visualizacion mediante metodo creado
		
		
		
		
	}
	
	public static void imprimeBoolean(boolean variable) {
	
		if(variable) {
			System.out.println("la variable boolenana es TRUE");
		}else {
			System.out.println("la variable boolenana es FALSE");
		}
		
		
	}
	
	

}
