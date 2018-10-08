package Questao02;

public class LanchoneteCG extends Lanchonete{
    private SanduicheCG sanduiche;
    
    public LanchoneteCG(){
    }


    @Override
    public Fabrica criarFabrica() {
        return new FabricaCG();
    }
    
}
