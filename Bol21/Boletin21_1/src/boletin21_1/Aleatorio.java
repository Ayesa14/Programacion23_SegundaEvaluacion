package boletin21_1;

import java.util.Random;

public class Aleatorio {
    public void aleatorio(){
        int[] numeros = new int[6];
        Random random = new Random();
        
        //Rellenar el array con numeros aleatorios del 1 al 50
        for (int i=0; i < numeros.length; i++){
            numeros[i] = random.nextInt(50) + 1;
            
        }
        //visualizar array aleatorio
        
        
        //Visualizar el array en orden inverso
        for (int i= numeros.length -1; i >=0; i--){
            System.out.println("array en orden inverso: " + numeros[i] + " ");
        }
    }
}
