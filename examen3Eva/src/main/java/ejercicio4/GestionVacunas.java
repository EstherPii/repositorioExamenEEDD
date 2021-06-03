package ejercicio4;

//package refactorizacion;

/**
 * @author Esther Pizarro Soto
 * @date 03/06/2021
 */

import java.util.Scanner;

public class GestionVacunas {

public static void main(String[] args) {
	
	/**
	 * Atributos de la clase GestionVacunas
	 */
	String nombrePaciente,dniPaciente,numeroVacunas="",vacuna1="",vacuna2="",mesVacunacion1="",mesVacunacion2="";

	/**
	 * Scanner
	 */
	Scanner teclado = new Scanner(System.in);
	
	/**
	 * Pedir datos por teclado del nombre del paciente, del DNI del paciente y del número de vacunas
	 */
	System.out.println("Introduzca el nombre del paciente:");
	nombrePaciente = teclado.next();
	System.out.println("Introduzca el dni del paciente:");
	dniPaciente = teclado.next();
	System.out.println("¿Vacuna 1 o 2?");
	numeroVacunas = teclado.next();
	
	if(numeroVacunas.equals("1")) {
		System.out.println("Introduzca la vacuna 1: ");
		vacuna1 = teclado.next();
		System.out.println("Introduzca el mes de vacunación de vacuna 1:");
		mesVacunacion1 = teclado.next();
		
	}else if(numeroVacunas.equals("2")) {
		
		System.out.println("Introduzca la vacuna 2: ");
		vacuna2 = teclado.next();
		System.out.println("Introduzca el mes de vacunación de vacuna 2:");
		mesVacunacion2 = teclado.next();
		
	}else {
		System.out.println("Error");
	}
					
	extracted(nombrePaciente, dniPaciente, vacuna1, vacuna2, mesVacunacion1, mesVacunacion2);
	
	if(vacuna2.equals("")) {
		if(vacuna1.equals("Moderna")) {
			System.out.println("El paciente "+ nombrePaciente + " debe esperar 5 meses para la vacuna 2 ");
		}else if(vacuna1.equals("Pfizer")) {
			System.out.println("El paciente "+ nombrePaciente + "debe esperar 4 meses para la vacuna 2 ");
		}else if(vacuna1.equals("Janssen")) {
			System.out.println("El paciente está ya vacuando");
		}else {
			System.out.println("El paciente "+ nombrePaciente + " está ya vacunado ");
		}
	}		
	}

/**
 * Método extracted: imprime por pantalla los datos de nombrePaciente, dniPaciente, vacuna1 y vacuna2, y mesVacunacion1 y mesVacunacion2
 * @param nombrePaciente
 * @param dniPaciente
 * @param vacuna1
 * @param vacuna2
 * @param mesVacunacion1
 * @param mesVacunacion2
 */
private static void extracted(String nombrePaciente, String dniPaciente, String vacuna1, String vacuna2,
		String mesVacunacion1, String mesVacunacion2) {
	System.out.println("VACUNACIÓN PACIENTE "+ nombrePaciente +"-"+ dniPaciente + "_________________");
	System.out.println("Vacuna 1 "+ vacuna1 +" Fecha:"+mesVacunacion1);
	System.out.println("Vacuna 2 "+ vacuna2 +" Fecha:"+mesVacunacion2);
}
}
