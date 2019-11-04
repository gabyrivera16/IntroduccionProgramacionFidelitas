/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifras;

/**
 *
 * @author Gaby
 */
import java.util.Scanner;
public class Cifras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
   //Ejemplo con la cantidad de cifras que tiene un número 
   //ingresado por el usuario por medio del teclado
   int num;
   Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un número");
        num=leer.nextInt();
        
        if(num>0&&num<10){
            System.out.println("El número es de una cifra");
        }//fin if
        else{
        if(num>10&&num<100){
            System.out.println("EL número es de dos cifras");
        }//fin if
        else{
        if(num>100&&num<1000){
            System.out.println("EL número es de tres cifras");
        }//fin if
        else{
        if(num>1000&&num<10000){
            System.out.println("EL número es de cuatro cifras");
        }//fin if
        else{
          System.out.println("El número es de 5 cifras o más");
                }//fin else
        }//fin else
        }//fin else
        
        }//fin if

//ejecución de muestraNumeros
        muestraNumeros();
}//fin main
    
//Ejemplo muestra número del 1 al 100
public static void muestraNumeros(){
    int numero=1;
    while(numero<=100){
        System.out.println(numero);
        numero++;
    }//fin while
    
    
}//fin muestraNumeros    
    
}//fin clase
