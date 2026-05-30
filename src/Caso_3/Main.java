package Caso_3;

public class Main {
    public static void main(String[] args) {
        Operacion op = new Operacion();

        int resultadoEnteros = op.sumar(8, 40);
        System.out.println("Suma de dos enteros (8 + 40): " + resultadoEnteros);

        double resultadoDecimales = op.sumar(9.5, 2.3);
        System.out.println("Suma de dos decimales (9.5 + 2.3): " + resultadoDecimales);

        int resultadoTresEnteros = op.sumar(10, 20, 30);
        System.out.println("Suma de tres enteros (10 + 20 + 30): " + resultadoTresEnteros);
    }
}
