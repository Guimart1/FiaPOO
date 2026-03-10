package br.com.fiapride.main;

import br.com.fiapride.model.Carro;
import br.com.fiapride.model.Passageiro;

import java.util.Scanner;

public class testeCarro {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("--------Teste Objeto Carro-------");
        System.out.println("Adicione o seu carro: ");
        System.out.println("Deseja adicionar um carro? \n 1 - Sim\n 2 - Não");
        int escolha = in.nextInt();
        if (escolha == 1){
            System.out.println("Digite o modelo do carro: ");
            String modelo = in.next();
            System.out.println("Digite a placa do carro: ");
            String placa = in.next();
            System.out.println("Digite a cor do carro: ");
            String cor = in.next();
            System.out.println("Digite a marca do carro: ");
            String marca = in.next();
            System.out.println("Digite o ano do carro: ");
            int anoModelo = in.nextInt();
            Carro carro1 = new Carro();
            carro1.criarCarro(modelo, placa, cor, marca, anoModelo);
        }else if (escolha == 2) {
            System.out.println("Encerrando programa....");
        }

    }
}
