package br.com.ada.pooii.aula02.exercicio_1.exercicio_resolvido;

public abstract class Bicicleta implements Veiculo {

    @Override
    public void acelerar(int velocidade) {
        System.out.println("Bicicleta pedalando a " + velocidade + " km/h");
    }

    @Override
    public void frear() {
        System.out.println("Bicicleta freando");
    }
}
