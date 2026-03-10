package br.com.fiapride.model;
import java.util.Scanner;

public class Carro {
    Scanner in = new Scanner(System.in);
    public String modelo;
    public String placa;
    public String cor;
    public String marca;
    public int anoModelo;

    public void criarCarro(String modelo, String placa, String cor, String marca, int anoModelo) {
        setModelo(modelo);
        setPlaca(placa);
        setCor(cor);
        setMarca(marca);
        setAnoModelo(anoModelo);
        System.out.println("Carro adicionado: ");
        exibirCarro(getModelo(), getPlaca(), getCor(), getMarca(), getAnoModelo());
    }

    public void exibirCarro(String modelo, String placa, String cor, String marca, int anoModelo) {
        System.out.println("-----Exibir carro-----");
        System.out.println("Modelo: " + getModelo());
        System.out.println("Placa: " + getPlaca());
        System.out.println("Cor: " + getCor());
        System.out.println("Marca: " + getMarca());
        System.out.println("Ano do modelo: " + getAnoModelo());
    }


    public void setModelo (String modelo){
        if (modelo == ""){
            System.out.println("Modelo do carro não pode ser vazio.");
            return;
        }
        this.modelo = modelo;
        System.out.println("Modelo do carro alterado para: "+ this.modelo);
    }
    public void pintarCarro(int escolha){
        switch (escolha){
            default:
                System.out.println("Cor inválida, tente novamente.");
                return;
            case 1:
                setCor("Vermelho");
                break;
            case 2:
                setCor("Azul");
                break;
            case 3:
                setCor("Preto");
                break;
            case 4:
                setCor("Branco");
                break;

        }
        System.out.println("Cor do carro alterado para: " + this.cor);
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public String getCor() {
        return cor;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }
}
