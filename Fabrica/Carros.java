package Fabrica;

class Carro {
			
	String tipo;
	String cor;
	String placa;
	int numPortas;
	int cambio;
	Pessoa dono;

	Carro() {

	};
	
	Pessoa getDono() {
		return dono;
	}

	void setDono(Pessoa dono) {
		this.dono = dono;
	}

	void setCor(String c){
		cor = c;
	}		
	String getCor(){
		return cor;
	}

	String getTipo(){
		return tipo;
	}

	void setTipo(String tipo){
		this.tipo = tipo;
	}

	String getPlaca(){
		return placa;
	}
	void setPlaca(String placa){
		this.placa = placa;
	}

	int getNumPortas(){
		return numPortas;
	}
	void setNumPortas(int numPortas){
		this.numPortas = numPortas;
	}

	int getCambio() {
		return this.cambio;
	}

	void setCambio(int marcha) {
		this.cambio = marcha;
	}
	
	void ligar() {
		System.out.println("carro ligado.");
	}

	void desligar() {
		System.out.println("carro desligado.");
	}

	void acelerar() {
		System.out.println("carro acelerando.");
	}

	void frear() {
		System.out.println("carro freando.");
	}
 }