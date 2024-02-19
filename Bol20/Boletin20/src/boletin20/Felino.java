package boletin20;

public class Felino extends Mamifero implements IPodeCaminar, IPodeNadar{
    @Override
    public void Caminar(){
        System.out.println("Caminando");
    }
    @Override
    public void Nadar(){
        System.out.println("Nadando");
    }
    
}
