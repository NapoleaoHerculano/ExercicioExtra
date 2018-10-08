package Questao02;

public class FabricaJP extends Fabrica {

    @Override
    public Sanduiche fazerSanduiche() {
        return new SanduicheJP();
    }
    
}
