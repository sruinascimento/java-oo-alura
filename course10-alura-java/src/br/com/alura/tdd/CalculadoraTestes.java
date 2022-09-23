package br.com.alura.tdd;

public class CalculadoraTestes {
    public static void main(String[] args) {
        var calc = new Calculadora();

        //São testes só que é trabalhosos assim, precisaria olhar o console
        int soma = calc.soma(3, 7);
        System.out.println(soma);

        soma = calc.soma(0, 0);
        System.out.println(soma);

        soma = calc.soma(-1, 5);
        System.out.println(soma);

        soma = calc.soma(5, -7);
        System.out.println(soma);


    }
}
