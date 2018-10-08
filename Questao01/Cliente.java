package Questao01;

public class Cliente {
    private int[] numeros;
    private Ordenador ordenador;
    
    public int[] ordenar(){
        return ordenador.ordenarNum(numeros);
    }
    public void setOrdenadorBubble(){
        ordenador = OrdenadorBuble.getInstance();
    }
    public void setOrdenadorInsertion(){
        ordenador = OrdenadorInsertion.getInstance();
    }
    public void setOrdenadorMerge(){
        ordenador = OrdenadorMerge.getInstance();
    }
    public void setOrdenadorQuick(){
        ordenador = OrdenadorQuick.getInstance();
    }
}
