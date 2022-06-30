public class Alumnos extends Persona{
	int clave;
	public Alumnos(String nombre, String apellido, int edad, int clave){
		super(nombre,apellido,edad);
		this.clave=clave;
	}
	public int getClave(){
		return clave;
	}
	public void setClave(int clave){
		this.clave=clave;
	}
	
}