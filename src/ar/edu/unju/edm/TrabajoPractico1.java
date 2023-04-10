package ar.edu.unju.edm;
import java.util.Scanner;
import java.util.Calendar;
import ar.edu.unju.edm.model.Empleado;

public class TrabajoPractico1 {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Ejercicio 1: Comprobar si un año es bisiesto. ");
		siBisiesto();
		System.out.println("\nEjercicio 2: Comprobar si un numero corresponde a un mes del año.");
		numeroDeMes();
		System.out.println("\nEjercicio 3: Determinar todos los numeros primos menores al numero ingresado.");
		primosMenores();
		System.out.println("\nEjercicio 4: Determinar todos los numeros pares o impares entre dos valores.");
		paresImparesEntre();
		System.out.println("\nEjercicio 5: Clase Empleado");
		
		// Empleado creado con el constructor parametrizado
		System.out.println("Empleado creado con el constructor parametrizado: ");
		// Creacion del calendario para asignarlo al nuevo empleado
		Calendar calendario = Calendar.getInstance();
		calendario.set(2004, 7, 15, 12, 30, 0);
		// Creacion del primer empleado
		Empleado empleado1 = new Empleado("Ricardo Fernandez", calendario.getTime(), 6672004, "rickfer@gmail.com", 178.75);
		empleado1.mostrarDatos();
		
		// Empleado creado con el constructor por defecto
		System.out.println("\nEmpleado creado con el constructor por defecto: ");
		Empleado empleado2 = new Empleado();
		// Pide datos para el nuevo empleado
		System.out.println("Ingrese el nombre del empleado: ");
		String name = scanner.nextLine();
		empleado2.setNombre(name);
		
		System.out.println("Ingrese la fecha de ingreso: ");
		int a, m, d;
		System.out.println("Año: ");
		a = scanner.nextInt();
		System.out.println("Mes: ");
		m = scanner.nextInt() - 1;
		System.out.println("Dia: ");
		d = scanner.nextInt();
		calendario.set(a, m, d, 12, 30, 0);
		empleado2.setFechaIngreso(calendario.getTime());
		
		System.out.println("Ingrese el legajo del empleado: ");
		int l = scanner.nextInt();
		empleado2.setLegajo(l);
		
		System.out.println("Ingrese el e-mail del empleado: ");
		scanner.nextLine();
		String email = scanner.nextLine();
		empleado2.setEmail(email);
		
		System.out.println("Ingrese las horas trabajadas este mes: ");
		double ht = scanner.nextInt();
		empleado2.setHorasTrabajadas(ht);
		
		// Muestra los datos del nuevo empleado
		System.out.println("Datos del segundo empleado: ");
		empleado2.mostrarDatos();
	}
	
	// Ejercicio 1 - Comprobar si un numero es bisiesto
	public static void siBisiesto() {
		int n;
		
		// Control de entrada
		System.out.println("Ingrese un año: ");
		if (scanner.hasNextInt()){
			n = scanner.nextInt();
		} else {
			System.out.println("No ingreso un numero entero.");
			return;
		}
		
		// Comprueba que el numero sea bisiesto.
		if ((n % 4 == 0 && n % 100 != 0) || n % 400 == 0) {
			System.out.println(n + " es un año bisiesto");
		} else {
			System.out.println(n + " no es un año bisiesto");
		}
	}
	
	// Ejercicio 2 - Comprobar si un numero corresponde a un mes del año.
	public static void numeroDeMes() {
		int m;
		
		// Control de entrada
		System.out.println("Ingrese un numero: ");
		if (scanner.hasNextInt()) {
			m = scanner.nextInt();
		} else {
			System.out.println("No ingreso un numero entero. ");
			return;
		}
		
		// Busca a que mes corresponde el numero
		switch(m) {
			case 1:
				System.out.println("Enero");
				break;
			case 2:
				System.out.println("Febrero");
				break;
			case 3:
				System.out.println("Marzo");
				break;
			case 4:
				System.out.println("Abril");
				break;
			case 5:
				System.out.println("Mayo");
				break;
			case 6:
				System.out.println("Junio");
				break;
			case 7:
				System.out.println("Julio");
				break;
			case 8:
				System.out.println("Agosto");
				break;
			case 9:
				System.out.println("Septiembre");
				break;
			case 10:
				System.out.println("Octubre");
				break;
			case 11:
				System.out.println("Noviembre");
				break;
			case 12:
				System.out.println("Diciembre");
				break;
			default:
				System.out.println("No existe ese mes.");
		}
	}
	
	// Ejercicio 3 - Determinar todos los numeros primos menores al numero ingresado.
	public static void primosMenores() {
		int n;
		boolean b;
		
		// Control de entrada
		System.out.println("Ingrese un numero: ");
		if (scanner.hasNextInt()) {
			n = scanner.nextInt();
		} else {
			System.out.println("No ingreso un numero entero. ");
			return;
		}
		
		// Calculo de numeros primos
		for(int i = 2; i < n; i++) {
			b = true;
			
			// Comprueba si un numero es divisor o no
			for(int d = 2; d < (i / 2) + 1; d++) {
				if(i % d == 0) {
					b = false;
					break;
				}
			}
			
			// Muestra el numero si es primo
			if (b) {
				System.out.println(i);
			}
			
		}
	}
	
	// Ejercicio 4 - Determinar todos los numeros pares o impares entre dos valores.
	public static void paresImparesEntre() {
		int li, ls;
		String m;
		
		// Control de entrada
		System.out.println("Ingrese el limite inferior: ");
		if (scanner.hasNextInt()) {
			li = scanner.nextInt();
		} else {
			System.out.println("No ingreso un numero entero. ");
			return;
		}
		
		System.out.println("Ingrese el limite superior: ");
		if (scanner.hasNextInt()) {
			ls = scanner.nextInt();
		} else {
			System.out.println("No ingreso un numero entero. ");
			return;
		}
		
		if (ls < li) {
			System.out.println("El limite superior es menor que el limite inferior. ");
			return;
		}
		
		// Calculo de numeros pares junto con excepciones al ingresar la cadena.
		System.out.println("Modo PAR/IMPAR?");
		scanner.nextLine();
		m = scanner.nextLine();
		if (m.equalsIgnoreCase("par") || m.equalsIgnoreCase("p")) {
			for(int i = li; i < ls; i++) {
				if (i % 2 == 0) {
					System.out.println(i);
				}
			}
		} else if (m.equalsIgnoreCase("impar") || m.equalsIgnoreCase("i")) {
			for(int i = li; i < ls; i++) {
				if (i % 2 != 0) {
					System.out.println(i);
				}
			}
		} else {
			System.out.println("Entrada invalida. ");
		}
	}
	
}
