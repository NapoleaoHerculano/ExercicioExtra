package Questao02;

public class FabricaCG extends Fabrica {

    @Override
    public Sanduiche fazerSanduiche() {
        return new SanduicheCG();
    }
    
}
