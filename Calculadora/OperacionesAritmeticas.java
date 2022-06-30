public class OperacionesAritmeticas{
	int total=0;
	public int suma(int numero1,int numero2){
		total=numero1+numero2;
		return total;
	}
	public int resta(int numero1,int numero2){
		total=numero1-numero2;
		return total;
	}
	public int tabla(int numero1,int numero2){
		int limite=0;
		while(limite<=numero2){
			System.out.println(numero1 +"x" +limite +"=" +numero1*limite);
			limite++;
	}
	return total;
	}
}