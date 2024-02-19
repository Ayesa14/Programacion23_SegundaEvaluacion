package boletin23;

public class Boletin23 {

    public static void main(String[] args) {
         String name = "Esto é Java!";
        
        // 1 - Contar nº de letras.
        
        System.out.println(name.length());
        System.out.println("--------------------------------");
        
        // 2 - Pasar el nombre a un array de char.
        String name2= "Java";
        char [] ch = name2.toCharArray();
        for (char c:ch){
            System.out.println(c);
        }
        System.out.println("--------------------------------");
        
        // 3 - Invertir texto
        String name3="Java desde 0";
        String reverseString= "";
        for (int i = name3.length() - 1; i >= 0; i--) {

		reverseString = reverseString + name3.charAt(i);
	}
        System.out.println(reverseString);
	System.out.println("--------------------------------");
        
        //4 - Elimina los espacios
        String name4= "James Gosling Created Xava";
        String name4sin = name4.replace(" ", "");
        System.out.println(name4sin);
        System.out.println("--------------------------------");
        
        //5 - Cuenta las vocales y las consonantes
        String name5="java java java";
        int vocales=0;
        int consonantes=0;
        int espacios=0;
        for(int i=0; i<name5.length();i++){
            char letra=name5.charAt(i);
            if (letra =='a'||letra =='e'||letra =='i'||letra =='o'||letra =='u') 
                vocales++;
            else if (letra== ' ')
                espacios++;
            else 
                consonantes++;    
        }
        System.out.println("Consonantes: "+consonantes);
        System.out.println("Vocales: "+vocales);
        System.out.println("--------------------------------");
        
        //6 - Divide cadena de texto en dos partes
        String name6="www. javadesde0. com";
        String parte1 = name6.substring(0, 9);
        String parte2 = name6.substring(9, name6.length());
        System.out.println(parte1);
        System.out.println(parte2);
        System.out.println("--------------------------------");
        
        //7 - Convierte a mayusculas
        String name7="javeros";
        String mayus = name7.toUpperCase();
        System.out.println(mayus);
        System.out.println(mayus.toLowerCase());
        System.out.println("--------------------------------");
        
        //8 - Comparar dos strings
        System.out.println(name2.compareTo("JavaScript"));
        System.out.println("--------------------------------");
        
        //9 - Sustituye e por la a
        String name9="jeve jeve jeve";
        String name9a= name9.replace("e", "a");
        System.out.println(name9a);
        System.out.println("--------------------------------");
        
        //10 - transforma 
        String name10="ABCD";
        for (int i=0; i<name10.length();i++){
            int j=(int) name10.charAt(i);
            System.out.println(j + " ");
        }
        System.out.println("--------------------------------");
    }
}    
    
