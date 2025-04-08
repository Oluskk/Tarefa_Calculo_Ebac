public class Media {
    public static void main (String args []) {
        operadoresAritmeticos();
        operadoresDeSubstração();
        operadoresDeIncrementoeDecremento();
    }

    private static void operadoresDeIncrementoeDecremento() {
        System.out.println("*****Operadores de Incremento e Decremento*****");
        int d = 1;
        int a = 10;
        int b = 5;
        d++; // incremento
        System.out.println("Incremento: " + d);

        d--; // decremento
        System.out.println("Decremento: " + d);

        // Operadores Relacionais
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // Operadores Lógicos
        boolean x = true;
        boolean y = false;

        System.out.println("x && y (E lógico): " + (x && y));
        System.out.println("x || y (OU lógico): " + (x || y));
        System.out.println("!x (negação): " + (!x));
    }

    private static void operadoresDeSubstração() {
        System.out.println("*****Operadores de Subtração*****");
        int c = 7;
        c += 3;
        System.out.println("Atribuição com += : " + c);

        c *= 2; // c = c * 2
        System.out.println("Atribuição com *= : " + c);
    }

    private static void operadoresAritmeticos() {
        System.out.println("*****Operadores Aritmeticos*****");
        int a = 10;
        int b = 20;
        System.out.println("Adição: "+ (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Módulo (resto): " + (a % b));
    }
}
