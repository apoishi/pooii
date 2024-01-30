package br.com.ada.pooii.aula02.exercicio_resolvido;

public class Moto implements VeiculoMotorizado {
    @Override
    public void ligar() {
        System.out.println("Moto ligada");
    }

    @Override
    public void desligar() {
        System.out.println("Moto desligada");
    }

    @Override
    public void acelerar(int velocidade) {
        System.out.println("Moto acelerando a " + velocidade + " km/h");
    }

    @Override
    public void frear() {
        System.out.println("Moto freando");
    }
}
