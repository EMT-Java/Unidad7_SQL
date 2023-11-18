package logica;

import java.util.Scanner;

public class PersonaVO {
	private int cedula;
    private String nombre;
    private String apellido;
      
    
    public PersonaVO(){
    	
    }

    public PersonaVO(int cedula, String nombre, String apellido) {
    	this.cedula = cedula;
    	this.nombre = nombre;
        this.apellido = apellido;
          
    }

    public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

	@Override
	public String toString() {
		return " [cedula = "+ cedula+ ", " + nombre + " "+ apellido+"] ";
	}
    
	public void pedirDatos() {
		Scanner teclado=new Scanner(System.in);
		System.out.println(" ");
		try{
			System.out.println("Ingrese cedula: ");
			this.setCedula(teclado.nextInt());
		}catch(NumberFormatException e){
			System.out.println("La cedula debe ser n�merica ");
		}
		
		System.out.println("Ingrese nombre: ");
		this.setNombre(teclado.next());
		System.out.println("Ingrese apellido: ");
		this.setApellido(teclado.next());
		System.out.println(" ");
		
	}
    
    
}
