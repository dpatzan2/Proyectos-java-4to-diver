import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Datos{
	public String texto(){
		String dato=null;
		BufferedReader bR=new BufferedReader(new InputStreamReader(System.in));
		try{
			dato=bR.readLine();
		}catch(IOException e){
		System.out.println("Error");
		System.exit(1);
		}
		return dato;
	}
		public int numero(){
		int op=0;
		BufferedReader bR=new BufferedReader(new InputStreamReader(System.in));
		try{
			op=Integer.parseInt(bR.readLine());
		}catch(IOException e){
		System.out.println("Error");
		System.exit(1);
		}
		return op;
	}
}