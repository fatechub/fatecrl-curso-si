/**
 * Created by adam on 07/04/2015.
 */
public class Calcular {
    private double altura;
    private double peso;
    private double imc;

    // Construtores
    Converte(Double altura, Double peso){
        this.altura = altura;
        this.peso = peso;
        this.imc = peso/(altura*2);
    }

    // Método
    public String mostrarResultado(){
            if (imc < 16) {
                String resultado = "Magreza grave";
            } else if (imc >16 && imc < 18.5){
                String resultado = "Magreza leve/moderada";
            } else if (imc >18.5 && imc < 25){
                String resultado = "Saudável";
            } else if (imc >25 && imc < 35){
                String resultado = "Sobrepeso";
            } else if (imc >30 && imc < 40){
                String resultado = "Obesidade Graus I e II";
            } else if (imc > 40) {
                String resultado = "Obesidade Graus III (mórbida)";
            } else {
                String resultado = "";
            }
        return resultado;
    }
}
