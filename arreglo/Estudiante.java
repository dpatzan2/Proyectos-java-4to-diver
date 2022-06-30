public class Estudiante extends Persona{
	int carnet;
	
	public Estudiante(String nombre,String apellido,int edad,int carnet){
		super(nombre,apellido,edad);
		this.carnet=carnet;
	}
	public int getCarnet(){
		return carnet;
	}
	public void setCarnet(int carnet){
		this.carnet=carnet;
	}
}