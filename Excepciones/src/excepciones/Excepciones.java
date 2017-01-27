/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class Negativo extends Exception{
    public void error(){
        System.out.println("Ha introducido un numero negativo");
        System.exit(1);
    }
}

class OtroError extends Exception{
    public void imprime_error(){
        System.out.println("Ha ocurrido algo... :(");
        System.exit(1);
    } 
}

public class Excepciones {
    
    public static int operacion(int a, int b) throws Negativo, OtroError{
        if(a<0){
            throw new Negativo();
        }
        if(b<0){
            throw new OtroError();
        }
        return a + b;
    }
    
    public static boolean validaNumero(String num){
        try{
            int a=Integer.valueOf(num);
        }catch (NumberFormatException ex){
            System.out.println("Esto no es un numero.");
            return false;
        }
        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int a=0;
        String aux;
        
        do{
            System.out.println("Introduzca un numero: ");
            aux = teclado.next();
        }while(!validaNumero(aux));
        
        System.out.println("Introduzca un numero: ");      
        int b = teclado.nextInt();
        int c=0;
        try {
            c = operacion(a, b);
        } catch (Negativo ex) {
            ex.error();
        } catch (OtroError ex) {
            ex.imprime_error();
        }
        System.out.println("Su suma es: " + c);
        
    }
    
}
