package com.boletin24.metodos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

public class Methods {
    private static List<Libros> lista = new ArrayList<Libros>();
public static void showLista(){
    System.out.println(lista);
}
 
    public static Libros crearLibro(){
       
        Libros libro = new Libros();
        libro.setTitulo(JOptionPane.showInputDialog("Introduce el nombre del libro"));
        System.out.println("El nombre del libro que has metido es: " + libro.getTitulo());
        libro.setAutor(JOptionPane.showInputDialog("Introduce el Autor del libro"));
        System.out.println("Autor: " + libro.getAutor());
        libro.setISBN(JOptionPane.showInputDialog("ISBN"));
        System.out.println("ISBN: " + libro.getISBN());
        libro.setN_unidades(Integer.parseInt(JOptionPane.showInputDialog("Numero de unidades")));
        System.out.println("Numero de unidades: " + libro.getN_unidades());
        libro.setPrecio(Float.parseFloat(JOptionPane.showInputDialog("Cual es el precio de este libro?")));
        System.out.println("El preci del libro es : " + libro.getPrecio());
        return libro;
        
    }
    public static void addLibro(){
      lista.add(crearLibro());
    }
    
    public static void showLibros() throws MyException {
       if(lista.size()==0){
           throw new MyException("La lista está vacía");
       }else{
           List<Libros> listaOrdenada = lista;
       //primero vamos a ordenar los libros
       Collections.sort(listaOrdenada);
      
        for (int i = 0; i < listaOrdenada.size(); i++) {
            System.out.println("Libro " + (i+1) + ": " + listaOrdenada.get(i));
            
        }
       
       }
        
       
    }
    
    public static void venderLibros()throws MyException{
        if(lista.size()==0){
           throw new MyException("La lista está vacía");
       }else{
        boolean encontrado = false;
        String titulo = JOptionPane.showInputDialog("¿Qué libro deseas vender?");
        String ISBN ="";
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getTitulo().equalsIgnoreCase(titulo)){
                lista.remove(i);
                encontrado = true;
            }
            
        }
        if(encontrado==false){
            ISBN= JOptionPane.showInputDialog("No hemos encontrado ese libro, Podrías facilitarnos el ISBN?");
            for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getISBN().equalsIgnoreCase(ISBN)){
                lista.remove(i);
                encontrado = true;
            }
                if (encontrado==false) {
                    System.out.println("Lamentandolo mucho no tenemos ese libro");
                }
            
        }
            
         if (encontrado) {
                System.out.println("El libro ha sido eliminado correctamente");
        }
            
            
        }
        }
        
    }
    
    
    
    
    
        public static void darDeBaja() throws MyException{
            if(lista.size()==0){
           throw new MyException("La lista está vacía");
       }else{
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).getN_unidades()<=0) {
                    lista.remove(i);
                }
            }
            }
        }
        
        public static void consultarLibro() throws MyException{
            if(lista.size()==0){
           throw new MyException("La lista está vacía");
       }else{
             boolean encontrado = false;
             String titulo = JOptionPane.showInputDialog("¿Qué libro deseas consultar--> titulo?");
             String ISBN ="";
             
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getTitulo().equalsIgnoreCase(titulo)){
                System.out.println(lista.get(i));
                encontrado = true;
                break;
            }
            
        }
        if(encontrado==false){
            ISBN= JOptionPane.showInputDialog("No hemos encontrado ese libro, Podrías facilitarnos el ISBN?");
            for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getISBN().equalsIgnoreCase(ISBN)){
                System.out.println(lista.get(i));
                encontrado = true;
                break;
            }
                if (encontrado==false) {
                    System.out.println("Lamentandolo mucho no tenemos ese libro");
                }
            
        }  
        }
        }
        }
}

