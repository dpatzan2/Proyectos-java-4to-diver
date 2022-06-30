public class Principal{
	public static void main(String[] args){
		OperacionesAritmeticas oA=new OperacionesAritmeticas();
		ObtenerDatos oD=new ObtenerDatos();
		int a=0;
		int b=0;
		int total=0;
		System.out.println("Escoja un numero");
		a=Integer.parseInt(oD.texto());
		System.out.println("Escoja otro numero");
		b=Integer.parseInt(oD.texto());
		total=oA.suma(a,b);
		System.out.println("El resultado de la suma es: " +total);
		//RESTA
		System.out.println("Escoja un numero");
		a=Integer.parseInt(oD.texto());
		System.out.println("Escoja otro numero");
		b=Integer.parseInt(oD.texto());
		total=oA.resta(a,b);
		System.out.println("El resultado de la resta es: " +total);
		//TABLAS
		System.out.println("Escoja la tabla a mostrar");
		a=Integer.parseInt(oD.texto());
		System.out.println("Escoja el limite de la tabla");
		b=Integer.parseInt(oD.texto());
		total=oA.tabla(a,b);
	}
}