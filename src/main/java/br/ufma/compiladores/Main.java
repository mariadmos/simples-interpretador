package br.ufma.compiladores;

public class Main {
    public static void main(String[] args) {
        try {
            
            System.out.println("Testando expressão: 45  + 89   -       876");
            String input = "45  + 89   -       876";
            Parser p = new Parser(input.getBytes());
            p.parse();
            
        } catch (Error e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
} 