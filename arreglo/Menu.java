
public class Menu{
	Estudiante[] arregloEstudiante=new Estudiante[5];
	ObtenerDatos oD=new ObtenerDatos();
	String nombre;
	String apellido;
	int edad;
	int carnet;
	int estudiantes=4;
	public void menuPrincipal(){
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Que desea hacer?");
		System.out.println("1...Insertar");
		System.out.println("2...Eliminar");
		System.out.println("3...Modificar");
		System.out.println("4...Buscar");
		System.out.println("5...Mostrar lista");
		
		String seleccion=oD.texto();
		System.out.println(seleccion);
		
		switch(seleccion){
			case "1":
				agregarEstudiante();
				System.out.println(" ");
				listarEstudiantes();
			break;
			case "2":
				int e_carnet;
				System.out.println("Ingrese el carnet del estudiante a eliminar:");
				listarEstudiantes();
				e_carnet=Integer.parseInt(oD.texto());
				//arregloEstudiante = ArrayUtils.remove(arregloEstudiante, 0);
				eliminarEstudiante(e_carnet);
			break;
			case "3":
				
				//Se solicita carnet
				System.out.println("Ingrese el carnet del alumno a modificar:");
				listarEstudiantes();
				int ed_carnet=Integer.parseInt(oD.texto());
				
				// Se solicita el parametro a editar
				System.out.println(" ");
				System.out.println("Que parametro desea editar");
				System.out.println("1...Nombre");
				System.out.println("2...Apellido");
				System.out.println("3...Edad");
				System.out.println("4...Carnet");
				int ed_parametro=Integer.parseInt(oD.texto());
				
				// Se solicita el nuevo valor
				System.out.println(" ");
				System.out.println("Ingrese el nuevo valor:");
				String ed_new=oD.texto();
				
				// Se envian los valores al metodo modificar
				modificarEstudiante(ed_carnet,ed_parametro,ed_new);
				
			break;
			case "4":
			Buscar();
			break;
			case "5":
			listarEstudiantes();
			break;
			default:
				System.out.println("Opcion no valida");
		}
		
		System.out.println("Desea realizar otra accion?");
		System.out.println("1...si");
		System.out.println("2...no");
		String seguir=oD.texto();
		switch(seguir){
			case "1":
			menuPrincipal();
			break;
			case "2":
				System.out.println("Saliendo del programa....");
			break;
			default:
				System.out.println("Opcion no valida");
				menuPrincipal();
			break;
		}
	}
	
	public void agregarEstudiante(){
		
		for (int i=0;i<=1;i++){
			System.out.println("Ingrese el nombre");
			nombre=oD.texto();
			System.out.println("Ingrese el apellido");
			apellido=oD.texto();
			System.out.println("Ingrese la edad");
			edad=Integer.parseInt(oD.texto());
			System.out.println("Ingrese el carnet");
			carnet=Integer.parseInt(oD.texto());
			arregloEstudiante[i]=new Estudiante(nombre,apellido,edad,carnet);
		}
	}
	
	public void listarEstudiantes(){
		try{
			for(int i=0;i<=estudiantes;i++){
				System.out.println("Nombre: "+arregloEstudiante[i].getNombre()+" "+"Apellido: "+arregloEstudiante[i].getApellido()+ " "+"Edad: "+arregloEstudiante[i].getEdad()+" "+"Carnet: "+arregloEstudiante[i].getCarnet());
			}
		} catch (Exception e){
		}
	}
	
	public void modificarEstudiante(int ed_carnet, int ed_parametro, String ed_new){
		int carnet = ed_carnet;
		int parametro = ed_parametro;
		String valorNuevo = ed_new;
		int contador=0;
		for(int i=0;i<=estudiantes;i++){
			if(carnet==arregloEstudiante[i].getCarnet()){
				nombre=arregloEstudiante[i].getNombre();
				apellido=arregloEstudiante[i].getApellido();
				edad=arregloEstudiante[i].getEdad();
				carnet=arregloEstudiante[i].getCarnet();
				
				if(ed_parametro==1){
					nombre=ed_new;
				}else if(ed_parametro==2){
					apellido=ed_new;
				}else if(ed_parametro==3){
					edad=Integer.parseInt(ed_new);
				}else if(ed_parametro==4){
					carnet=Integer.parseInt(ed_new);
				}
				arregloEstudiante[i]=new Estudiante(nombre,apellido,edad,carnet);
				break;
			}else{
				contador++;
			}
			
		}
		
	}
	public void Buscar(){
		int contador1=0;
		int buscador=0;
		System.out.println("Ponga el carnet del alumno que desee buscar");
		buscador=Integer.parseInt(oD.texto());
		for(int i=0;i<=estudiantes;i++){
			if(buscador==arregloEstudiante[i].getCarnet()){
				System.out.println(arregloEstudiante[i].getNombre()+ "  "+
				arregloEstudiante[i].getApellido()+ " "+arregloEstudiante[i].getEdad()+ " "+arregloEstudiante[i].getCarnet());
				break;
			}else{
				contador1++;
			}
		}
		if(contador1==5){
			System.out.println("No existe");
		}
	}
	
	public void eliminarEstudiante(int e_carnet){
		int carnet = e_carnet;
		int contador=0;
		for(int i=0;i<=estudiantes;i++){
			if(carnet==arregloEstudiante[i].getCarnet()){
				nombre="";
				apellido="";
				edad=0;
				carnet=0;
				
				arregloEstudiante[i]=new Estudiante(nombre,apellido,edad,carnet);
				break;
			}else{
				contador++;
			}
			
		}
	}
}