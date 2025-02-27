package exercicio01;

public class Jogador {
    //atributos ou variáveis de instância
    String nome;
    int[] pontuacao = new int[3];

    public int calculaPontTotal(){
        int pontTotal = 0;
        for (int i : pontuacao){//usado apenas para percorrer um vetor, não tem controle sobre o indice
            pontTotal += i;
        }
        return pontTotal;
    }


}
