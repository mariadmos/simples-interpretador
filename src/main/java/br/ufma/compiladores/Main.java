package br.ufma.compiladores;

public class Main {
    public static void main(String[] args) {
        String input = "let a = 42 + 2;\n" +
                      "let b = 15 + 3;\n" +
                      "print a + b;";

        Parser p = new Parser(input.getBytes());
        p.parse();

        System.out.println("Saída do Parser");
        System.out.println(p.getOutput());

        System.out.println("\n\nSaída do Interpretador");
        Interpretador i = new Interpretador(p.getOutput());
        i.run();
    }
}