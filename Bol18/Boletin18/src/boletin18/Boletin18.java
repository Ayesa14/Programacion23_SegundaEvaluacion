package boletin18;

import javax.swing.JOptionPane;

public class Boletin18 {

    public static void main(String[] args) {
        
        float centigrados = Float.parseFloat(JOptionPane.showInputDialog("Introduce la temperatura en grados centígrados: "));
        
        try {
            float farenheit = ConversorTemperaturas.centigradosAFarenheit(centigrados);
            System.out.println("Temperatura en grados Farenheit: "+farenheit);
            
            float reamur = ConversorTemperaturas.centigradosAReamur(centigrados);
            System.out.println("Temperatura en grados Reamur: "+ reamur);   
        } catch (TemperaturaErradaExcepcion e){
            System.out.println("Error: "+ e.getMessage());
        }
    }
    
}
