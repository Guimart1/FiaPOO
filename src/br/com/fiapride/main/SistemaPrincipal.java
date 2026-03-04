package br.com.fiapride.main;
import br.com.fiapride.model.Carro;
import br.com.fiapride.model.Passageiro;
import java.util.Scanner;
public class SistemaPrincipal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // INSTANCIAÇÃO
        // O comando 'new' aloca memória para um novo objeto.
        // Criando o primeiro passageiro (Objeto 1)
        Passageiro passageiro1 = new Passageiro();
        passageiro1.nome = "Ana Silva";
        passageiro1.saldo = 50.0;

        // Criando o segundo passageiro (Objeto 2)
        Passageiro passageiro2 = new Passageiro();
        passageiro2.nome = "Carlos Souza";
        passageiro2.saldo = 12.50;

        // Criando objeto (carro2)
        Carro carro1 = new Carro();
        carro1.modelo = "Onix";
        carro1.cor = "Preto";
        carro1.anoModelo = 2023;
        carro1.marca = "Chevrolet";
        carro1.placa = "ENN2981";

        // Criando objeto (carro2)
        Carro carro2 = new Carro();
        carro2.modelo = "Cronos";
        carro2.cor = "Preto";
        carro2.anoModelo = 2025;
        carro2.marca = "Fiat";
        carro2.placa = "FHO1133";

        // Exibindo os dados no Console
        System.out.println("--- Sistema FiapRide ---");
        System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$" + passageiro1.saldo);

        System.out.println("Carro: " + carro1.marca + " " + carro1.modelo + " | Cor: " + carro1.cor + " | Ano do modelo: " + carro1.anoModelo + " | Placa: " + carro1.placa + "\n");
        System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$" + passageiro2.saldo);
        System.out.println("Carro: " + carro2.marca + " " + carro2.modelo + " | Cor: " + carro2.cor + " | Ano do modelo: " + carro2.anoModelo + " | Placa: " + carro2.placa);

        System.out.println("---------------------");

        System.out.println("Altere o modelo do seu carro: ");
        String modelo = in.nextLine();
        carro1.setModelo(modelo);

        System.out.println("---------------------");

        System.out.println("Pinte o seu carro: ");
        System.out.println("Cores: \n1-Vermelho\n2-Azul\n3-Preto\n4-Branco");
        int escolha = in.nextInt();
        carro1.pintarCarro(escolha);

        System.out.println("Carro: " + carro1.marca + " " + carro1.modelo + " | Cor: " + carro1.cor + " | Ano do modelo: " + carro1.anoModelo + " | Placa: " + carro1.placa + "\n");
    }
}
