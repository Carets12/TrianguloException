package Teoria;

import java.util.Scanner;

public class TestTrianguloRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce los lados del triangulo rectangulo"
				+ "en el orden catettos y posterior hipotenusa");
		Scanner in = new Scanner(System.in);
		double cateto1 = in.nextDouble();
		double cateto2 = in.nextDouble();
		double hipotenusa = in.nextDouble();
		
		try {
			TrianguloRectangulo t = new TrianguloRectangulo(cateto1, cateto2, hipotenusa);
		} catch (TrianguloRectanguloException e) {
			// TODO Auto-generated catch block
			System.out.println("Eso no es un triangulo rectangulo");
		}finally{
			in.close();
		}
		

	}

}
