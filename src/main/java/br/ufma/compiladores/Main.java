package br.ufma.compiladores;

public class Main {
    public static void main(String[] args) {
        try {
            
            System.out.println("Testando a sentença: let a = 42 + 5;");
            String input = "let a = 42 + 5;";
            Parser p = new Parser(input.getBytes());
            p.parse();
            
        } catch (Error e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
} 