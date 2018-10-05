/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        Estudiante miObjeto = new Estudiante(); // Creamos un objeto de mi clase
        String a;
        int b;
        System.out.println("Ingrese nombre");
        a = entrada.nextLine();
        System.out.println("Ingrese su edad");
        b= entrada.nextInt();
        miObjeto.metodo1(a, b);
        miObjeto.Presentar();
        
        entrada.nextLine();
        Estudiante miObjeto2 = new Estudiante();
        System.out.println("Ingrese nombre");
        a = entrada.nextLine();
        System.out.println("Ingrese su edad");
        b= entrada.nextInt();
        miObjeto2.metodo1(a, b);
        miObjeto2.Presentar();
        
    }

}
