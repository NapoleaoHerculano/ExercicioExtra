package Questao02;

public class FabricaRT extends Fabrica {

    @Override
    public Sanduiche fazerSanduiche() {
        return new SanduicheRT();
    }
    
}
