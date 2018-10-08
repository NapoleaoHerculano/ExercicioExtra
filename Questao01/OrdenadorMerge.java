package Questao01;

public class OrdenadorMerge implements Ordenador {

    private static OrdenadorMerge instance;
    
    private OrdenadorMerge(){
    }
    public static OrdenadorMerge getInstance(){
        if(instance == null){
            instance = new OrdenadorMerge();
        }
        return instance;
    }
    @Override
    public int[] ordenarNum(int[] numeros) {
        //...
        return null;
    }
    
}
