import java.util.Scanner;
public class Division {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce dividendo");
		int dividendo = sc.nextInt();
		System.out.println("Introduce divisor");
		int divisor = sc.nextInt();
		System.out.println("El cocicente es: " + CalculaDivision(dividendo,divisor));
		System.out.println("El resto e: " + CalculaResto(dividendo, divisor));	
		
	}
	public static int CalculaDivision(int dividendo, int divisor){
		int cociente = 0;
		cociente = dividendo / divisor;
		return cociente;
	}
	public static int CalculaResto(int dividendo, int divisor){
		int resto = 0;
		resto = CalculaDivision(dividendo, divisor) % 2;
		return resto;
	}
	public static boolean DivisorEsCero(int divisor){
		divisor = 0;
		return true;
	}
	class  DivisionException extends Exception{
		public void error(){
			System.out.println("No se puede divir entre 0");
			System.exit(1);
		}
		
	}
}
