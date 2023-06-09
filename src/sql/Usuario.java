/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sql;

/**
 *
 * @author YASMIN
 */
public class Usuario extends Persona {
    private String genero;
    private double peso;
    private double altura;
    private Entrenador entrenador;
    private Nutricionista nutricionista;
    
    public Usuario(String nombre, String apellido, String email, String contrasena, int edad, String genero, double peso, double altura) {
        super(nombre, apellido, email, contrasena, edad);
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
    }
    
    public String getGenero() {
        return genero;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
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
    
    public Entrenador getEntrenador() {
        return entrenador;
    }
    
    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }
    
    public Nutricionista getNutricionista() {
        return nutricionista;
    }
    
    public void setNutricionista(Nutricionista nutricionista) {
        this.nutricionista = nutricionista;
    }
}
