package Juego;

public class EmpleadoFactorizado {
    private String categoria;
    private int horasTrabajadas;
    
    // Constructor
    public EmpleadoFactorizado(String categoria, int horasTrabajadas) {
        this.categoria = categoria;
        this.horasTrabajadas = horasTrabajadas;
    }
    
    // Método para calcular el salario
    public double calcularSalario() {
        double salario = 0;
        
        // Utilizando una estructura switch para simplificar las expresiones condicionales
        switch (categoria) {
            case "A":
                salario = calcularSalarioCategoriaA();
                break;
            case "B":
                salario = calcularSalarioCategoriaB();
                break;
            case "C":
                salario = calcularSalarioCategoriaC();
                break;
            default:
                System.out.println("Categoría inválida");
        }
        
        return salario;
    }
    
    // Método para calcular el salario de la categoría A
    private double calcularSalarioCategoriaA() {
        double salario;
        if (horasTrabajadas <= 40) {
            salario = horasTrabajadas * 10;
        } else {
            salario = 400 + (horasTrabajadas - 40) * 15;
        }
        return salario;
    }
    
    // Método para calcular el salario de la categoría B
    private double calcularSalarioCategoriaB() {
        double salario;
        if (horasTrabajadas <= 35) {
            salario = horasTrabajadas * 12;
        } else {
            salario = 420 + (horasTrabajadas - 35) * 20;
        }
        return salario;
    }
    
 // Método para calcular el salario de la categoría C
    private double calcularSalarioCategoriaC() {
        double salario;
        if (horasTrabajadas <= 30) {
            salario = horasTrabajadas * 15;
        } else {
            salario = 450 + (horasTrabajadas - 30) * 25;
        }
        return salario;
    }
}