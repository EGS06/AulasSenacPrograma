package Orientacao_a_Objeto;

import java.util.function.Function;

public class Heranca {
	public static void main(String[] args) {
		Veiculo carro = new Veiculo("Modelo1", 2024, "Azul", 4, 4, "Motor1", 4, 600, true);
		carro.mostrarVeiculo();

	}

	public static class Veiculo {
		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public int getAno() {
			return ano;
		}

		public void setAno(int ano) {
			this.ano = ano;
		}

		public String getCor() {
			return cor;
		}

		public void setCor(String cor) {
			this.cor = cor;
		}

		public int getPortas() {
			return portas;
		}

		public void setPortas(int portas) {
			this.portas = portas;
		}

		public int getRodas() {
			return rodas;
		}

		public void setRodas(int rodas) {
			this.rodas = rodas;
		}

		public int getCapacidadePassageiros() {
			return capacidadePassageiros;
		}

		public void setCapacidadePassageiros(int capacidadePassageiros) {
			this.capacidadePassageiros = capacidadePassageiros;
		}

		public String getMotor() {
			return motor;
		}

		public void setMotor(String motor) {
			this.motor = motor;
		}

		public float getVelocidade() {
			return velocidade;
		}

		public void setVelocidade(float velocidade) {
			this.velocidade = velocidade;
		}

		public boolean isLigado() {
			return ligado;
		}

		public void setLigado(boolean ligado) {
			this.ligado = ligado;
		}

		public Veiculo(String modelo, int ano, String cor, int portas, int rodas, String motor,
				int capacidadePassageiros, float velocidade, boolean ligado) {
			this.modelo = modelo;
			this.ano = ano;
			this.cor = cor;
			this.portas = portas;
			this.rodas = rodas;
			this.motor = motor;
			this.capacidadePassageiros = capacidadePassageiros;
			this.velocidade = velocidade;
			this.ligado = ligado;
		}

		public void mostrarVeiculo() {
			System.out.println("Modelo: " + this.modelo + " Ano: " + this.ano + " Cor: " + this.cor);
			System.out.println("Quantidade de portas: " + this.portas);
			System.out.println("Motor: " + this.rodas);
			System.out.println("Quantidade de Rodas:" + this.motor);
			System.out.println("Capacidade de Passageiros: " + this.capacidadePassageiros);
			System.out.println("Velocidade: " + this.velocidade + "Km/h");
			if (ligado == true) {
				System.out.println("Ligado: esta ligado");
			} else {
				System.out.println("Ligado: esta desligado");
			}
		}

		String modelo;
		int ano;
		String cor;
		int portas;
		int rodas;
		int capacidadePassageiros;
		String motor;
		float velocidade;
		boolean ligado = false;
	}

	public static class Carro extends Veiculo {

		public Carro(String modelo, int ano, String cor, int portas, int rodas, String motor, int capacidadePassageiros,
				float velocidade, boolean ligado) {
			super(modelo, ano, cor, portas, rodas, motor, capacidadePassageiros, velocidade, ligado);
		}

	}

	public static class Moto extends Veiculo {

		public Moto(String modelo, int ano, String cor, int portas, int rodas, String motor, int capacidadePassageiros,
				float velocidade, boolean ligado) {
			super(modelo, ano, cor, portas, rodas, motor, capacidadePassageiros, velocidade, ligado);
		}

	}

}
