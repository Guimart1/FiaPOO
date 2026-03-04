package br.com.fiapride.model;

public class Carro {
    public String modelo;
    public String placa;
    public String cor;
    public String marca;
    public int anoModelo;

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
                this.cor = "Vermelho";
                break;
            case 2:
                this.cor = "Azul";
                break;
            case 3:
                this.cor = "Preto";
                break;
            case 4:
                this.cor = "Branco";
                break;

        }
        System.out.println("Cor do carro alterado para: " + this.cor);
    }
}
