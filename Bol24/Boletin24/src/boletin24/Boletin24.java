package boletin24;

import com.boletin24.metodos.Methods;
import com.boletin24.metodos.MyException;


/**
 *
 * @author ayesa
 */
public class Boletin24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
       Methods.addLibro();
       Methods.addLibro();
       try{
  
       Methods.showLista();
       Methods.showLibros();
       Methods.venderLibros();
       Methods.showLibros();
       Methods.darDeBaja();
       Methods.consultarLibro();
     
       }catch(MyException x){
           System.out.println(x.getMessage());
       }
      
       
       
    }
    
}
