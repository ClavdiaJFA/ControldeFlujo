import java.util.Scanner;

public class ControlDeFlujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * if (condicion) si se cumple {
		 * codigo
		 * codigo
		 * codigo
		 * }
		 * 
		 * if (condicion) si se cumple {
		 * codigo
		 * codigo
		 * codigo
		 * } 
		 * "si no se cumple la condicion se ejecuta el else"
		 * else {
		 * codigo
		 * codigo
		 * codigo
		 * }
		 * if (condicion) si se cumple {
		 * codigo
		 * codigo
		 * codigo
		 * }
		 * "Si se cumple la condicion del else if se ejecuta"
		 * else if (condicion) si se cumple  {
		 * 
		 * }
		 * 
		 * "Si se cumple la condicion del else if se ejecuta"
		 * else if (condicion) si se cumple {
		 * 
		 * codigo
		 * codigo
		 * codigo
		 * }
		 * "Si ninguna condicion se cumple ejecuta el else"
		 * else {
		 * 
		 * }
		 */
		
		/*
		 * es mayor a 18 años, se muestra un mensaje al usuario
		 * que puede votar, en caso contrario se mostrara un mensaje
		 * indicanco que no puede votar
		 */
		Scanner leerEdad = new Scanner(System.in);
		System.out.println("Ingresa tu edad");
		int edad = leerEdad.nextInt();
		String mensaje = votar(edad);
		System.out.println(mensaje);

	}
	
	public static String votar(int edad) {
		String mensaje = "";
		if(edad >=18) {
			mensaje = "Felicidades, puedes votar";
		} else {
			mensaje = "No puedes votar";
		}
		
		return mensaje;
	}

}
