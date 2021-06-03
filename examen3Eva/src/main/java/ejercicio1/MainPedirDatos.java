package ejercicio1;

	//package main.java.loggers.examen3Eva;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

	import org.apache.logging.log4j.LogManager;
	import org.apache.logging.log4j.Logger;

	public class MainPedirDatos {

		static Logger log = LogManager.getLogger(MainPedirDatos.class);
		
		public static void main(String[] args) {
			
			List lista = new ArrayList();
			Scanner teclado = new Scanner(System.in);
			
			int valor;
			do {
				System.out.println("Introduzca un valor: (0 para salir)");
				valor = teclado.nextInt();
				Nodo nodo = new Nodo(valor);
				if(valor!=0) {
					
					if(valor %2 == 0) {
						
						
						log.debug("El método se ha ejecutado correctamente");
						
					}else {
						
						log.info("El método se ha ejecutado correctamente");
						
						
					}
					
					lista.add(nodo);
				}
			}while(valor!=0);
		}
	}

	

