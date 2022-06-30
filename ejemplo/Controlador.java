public class Controlador{
	Datos dS=new Datos();
	Alumnos[] alumnos=new Alumnos[5];
	Alumnos sA;
	int op;
	public void Registrados(){
		alumnos[0]=new Alumnos("Brandon","Herrera",15,1);
		alumnos[1]=new Alumnos("Diego","Ramos",15,2);
		alumnos[2]=new Alumnos("Edson","Urizar",16,3);
		alumnos[3]=new Alumnos("Katherine","Diaz",15,4);
		alumnos[4]=new Alumnos("Esteban","Morales",15,5);
		
	}
	public void Elegir(){
		System.out.println("Seleccione una opcion");
		System.out.println("1:Mostrar alumnos registrados");
		System.out.println("2:Modificar alumnos");
		System.out.println("3:Eliminar alumnos");
		System.out.println("4:Buscar alumnos");
		op=dS.numero();
		switch(op){
			case 1:
			Mostrar();
			break;
			case 2:
			Modificar();
			break;
			case 3:
			break;
			case 4:
			
			break;
		}
	}
	public void Mostrar(){
		for(int a=0;a<5;a++){
				System.out.println("Nombre:"+alumnos[a].getNombre()+" "+alumnos[a].getApellido()
				+" Edad:"+alumnos[a].getEdad()+" Clave:"+alumnos[a].getClave());
		}
	}
	public void Modificar(){
		int k;
		int s=0;
		String n;
		String ap;
		int e;
		int dato;
		System.out.println("Ingrese la clave del alumno que desea modificar");
		k=dS.numero();
		for(int b=0;b<5;b++){
			if(alumnos[b].getClave()==k){
				System.out.println("Nombre:"+alumnos[b].getNombre()+" "+alumnos[b].getApellido()
				+" Edad:"+alumnos[b].getEdad()+" Clave:"+alumnos[b].getClave());
				do{
				System.out.println("¿Que dato desea modificar?");
				System.out.println("1:Nombre");
				System.out.println("2:Apellido");
				System.out.println("3:Edad");
				dato=dS.numero();
				switch(dato){
					case 1:
					System.out.println("Ingrese el nuevo nombre");
					n=dS.texto();
					alumnos[b].setNombre(n);
					System.out.println("Nombre:"+alumnos[b].getNombre()+" "+alumnos[b].getApellido()
				+" Edad:"+alumnos[b].getEdad()+" Clave:"+alumnos[b].getClave());
				System.out.println("¿Desea modificar algo mas?");
				System.out.println("1:Si");
				System.out.println("2:No");
				s=dS.numero();
				break;
				case 2:
				System.out.println("Ingrese el nuevo apellido");
				ap=dS.texto();
				alumnos[b].setApellido(ap);
				System.out.println("Nombre:"+alumnos[b].getNombre()+" "+alumnos[b].getApellido()
				+" Edad:"+alumnos[b].getEdad()+" Clave:"+alumnos[b].getClave());
				System.out.println("¿Desea modificar algo mas?");
				System.out.println("1:Si");
				System.out.println("2:No");
				s=dS.numero();
				break;
				case 3:
				System.out.println("Ingrese la nueva edad");
				e=dS.numero();
				alumnos[b].setEdad(e);
				System.out.println("Nombre:"+alumnos[b].getNombre()+" "+alumnos[b].getApellido()
				+" Edad:"+alumnos[b].getEdad()+" Clave:"+alumnos[b].getClave());
				System.out.println("¿Desea modificar algo mas?");
				System.out.println("1:Si");
				System.out.println("2:No");
				s=dS.numero();
				break;
				default:
				System.out.println("Dato inexistente");
				}
				}
				while(s==1);
				if(s==2){
					Elegir();
				}
				else if((s>=0)||(s>2)){
						System.out.println("Opcion invalida");
						Elegir();
					}
				}
				
			}
		}
		public void buscarAlumno(){ //BUSCAR
		int contador=0;
		System.out.println("Ingrese la clave del estudiante que quiera buscar");
		contador=dS.numero();
		for(int i=0;i<=4;i++){
			if(contador==Registrados[i].getClave()){
				System.out.println(Registrados[i].getNombre()+ "  "+
				Registrados[i].getApellido());
				break;
			}else{
				contador++;
			}
		}
		if(contador==5){
			System.out.println("No existe");
		}
	}
}