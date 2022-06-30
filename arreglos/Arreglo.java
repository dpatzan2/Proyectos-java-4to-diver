public class Arreglo{
	public static void main(String [] args){
		Persona[] persona=new Persona[3];//Arreglo
		ObtenerDatos oD=new ObtenerDatos();
		Persona persona1;
		String nombre;
		String apellido;
		int edad;
		
		for(int i=0;i<=2;i++){
			
			System.out.println("Ingrese su nombre");
			nombre=oD.texto();
			System.out.println("Ingrese su apellido");
			apellido=oD.texto();
			System.out.println("Ingrese su edad");
			edad=oD.numero();
			persona[i]=new Persona(nombre,apellido,edad);
		}
		System.out.println("Mostrando datos");
		for(int i=0;i<=1;i++){
			nombre=persona[i].getNombre();
			apellido=persona[i].getApellido();
			System.out.println(nombre+" "+ apellido);
		}
		
		
		persona[2].setNombre("hola");
		System.out.println("Mostrando dato modificado");
		for(int i=0;i<=2;i++){
			nombre=persona[i].getNombre();
			apellido=persona[i].getApellido();
			System.out.println(nombre+" "+ apellido);
		}
		
		
	}
}