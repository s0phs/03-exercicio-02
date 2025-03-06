package exercicio03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat fM = new DecimalFormat("0.00");
        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto();

        System.out.println("Informe as coordenadas do ponto 1: ");
        p1.x = entrada.nextInt();
        p1.y = entrada.nextInt();
        System.out.println();
        System.out.println("Informe as coordenadas do ponto 2: ");
        p2.x = entrada.nextInt();
        p2.y = entrada.nextInt();

        System.out.println();
        System.out.println("Distância de p1 para p2: " + fM.format(p1.calculaDistancia(p2)));
        System.out.println("Distância de p2 para p1: " + fM.format(p2.calculaDistancia(p1)));
        System.out.println();
        System.out.println("Distância de p1 até a origem: " + fM.format(p1.calculaDistOrigem()));
        System.out.println("Distância de p2 até a origem: " + fM.format(p2.calculaDistOrigem()));

        System.out.println();
        Ponto aux = Ponto.calculaPontoProx(p1,p2);
        System.out.println("Ponto mais próximo da origem: " + aux.FormataPonto());
    }
}
