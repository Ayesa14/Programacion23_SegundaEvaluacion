/*
Carga un array  de tipo int, cas notas no módulo de programación ,dos 30 alumnos da clase de DAM .
    •  Visualiza o numero de aprobados e o de suspensos  .
    •  Calcula e visualiza a nota media da clase
    • Visualiza a nota mais alta .
 */
package boletin21_2;

public class Boletin21_2 {

    public static void main(String[] args) {
        int[] notas = new int[30];
        String[] alumnos = new String[30];
        
        notas = Notas.notasAlumn();
        Notas.mostrarNotaAlumno(notas, alumnos);
    }
    
}
