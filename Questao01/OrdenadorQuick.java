package Questao01;

public class OrdenadorQuick implements Ordenador {

    private static OrdenadorQuick instance;
    
    private OrdenadorQuick(){
    }
    public static OrdenadorQuick getInstance(){
        if(instance == null){
            instance = new OrdenadorQuick();
        }
        return instance;
    }
    @Override
    public int[] ordenarNum(int[] numeros) {
        //...
        return null;
    }
    
}
