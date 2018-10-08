package Questao02;

public class LanchoneteRT extends Lanchonete{
    private SanduicheRT sanduiche;
    
    public LanchoneteRT(){
    }

    @Override
    public Fabrica criarFabrica() {
        return new FabricaRT();
    }
}
