package boletin19;

public class Persona implements IPodeCantar{
    
    @Override
    public void cantar(){
        String notas = "Do-Re-Mi-Fa-Sol-La-Si";
        System.out.println(notas);
    }
    
}
