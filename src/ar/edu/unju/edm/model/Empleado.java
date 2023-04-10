package ar.edu.unju.edm.model;
import java.util.Date;

public class Empleado {
	// Atributos
	private String nombre;
	private Date fechaIngreso;
	private int legajo;
	private String email;
	private double sueldo;
	private double horasTrabajadas;
	
	// Constructores
	public Empleado() {
		this.nombre = "";
		this.fechaIngreso = new Date();
		this.legajo = 0;
		this.email = "";
		this.sueldo = 0.00;
		this.horasTrabajadas = 0;
	}
	
	public Empleado(String nombre, Date fechaIngreso, int legajo, String email, double horasTrabajadas) {
		this.nombre = nombre;
		this.fechaIngreso = fechaIngreso;
		this.legajo = legajo;
		this.email = email;
		this.horasTrabajadas = horasTrabajadas;
		this.sueldo = calcularSueldo();
	}
	
	// Metodos
	private double calcularSueldo() {
		double s = 0;
		double h = this.horasTrabajadas;
		
		// Si tiene mas de 160 horas trabajadas, se calcularan por aparte.
		if (this.horasTrabajadas > 160) {
			h -= 160;
			s += 5500.00 * h;
		}
		s += 4000.00 * h;
		
		return s;
	}
	
	public void mostrarDatos() {
		System.out.println("ombre del empleado: " + this.nombre + ", Legajo: " + this.legajo);
		System.out.println("E-Mail: " + this.email);
		System.out.println("Fecha de Ingreso: " + this.fechaIngreso);
		System.out.println("Horas Trabajadas este mes: " + this.horasTrabajadas);
		System.out.println("Sueldo correspondiente: " + this.sueldo);
	}
	
	// Getters y Setters
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	public int getLegajo() {
		return legajo;
	}
	
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	
	public String getEMail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public double getSueldo() {
		return sueldo;
	}
	
	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}
	
	public void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
}
