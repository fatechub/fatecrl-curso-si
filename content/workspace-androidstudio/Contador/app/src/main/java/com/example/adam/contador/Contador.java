package com.example.adam.contador;

/**
 * Created by Adam on 03/04/2015.
 */
public class Contador {

    private int conta;

    Contador(){
        conta = 0;
    }

    Contador(int valorinicial){
        conta=valorinicial;
    }

    public void incrementa(){
        conta++;
    }

    public void decrementa(){
        conta--;
    }

    public int getConta() {
        return conta;
    }

}
