package exercicio04;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome, cargo;
        double salario, percAumento;


        System.out.print("Nome do funcionário: ");
        nome = entrada.next();
        System.out.print("Cargo do funcionário: ");
        cargo = entrada.next();
        System.out.print("Salário do funcionário: ");
        salario = entrada.nextDouble();

        //precisa ser criado em baixo para pegar os parâmetros
        Funcionario funcionario = new Funcionario(nome, cargo, salario);

        //aumentar o salário de acordo com uma porcentagem
        System.out.println("Informe a porcentagem de aumento (0 - 100): ");
        percAumento = entrada.nextDouble();
        funcionario.aumentarSalario(percAumento);
        System.out.println("Novo salário R$ " + funcionario.salario);

        //aumentar a salário de acordo com o cargo e uma porcentagem
        System.out.println();
        System.out.println("Informe a porcentagem de aumento (0 - 100): ");
        percAumento = entrada.nextDouble();
        System.out.println("Informe o cargo que terá aumento: ");
        cargo = entrada.next();
        funcionario.aumentarSalario(cargo, percAumento);
        System.out.println("Novo salário R$ " + funcionario.salario);

    }
}
