package com.example.adam.tp1_conversortemperaturafc;

/**
 * Created by Adam on 04/04/2015.
 */
public class Converte {
    private double valor;

    // Construtores
    Converte(){
        this.valor = 0.0;
    }

    // Método
    public void viraCelsius( double valor ){
        //C = (F − 32) ÷ 1, 8
        this.valor = (valor - 32) / (1.8);
    }

    public void viraFahrenheit( double valor ){
        //F = C × 1, 8 + 32
        this.valor = ( valor * 1.8) + 32;
    }

    public double getTemperatura() {
        return this.valor;
    }
}