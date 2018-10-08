package Questao02;

public class LanchoneteJP extends Lanchonete {   
    private SanduicheJP sanduiche;
    
    public LanchoneteJP(){
    }

    @Override
    public Fabrica criarFabrica() {
        return new FabricaJP();
    }
        
}
