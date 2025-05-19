package br.ufma.compiladores;

public class Main {
    public static void main(String[] args) {
        try {
            String input = "289-85+0+69";
            Scanner scan = new Scanner(input.getBytes());
            System.out.println(scan.nextToken());
            System.out.println(scan.nextToken());
            System.out.println(scan.nextToken());
            System.out.println(scan.nextToken());
            System.out.println(scan.nextToken());
            System.out.println(scan.nextToken());
            System.out.println(scan.nextToken());
        } catch (Error e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
} 