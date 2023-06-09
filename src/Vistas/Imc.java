/*clase Imc encarga de calcular el peso*/
package Vistas;

import cimc.*;

public class Imc {
    protected double peso;
    protected double altura;

    //contructor vacio
    public Imc(){

    }

    //contructor que da valores a los atributos
    public Imc(double peso, double altura){
        this.altura = altura;
        this.peso = peso;
    }

    //metodo que retorna el valor del imc
    public double calcularIMC(){
        return (this.peso) / (this.altura * this.altura );
    }

    
    //bloque de encapsulamiento
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
