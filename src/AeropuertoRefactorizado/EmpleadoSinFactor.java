package Juego;

public class EmpleadoSinFactor {
    private String categoria;
    private int horasTrabajadas;
    
    public EmpleadoSinFactor(String categoria, int horasTrabajadas) {
        this.categoria = categoria;
        this.horasTrabajadas = horasTrabajadas;
    }
    
    public double calcularSalario() {
        double salario = 0;
        
        if (categoria.equals("A")) {
            if (horasTrabajadas <= 40) {
                salario = horasTrabajadas * 10;
            } else {
                salario = 400 + (horasTrabajadas - 40) * 15;
            }
        } else if (categoria.equals("B")) {
            if (horasTrabajadas <= 35) {
                salario = horasTrabajadas * 12;
            } else {
                salario = 420 + (horasTrabajadas - 35) * 20;
            }
        } else if (categoria.equals("C")) {
            if (horasTrabajadas <= 30) {
                salario = horasTrabajadas * 15;
            } else {
                salario = 450 + (horasTrabajadas - 30) * 25;
            }
        }
        
        return salario;
    }
}

//Utiliza las técnicas de refactorización mencionadas anteriormente para mejorar la legibilidad y mantenibilidad del método calcularSalario() de la clase Empleado.
//Asegúrate de que la lógica del cálculo del salario siga siendo la misma después de la refactorización.
//Comenta cada cambio que realices en el código para explicar qué técnica de refactorización estás aplicando y por qué.