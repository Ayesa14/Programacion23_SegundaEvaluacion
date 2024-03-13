package libreria;

import com.ayesa.libros.Libro;
import com.ayesa.mantenimiento.Mantenimiento;
import java.io.File;

public class main {
          
    public static void main(String[] args) {
        // TODO code application logic here
        
        Libro l1 = new Libro("Las madres","Carmen Mola",3,15.5f);
        Libro l2 = new Libro("La red púrpura","Carmen Mola",4,98f);
        Libro l3 = new Libro("La nena","Carmen Mola",0,15.5f);
        Libro l4 = new Libro("Ansia","Henar Álvares",4,98f);
        Libro l5 = new Libro("La grieta del silencio","Javier Castillo",0,15.5f);
        Libro l6 = new Libro("El hijo olvidado","Mikel Santiago",4,98f);
        File fichero1 = new File("Libreria.txt");
         Mantenimiento.add(fichero1, l1);
          Mantenimiento.add(fichero1, l2);
         Mantenimiento.add(fichero1, l3);
        Mantenimiento.add(fichero1, l4);
        Mantenimiento.add(fichero1, l5);
        Mantenimiento.add(fichero1, l6);
       Mantenimiento.consultar(fichero1,l1 );
        System.out.println("-------------------------------------------------------------------");
        Mantenimiento.mostrar(fichero1);
          System.out.println("-----------------------Ahora se  Borra y se muestra otra vez--------------------------------------------");
        Mantenimiento.borrar(fichero1);
        Mantenimiento.mostrar(fichero1);
       // Mantenimiento.modificarPrecio(fichero1,"Un paso por delante de Wall Street" , 69);
        
    }
}
    