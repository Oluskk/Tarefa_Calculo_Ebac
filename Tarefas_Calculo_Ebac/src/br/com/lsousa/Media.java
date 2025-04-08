package br.com.lsousa;

public class Media {
    public static void main(String args[]) {
        calculoDeNota();
    }

    private static void calculoDeNota() {
        //Notas
        int nota1= 8;
        int nota2= 6;
        int nota3= 7;
        int nota4= 9;

        int Media= (nota1 + nota2 + nota3 + nota4) /4;

        System.out.println("A sua média final de nota foi: " + (Media));

    }
}
