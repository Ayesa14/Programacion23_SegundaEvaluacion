package boletin22;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Metodos {
    int maxN = 4;
    int t = 1<<(maxN);
    
    Scanner sc = new Scanner(System.in);
    int numEquipos = 20;
    int numJornadas = 36;
    String[] team = new String[numEquipos];
    int[][] goles = new int[numEquipos][numJornadas];
    
    public void ej1(){
        //Meter team
        team[0] = "Atletico de Madrid";
        team[1] = "Madrid";
        team[2] = "Celta";
        team[3] = "Barça";
        team[4] = "Valencia";
        team[5] = "Real Sociedad";
        team[6] = "Betis";
        team[7] = "Athletic de Bilbao";
        team[8] = "Villareal";
        team[9] = "Sevilla";
        team[10] = "Getafe";
        team[11] = "Osasuna";
        team[12] = "Rayo Vallecano";
        team[13] = "Mallorca";
        team[14] = "Cádiz";
        team[15] = "Alavés";
        team[16] = "Girona";
        team[17] = "Granada";
        team[18] = "Almería";
        team[19] = "Las Palmas";
        
        //Meter goles
        for(int i = 0; i < numEquipos; i++){
            for(int j= 0; j < numJornadas; j++){
                goles[i][j] = maxN-((int)(Math.log((Math.random() * t))/Math.log(2)));
            }
        }
        
        //Imprimir tabla
        System.out.println("E/X\t\t");
        for(int i = 0; i < numJornadas; i++){
            System.out.println("X" + (i+1) + "\t");
        }
        System.out.println();
        for(int i = 0; i < numEquipos; i++){
            System.out.println(team[i] + "\t\t");
            for(int j = 0; j < numJornadas; j++){
                System.out.println(goles[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    public void ej2(){
        int sum;
        int[] golSum = new int[20];
        for(int i = 0;i<team.length;i++){
            sum = 0;
            for(int j = 0;j<goles[i].length;j++){
                sum =sum + goles[i][j];
                golSum[i] = sum;
            }
        }
        for(int i=0;i<golSum.length-1;i++){
            for(int j = i+1; j< golSum.length; j++){
               if(golSum[i] > golSum[j]){
                   int aux = golSum[i];
                   golSum[i] = golSum[j];
                   golSum[j] = aux;
                   String aux2 = team[i];
                   team[i] = team[j];
                   team[j] = aux2;
               }
            }
            System.out.println(team[i] + " = " + golSum[i]);
        }
    }
    
    public void ej3(){
        int temp = 0;
        int aux = 0; 
        for(int i = 0;i<numJornadas;i++){
            aux = 0; 
            for(int j = 0;j<numEquipos;j++){
               if(goles[j][i] > aux){
                   aux = goles[j][i];
                   temp = j;
               }
            }
            System.out.println("El equipo con mas goles de la jornada " + (i+1) + " es " + team[temp] + " con " + aux + " goles.");
        }
    }
    
    public void ej4(){
        int temp = 0;
        int aux = 0; 
        for(int i = 0;i<numJornadas;i++){
            for(int j = 0;j<numEquipos;j++){
               if(goles[j][i] > aux){
                   aux = goles[j][i];
                   temp = j;
               }
            }
        }
        System.out.println("El equipo con mas goles es " + team[temp] + " con " + aux + " goles.");
    }
    
    public void ej5(){
        int jor = Integer.parseInt(JOptionPane.showInputDialog("Numero jornada (36)"));
        String eqp = JOptionPane.showInputDialog("Nombre del equipo");
        int aux = 22;
        for(int i = 0;i<team.length;i++){
            if(eqp.equals(team[i])){
                aux = i;
            }
        }
        if(aux == 22 | jor > 36 | jor < 0){
            int g = goles[aux][jor - 1];
            System.out.println("El equipo " + eqp + " tiene " + g + " goles en la joranada " + jor + ".");
        }
    }
}
    
   
