package Questao01;

public class OrdenadorInsertion implements Ordenador {

    private static OrdenadorInsertion instance;
    
    private OrdenadorInsertion(){
    }
    public static OrdenadorInsertion getInstance(){
        if(instance == null){
            instance = new OrdenadorInsertion();
        }
        return instance;
    }
    @Override
    public int[] ordenarNum(int[] numeros) {
        //...
        return null;
    }
    
}
