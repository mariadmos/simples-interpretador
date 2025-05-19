package br.ufma.compiladores;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Testando expressão: 8+5-7+9");
            String input = "8+5-7+9";
            Parser p = new Parser(input.getBytes());
            p.parse();
            
        } catch (Error e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
} 