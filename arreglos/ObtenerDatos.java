import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ObtenerDatos {
   public String texto(){
	  String text=null;
      BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
      try {	
	  text = bR.readLine();
      } catch (IOException e) {
          System.out.println("Error de IO");
		  System.exit(1);
      }
	  return text;
   }
   
   public int numero(){
	  int num=0;
      BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
      try {	
	  num = Integer.parseInt(bR.readLine());
      } catch (IOException e) {
          System.out.println("Error de IO");
		  System.exit(1);
      }
	  return num;
   }
}