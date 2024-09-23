package Codigo;

import java.util.Scanner;
import sistema.Motorista;
import sistema.Veiculo;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do motorista:");
        String nomeMotorista = scanner.nextLine();

        System.out.println("Informe a idade do motorista:");
        int idadeMotorista = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Informe a licença do motorista:");
        String licencaMotorista = scanner.nextLine();

        Motorista motorista = new Motorista(nomeMotorista, idadeMotorista, licencaMotorista);

        if (motorista.getIdade() < 18) {
            System.out.println("Motorista não tem idade suficiente para dirigir.");
            System.exit(0);  
        }

        System.out.println("Informe o modelo do veículo:");
        String modeloVeiculo = scanner.nextLine();

        System.out.println("Informe o ano do veículo:");
        int anoVeiculo = scanner.nextInt();

        Veiculo veiculo = new Veiculo(modeloVeiculo, anoVeiculo);

        veiculo.setMotorista(motorista);

        veiculo.exibirInformacoes();

        boolean continuar = true;
        while (continuar) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Aumentar velocidade");
            System.out.println("2. Diminuir velocidade");
            System.out.println("3. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o valor para aumentar a velocidade:");
                    int aumento = scanner.nextInt();
                    veiculo.aumentarVelocidade(aumento);
                    veiculo.exibirInformacoes();
                    break;

                case 2:
                    System.out.println("Informe o valor para diminuir a velocidade:\n");
                    int reducao = scanner.nextInt();
                    veiculo.diminuirVelocidade(reducao);
                    veiculo.exibirInformacoes();
                    break;

                case 3:
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }

	}

