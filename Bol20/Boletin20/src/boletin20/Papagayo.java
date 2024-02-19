package boletin20;

public class Papagayo extends Aves implements IPodeCaminar, IPodeVolar{
    @Override
    public void Caminar(){
        System.out.println("Caminando");
    }
    @Override
    public void Volar(){
        System.out.println("Volando");
    }
    
}
