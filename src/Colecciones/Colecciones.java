package Colecciones;

import java.util.Set; //papa
import java.util.HashSet; //hijo


public class Colecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instanciando un espacio donde guardar objetos
		//Set<String> cartasDeJuego = new HashSet<>();
		
		//Declarando mi primer arreglo de Java []
		//Primero el tipo de dat que voy a almacenar, despues el nombre de mi arreglo y por ultimo la instancia mi arreglo.
		
		String[] listaCompras = new String[] {"leche", "pan", "frutas"};
		
		//Impresion de mi array
		System.out.println(listaCompras);
		
		//forEach para imprimir cada elemento de mi lista de compras
		//para nuestros datos del tipo String, que se almacenan en una variable temporal llamada ProductoTemporal, que se esta llenando de un arreglo llamado listaCompras, vas a imprimir ese productoTempral
		for(String productoTemporal : listaCompras) {
			System.out.println(productoTemporal);
		}
		
		//Declaro mi Arreglo de habitaciones de un hotel
		String[] habitaciones = new String[10];
		
		//Inicializco o asigno valores a cada indice
		habitaciones[0] = "101";
		habitaciones[1] = "102";
		habitaciones[2] = "103";
		habitaciones[3] = "104";
		habitaciones[4] = "105";
		habitaciones[5] = "106";
		habitaciones[6] = "107";
		habitaciones[8] = "109";
		habitaciones[9] = "110";
		
		/*habitaciones[10] = "111"; Si tratamos de acceder a un elemento mas alla de los elementos declaradosal principio, tendremos una excepcion que solo veremos cuando se ejecute el programa.*/
		
		//Cuando imprimimon un elemento que no esta definido dentro del arreglo, veremos un null. Esto pasa porque para JAVA es preferible tener un elemento nulo a un indefinido. 
		System.out.println(habitaciones[8]);
		
		//En caso de querer usar un for each para imprimir los elementos, solo se imprimiran 7 elementos. (Solo itera sobre los elementos existentes).
		for(String habitacionTemporal : habitaciones) {
			System.out.println(habitacionTemporal);
		}
		
		

	}

}


/*

Colecciones

-Arrays

Un array es una estructura de datos linea que contiene elementos del mismo tipo. La longitud de un array se establece al momento de crearlo y no puede cambiar. No cuenta con metodos adicionales para agregar o eliminar elementos. Los elementos estan almacenados de forma contigua en memoria, y se puede acceder a ellos a traves de un indice. Sus principales caracteristicas son:

	1. Tamanio fijo.
	2. Acceso rapido
	3. Coste elevado para insertar o eliminar elementos. 


*/








