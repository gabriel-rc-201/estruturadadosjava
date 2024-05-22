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

            StringBuilder resultado = new StringBuilder();

            while(!apostadores.isVazio()){
                No<Integer> horario = apostadores.getHead(); // Posição inicial para o contador horário
                for (int j = 0; j < k - 1; j++){
                    horario = horario.getProximo();
                }

                resultado.append(horario.getValor());

                No<Integer> antihorario =  apostadores.getTail(); // Posição inicial para o contador anti-horário
                for (int j = 0; j < m - 1; j++){
                    antihorario = antihorario.getAnterior();
                }

                if (!horario.equals(antihorario)){
                    resultado.append(" ").append(antihorario.getValor());
                }

                No<Integer> proximoAposRemoverOHorario = apostadores.removerERetornaAnterior(horario);

                if(!horario.equals(antihorario)){
                    antihorario = apostadores.removerERetornaProximo(antihorario);
                } else {
                    antihorario = proximoAposRemoverOHorario != null ? proximoAposRemoverOHorario.getProximo() : null;
                }

                horario = proximoAposRemoverOHorario;

                if(!apostadores.isVazio()){
                    resultado.append(", ");
                }
            }

            System.out.println(resultado);
        }
        scanner.close();
    }
}
