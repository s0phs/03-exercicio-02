package exercicio01;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        Jogador jogador = new Jogador();
        System.out.print("Informe o nome do jogador: ");
        jogador.nome =  entrada.next();
        for(int i=0;i<jogador.pontuacao.length;i++){
            System.out.println("---"+(i+1)+"° Rodada");
            System.out.print("Pontuação: ");
            jogador.pontuacao[i]=entrada.nextInt();
        }
        System.out.println();
        System.out.println("NOME DO JOGADOR: "+jogador.nome);
        System.out.println("PONTUAÇÃO TOTAL: "+jogador.calculaPontTotal());
        entrada.close();
    }
}
