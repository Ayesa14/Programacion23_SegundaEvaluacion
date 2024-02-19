package boletin21_4;

import java.util.Scanner;

public class CalcularDNI {
    public static void numeroDNI(){
         String DNI="";
         System.out.println("Introduce tu nº de DNI para comprobar si es correcto");
         Scanner sc = new Scanner(System.in);
         DNI=sc.next();
        String[] div_dni = DNI.split("");
        String letra =div_dni[div_dni.length-1];//aquí se guarda la letra del DNI
        String numeros = "";
        for (int i = 0; i < div_dni.length -1; i++) {
            numeros += div_dni[i];   
        }
        int numero = Integer.parseInt(numeros)  ; //aquí se guardan los numeros del DNI
        System.out.println("numero="+numero);
        int resto = numero % 23;
//        System.out.println("Resto= "+resto);
        String[]letras= new String[]{"T","R","W","A","G","M", "Y", "F","P", "D", "X", "B" ,"N" ,"J", "Z", "S","O","V","H", "L","C","K","E"};
        
        System.out.println("los numeros del DNI son " + numeros + " la letra del dni es " + letra);      
    }
}
