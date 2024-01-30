package br.com.ada.pooii.aula02.exercicio_1.exercicio_resolvido;

public class Carro implements VeiculoMotorizado {
    @Override
    public void ligar() {
        System.out.println("Carro ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Carro desligado");
    }

    @Override
    public void acelerar(int velocidade) {
        System.out.println("Carro acelerando a " + velocidade + " km/h");
    }

    @Override
    public void frear() {
        System.out.println("Carro freando");
    }
}

