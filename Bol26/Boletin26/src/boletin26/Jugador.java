package boletin26;

public class Jugador implements Comparable {
    
    private String name;
    private int edad;

    public Jugador() {
    }

    public Jugador(String name, int edad) {
        this.name = name;
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int compareTo(Object o) {
       Jugador x = (Jugador) o;
       if(this.edad>x.edad){
           return 1;
       }else if(this.edad==x.edad){
           return 0;
       }else{
           return -1;
       }
    }

    @Override
    public String toString() {
        return "Jugador{" + "name=" + name + ", edad=" + edad + '}';
    }   
}
