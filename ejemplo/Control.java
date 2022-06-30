public class Control{
	Estudiante[] arregloEstudiante=new Estudiante[5];
	Estudiante estudiante;
	public void agregarEstudiante(){
		arregloEstudiante[0]=new Estudiante("Omar","Juarez",15,2019173);
		arregloEstudiante[1]=new Estudiante("Luis","Lopez",16,2019195);
		arregloEstudiante[2]=new Estudiante("Ernesto","Arriaga",15,2019185);
		arregloEstudiante[3]=new Estudiante("Oscar","Palma",50,2019179);
		arregloEstudiante[4]=new Estudiante("Shajar","Valle",26,2019115);
	}
		public void reporteEstudiantes(){
		for(int i=0;i<=4;i++){
			System.out.println(arregloEstudiante[i].getNombre()+" "+ 
			arregloEstudiante[i].getApellido()+ " "+arregloEstudiante[i].getCarnet());
		}
	}
}