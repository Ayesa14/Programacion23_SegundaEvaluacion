package boletin21_2;

import java.util.Arrays;
import java.util.Scanner;

public class Notas {
    public static int [] notasAlumn(){
        int[] notas = new int[30];
        String[] alumnos = new String[30];
        int contarAprobados=0;
        int notaMasAlta = 0;
        int suma = 0;
        int media = 0;
        
        //le damos valores aleatorios al array notas y mostramos
        for (int i = 0; i < notas.length; i++){
            int random = (int)(Math.round(Math.random() * 10));
            notas[i]=random;
            System.out.println("notas: " + notas[i]);
        }
        
        //contamos el numero de aprobados y hago la suma de las notas
        for( int i= 0; i < notas.length; i++){
            if(notas[i]>=5){
                contarAprobados ++;
            }
            suma+=notas[i];
        }
        
        //calculamos la media
        media= suma/notas.length;
        
        //ordenamos las notas
        int[] notasOrdenadas = new int[notas.length];
        for(int i = 0; i < notasOrdenadas.length; i++){
            notasOrdenadas[i]=notas[i];
        }
        Arrays.sort(notasOrdenadas);
        notaMasAlta = notasOrdenadas[notas.length-1];
        
        System.out.println("nota mas alta: " + notaMasAlta + " media: " + media + " numeros de aprobados: " + contarAprobados + " suspensos: " + (30-19));
        
        // devolvemos el array
        return notas;
    }
    
    public static void mostrarNotaAlumno(int[] notas, String[] alumnos){
        Scanner sc = new Scanner(System.in);
       // System.out.println("¿De qué alumno quiere saber la nota?");
        String alumno = sc.next();
        for(int i = 0; i < alumnos.length; i++){
            if(alumno.equalsIgnoreCase(alumnos[i])){
                System.out.println("La nota del alumno: "+alumnos[i]+ " es: "+ notas[i]);
            }
        }
    }
    
    
}
