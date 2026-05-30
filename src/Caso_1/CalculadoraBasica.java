package Caso_1;

import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
	 
        System.out.print("Ingrese el primer número: ");
        float num1 = teclado.nextFloat();
        
        System.out.print("Ingrese el segundo número: ");
        float num2 = teclado.nextFloat();
        
        System.out.println("Elija una operación: +, -, *, /");
        char operacion = teclado.next().charAt(0);        
        double resultado = 0;
        
        // CONDICIONAL IF/ELSE       
        if (operacion == '+') {
            resultado = sumar(num1, num2);
        } 
        else if (operacion == '-') {
            resultado = restar(num1, num2);
        } 
        else if (operacion == '*') {
            resultado = multiplicar(num1, num2);
        } 
        else if (operacion == '/') {
            if (num2 != 0) {
                resultado = dividir(num1, num2);
            } else {
                System.out.println("Error: No se puede dividir entre cero.");
                teclado.close();
                return; 
            }
        } 
        else {
            System.out.println("Operación no válida.");
            teclado.close();
            return;
        }        
        // MUESTRO LOS RESULTADOS DE LA CALCULADORA
        System.out.println("El resultado es: " + resultado);   
        teclado.close();
    }
        
    // MÉTODOS DE LA CALCULADORA
    public static double sumar(float a, float b) {
        return a + b;
    }

    public static double restar(float a, float b) {
        return a - b;
    }

    public static double multiplicar(float a, float b) {
        return a * b;
    }

    public static double dividir(float a, float b) {
        return a / b;       
    }
}

