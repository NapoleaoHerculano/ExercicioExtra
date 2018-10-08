package Questao01;

public class OrdenadorBuble implements Ordenador {

    private static OrdenadorBuble instance;
    
    private OrdenadorBuble(){
    }
    public static OrdenadorBuble getInstance(){
        if(instance == null){
            instance = new OrdenadorBuble();
        }
        return instance;
    }
    @Override
    public int[] ordenarNum(int[] numeros) {
        //...
        return null;
    }
    
}
