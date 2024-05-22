package cassinoRomenia;

import src.java.estruturas.listacircularduplamenteencadeada.ListaCircularDuplamenteEncadeada;
import src.java.estruturas.listacircularduplamenteencadeada.No;

import java.util.Scanner;

public class CassinoRomenia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ListaCircularDuplamenteEncadeada<Integer> apostadores = new ListaCircularDuplamenteEncadeada<Integer>();

        while (true){
            int totalApostadores = scanner.nextInt();
            int k = scanner.nextInt();
            int m = scanner.nextInt();

            if (totalApostadores == 0 && k == 0 && m == 0) {
                break;
            }

            for (int i = 1; i <= totalApostadores; i++) {
                apostadores.adicionar(i);
            }

            No<Integer> posicaoK = apostadores.getHead(); // Posição inicial para o contador horário
            No<Integer> posicaoM = apostadores.getTail(); // Posição inicial para o contador anti-horário

            StringBuilder resultado = new StringBuilder();


        }
    }
}
